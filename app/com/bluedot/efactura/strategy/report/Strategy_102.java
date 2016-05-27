package com.bluedot.efactura.strategy.report;

import java.io.IOException;
import java.math.BigInteger;
import java.util.Date;

import javax.xml.datatype.DatatypeConfigurationException;

import com.bluedot.efactura.impl.CAEManagerImpl.TipoDoc;

import dgi.classes.reporte.ReporteDefType;
import dgi.classes.reporte.RsmnDataTck;

public class Strategy_102 implements SummaryStrategy {

private TipoDoc tipoDoc = TipoDoc.Nota_de_Credito_de_eTicket;
	
	@Override
	public void buildSummary(ReporteDefType reporte, Date date) {
		try {
			ReporteDefType.RsmnTckNotaCredito resumen = new ReporteDefType.RsmnTckNotaCredito();
			resumen.setTipoComp(new BigInteger(String.valueOf(tipoDoc.value)));

			RsmnDataTck data = new RsmnDataTck();
			SummaryDatatype summary = SummaryStrategy.getSummary(tipoDoc, date);

			data.setCantDocsAnulados(new BigInteger(String.valueOf(summary.cantDocRechazados + summary.cantDocSinRespuesta)));
			data.setCantDocsEmi(new BigInteger(String.valueOf(summary.cantDocAceptados)));
			data.setCantDocsUtil(new BigInteger(String.valueOf(summary.cantDoc)));
			data.setRngDocsAnulados(summary.rngDocsAnulados);
			data.setRngDocsUtil(summary.rngDocsUtil);
			data.setMontos(SummaryStrategy.getMontosFyT(summary));
			data.setCantDocsMayTopeUI(new BigInteger(String.valueOf(summary.mayor10000UI)));

			resumen.setRsmnData(data);
			
			reporte.getCaratula().setCantComprobantes(reporte.getCaratula().getCantComprobantes().add(data.getCantDocsUtil()));
			
			reporte.setRsmnTckNotaCredito(resumen);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatatypeConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}