package com.bluedot.efactura.pollers;

import java.util.List;
import java.util.Set;

import javax.persistence.Query;

import org.slf4j.Logger;

import com.bluedot.commons.error.APIException;
import com.bluedot.commons.utils.DatabaseExecutor;
import com.bluedot.commons.utils.DatabaseExecutor.PromiseBlock;

import play.db.jpa.JPA;

public abstract class PollerRunner implements Runnable {

	private static final long INTERVAL = 1000L;

	private Logger logger;

	private String sql;

	private long sleepTimeInMillis;

	private long runs;

	public PollerRunner(Logger logger, long sleepTimeInMillis) {
		super();
		this.logger = logger;
		this.sleepTimeInMillis = sleepTimeInMillis;
		runs = 0;
	}

	public void run() {

		while (!PollerManager.shutdownInProgress) {
			try {
				if (INTERVAL * runs > sleepTimeInMillis) {
					runs = 0;
					try {
						DatabaseExecutor.syncDatabaseAction(new PromiseBlock<Void>() {
							public Void execute() {

								try {
									executeConcreteAction();
								} catch (APIException e) {
									e.printStackTrace();
								}

								return null;
							}

						}, true);

					} catch (Throwable e) {
						e.printStackTrace();
					}
				}
				runs++;
				logger.debug("Finaliza Procesamiento de Pedidos ...");
				Thread.sleep(INTERVAL);

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	protected abstract void executeConcreteAction() throws APIException;

}