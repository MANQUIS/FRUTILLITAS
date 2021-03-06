package com.bluedot.commons.hazelcast;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bluedot.commons.error.APIException;
import com.bluedot.commons.error.APIException.APIErrors;
import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientAwsConfig;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.client.config.ClientNetworkConfig;
import com.hazelcast.config.Config;
import com.hazelcast.config.XmlConfigBuilder;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

import play.Play;
import play.inject.ApplicationLifecycle;
import play.libs.F;

@Singleton
public class HazelcastFactory {

	private static HazelcastInstance hazelcastInstance;

	final static Logger logger = LoggerFactory.getLogger(HazelcastFactory.class);

	@Inject
    public HazelcastFactory(ApplicationLifecycle lifecycle) {
		
		if (hazelcastInstance==null){
		
			hazelcastInstance = createHazelcastInstance();
			
	        lifecycle.addStopHook(() -> {
	        	HazelcastClient.shutdownAll();
	        	hazelcastInstance.shutdown();
	        	return F.Promise.pure(null);
	        });
		}
        
    }

	private static Config getServerConfig() throws FileNotFoundException {
		String filePath = Play.application().path().getAbsolutePath() + "/conf/hazelcast.xml";

		logger.info("Trying file at: " + filePath);

		Config cfg = new XmlConfigBuilder(filePath).build();

		return cfg;
	}

	private ClientConfig getAWSClientConfig() throws IOException {
		ClientConfig clientConfig = new ClientConfig();
		ClientNetworkConfig clientNetworkConfig = new ClientNetworkConfig();
		ClientAwsConfig awsConfig = new ClientAwsConfig();

		awsConfig.setInsideAws(true);
		awsConfig.setEnabled(true);
		awsConfig.setAccessKey(Play.application().configuration().getString("aws.api.key"));
		awsConfig.setSecretKey(Play.application().configuration().getString("aws.api.secret"));
		awsConfig.setRegion(Play.application().configuration().getString("hazelcast.region"));
		awsConfig.setSecurityGroupName(Play.application().configuration().getString("hazelcast.securityGroupName"));
		awsConfig.setTagKey(Play.application().configuration().getString("hazelcast.tagKey"));
		awsConfig.setTagValue(Play.application().configuration().getString("hazelcast.tagValue"));

		clientConfig.setNetworkConfig(clientNetworkConfig.setAwsConfig(awsConfig));

		return clientConfig;
	}

	public HazelcastInstance getNewHazelcastClient(boolean throwExceptionWhenFail) throws APIException {
		return getNewHazelcastClient(throwExceptionWhenFail, 0);
	}

	public HazelcastInstance getNewHazelcastClient(boolean throwExceptionWhenFail, int retryAttempts)
			throws APIException {

		HazelcastInstance hazelcastInstance = null;

		for (int i = 0; (i <= retryAttempts) && (hazelcastInstance == null); i++) {
			try {
				logger.info("Attempting to create a new Hazelcast Client (attempt {})", i + 1);

				if (Play.isDev())
					hazelcastInstance = HazelcastClient.newHazelcastClient();
				else
					hazelcastInstance = HazelcastClient.newHazelcastClient(getAWSClientConfig());

				break;
			} catch (Throwable e) {
				if (throwExceptionWhenFail && i == retryAttempts) {
					e.printStackTrace();
					throw APIException.raise(APIErrors.HAZELCAST)
							.setDetailMessage("Could not instantiate new Hazelcast Client");
				}
			}
		}

		return hazelcastInstance;
	}

	private static synchronized HazelcastInstance createHazelcastInstance() {
		if (hazelcastInstance == null) {

			logger.info("Creating new hazelcast instance on this server");

			try {
				hazelcastInstance = Hazelcast.newHazelcastInstance(getServerConfig());

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

		}
		return hazelcastInstance;
	}

}
