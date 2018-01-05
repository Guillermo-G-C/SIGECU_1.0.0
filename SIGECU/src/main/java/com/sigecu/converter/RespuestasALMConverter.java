package com.sigecu.converter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.sigecu.entity.RespuestaALMEntity;
import com.sigecu.model.RespuestaALMModel;

/**
 * @author Anel
 *
 */
@Component("RespuestasALMConverter")
public class RespuestasALMConverter {
	private static final Log LOG = LogFactory.getLog(RespuestasALMConverter.class);

	// Entity to Model
	
	public RespuestaALMModel converterRespuestaALMToRespuestasModel(RespuestaALMEntity respuesta) {
		
		RespuestaALMModel resModel = new RespuestaALMModel();
		resModel.setIdrespuestaALM(respuesta.getIdrespuestaALM());
		
		
	}
	

}
