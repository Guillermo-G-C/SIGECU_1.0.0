/**
 * 
 */
package com.sigecu.converter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.sigecu.entity.Preguntas;
import com.sigecu.entity.Respuestas;
import com.sigecu.model.RespuestasModel;

/**
 * @author Rolando Castillo
 * @contact castillomartinez@acm.org
 * @Fecha 17/12/2017
 *
 */
@Component("respuestasConverter")
public class RespuestasConverter {
	private static final Log LOG = LogFactory.getLog(RespuestasConverter.class);
	
	//entity -- to -- model
	public RespuestasModel converterRespuestasToRespuestasModel(Respuestas respuestas) {
		RespuestasModel respModel = new RespuestasModel();
		respModel.setIdRespuesta(respuestas.getIdRespuesta());
		respModel.setrSolucion(respuestas.getrSolucion());
		respModel.setPregunta(respuestas.getPreguntas());
		respModel.setrRespuesta(respuestas.getrRespuesta());
		
		return respModel;
		
	}
	//model -- to -- entity
	public Respuestas converterRespuestasModelToRespuestas (RespuestasModel respuestasModel, Preguntas preguntas) {
		Respuestas resp = new Respuestas();
		resp.setPreguntas(preguntas);
		resp.setrRespuesta(respuestasModel.getrRespuesta());
		resp.setrSolucion(respuestasModel.getrSolucion());
		
		return resp;
	}
}
