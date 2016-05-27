package com.bluedot.efactura.services.impl;

import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Objects;

import com.bluedot.efactura.global.EFacturaException;
import com.bluedot.efactura.pool.WSPersonaGetActEmpresarialSoapPortWrapper;
import com.bluedot.efactura.pool.WSRutPool;
import com.bluedot.efactura.services.ConsultaRutService;

import dgi.soap.rut.WSPersonaGetActEmpresarialExecute;
import dgi.soap.rut.WSPersonaGetActEmpresarialExecuteResponse;

public class ConsultaRutServiceImpl implements ConsultaRutService {

    @Override
    public String getRutData(String rut) {
        try
		{
			Objects.requireNonNull(rut, "Parameter RUT is required");

			WSPersonaGetActEmpresarialSoapPortWrapper portWrapper = WSRutPool.getInstance().checkOut();

			WSPersonaGetActEmpresarialExecute input = new WSPersonaGetActEmpresarialExecute();
			input.setRut(rut);
			
			WSPersonaGetActEmpresarialExecuteResponse output = portWrapper.getPort().execute(input);
			
			WSRutPool.getInstance().checkIn(portWrapper);

			return output.getData();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EFacturaException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (KeyStoreException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CertificateException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return null;
    }
}