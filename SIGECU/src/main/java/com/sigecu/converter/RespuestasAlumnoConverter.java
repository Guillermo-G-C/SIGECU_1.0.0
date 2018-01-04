package com.sigecu.converter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sigecu.entity.RespuestaALMEntity;
import com.sigecu.model.RespuestaALMModel;
import com.sigecu.model.RespuestasModel;

@Component("respuestasAlumConverter")
public class RespuestasAlumnoConverter {
	
	private static final Log LOG = LogFactory.getLog(RespuestasAlumnoConverter.class);
	
	@Autowired
	@Qualifier("respuestasConverter")
	private RespuestasConverter respuconvert;
	// entity -- to -- model
	public RespuestaALMModel converterRespuestaALMEntitytoRespuestaALMModel(RespuestaALMEntity respalmEnt) {
		RespuestaALMModel resalumnomodel = new RespuestaALMModel();
		
		RespuestasModel respuesta = respuconvert.converterRespuestasToRespuestasModel(respalmEnt.getRespuestas());
		resalumnomodel.setIdrespuestaALM(respalmEnt.getIdrespuestaALM());
		resalumnomodel.setRespuestaModel(respuesta);
		resalumnomodel.setSeleccionada(respalmEnt.getSeleccionada());
		
		LOG.info("Conversion correcta: RESPUESTAALM A RESPUESTA MODEL");	
	
		return resalumnomodel;
	}
	
	// model -- to -- entity
	public RespuestaALMEntity converterRespuestaALMModelToRespuestaALMEntity(RespuestaALMModel respuestasAlumnoModel) {
		RespuestaALMEntity resEntity = new RespuestaALMEntity();
		resEntity.setIdrespuestaALM(respuestasAlumnoModel.getIdrespuestaALM());
		resEntity.setSeleccionada(respuestasAlumnoModel.getSeleccionada());
		return resEntity;
		
	}
	
}
