package com.sigecu.service.implemt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sigecu.converter.EvaluacionConverter;
import com.sigecu.converter.RespuestasALMConverter;
import com.sigecu.entity.Evaluaciones;
import com.sigecu.entity.RespuestaALMEntity;
import com.sigecu.model.EvaluacionesModel;
import com.sigecu.model.RespuestaALMModel;
import com.sigecu.repository.CalificacionRepository;
import com.sigecu.repository.EvaluacionRepository;
import com.sigecu.service.CalificacionService;

@Service("CalificacionImplement")

public class CalificacionImplement implements CalificacionService {
	private static final Log LOG = LogFactory.getLog(CalificacionImplement.class);
	/*
	@Autowired
	@Qualifier("calificacionRepository")
	private CalificacionRepository calificacionRepository;
	
	@Autowired
	@Qualifier("RespuestasALMConverter")
	private RespuestasALMConverter respuestaAlumnConverter;
	
	
	public String aciertosPregunta(int idrespuestaALM) {
		calificacionRepository.findT_Respuestas().
		RespuestaALMEntity resp= calificacionRepository.findByidrespuestaALM(idrespuestaALM);
	    RespuestaALMModel respmodel = respuestaAlumnConverter.converterRespuestaALMToRespuestasModel(resp);
		LOG.error(respmodel.getSeleccionada());
	    return respmodel.toString();
	}
	*/
	
	
	@Autowired
	@Qualifier("calificacionRepository")
	private CalificacionRepository calificacionRepository;
	
	
	public String aciertosPregunta() {
		
	    return calificacionRepository.aciertos()+"";
	}


	@Override
	public String erroresPregunta() {
		// TODO Auto-generated method stub
		return calificacionRepository.erroneas()+"";
	}


	@Override
	public String calificacionFnl(int idEvaluacion) {
		// TODO Auto-generated method stub
		return calificacionRepository.calificacion(idEvaluacion)+"";
	}

}
