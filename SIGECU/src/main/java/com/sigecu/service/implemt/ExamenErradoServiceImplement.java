/**
 * 
 */
package com.sigecu.service.implemt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sigecu.converter.PreguntasConverter;
import com.sigecu.converter.RespuestasConverter;
import com.sigecu.entity.AsignaExamenEntity;
import com.sigecu.entity.Evaluaciones;
import com.sigecu.entity.Preguntas;
import com.sigecu.entity.RespuestaALMEntity;
import com.sigecu.entity.Respuestas;
import com.sigecu.model.EvaluacionesModel;
import com.sigecu.model.PreguntasModel;
import com.sigecu.model.RespuestasModel;
import com.sigecu.repository.AsignaExamenRepository;
import com.sigecu.repository.EvaluacionRepository;
import com.sigecu.repository.PreguntasRepository;
import com.sigecu.repository.QueryEvaluacion;
import com.sigecu.repository.RespuestasRepository;
import com.sigecu.service.ExamenErradoService;

/**
 * @author Anel
 *
 */
@Service ("ExamenErradoServiceImplement")
public class ExamenErradoServiceImplement implements ExamenErradoService {
	
	private static final Log LOG = LogFactory.getLog(ExamenErradoServiceImplement.class);


	@Autowired
	@Qualifier("preguntasConverter")
	private PreguntasConverter preguntasConverter;
	
	@Autowired
	@Qualifier("preguntasRepository")
	private PreguntasRepository preguntasRepository;

	@Autowired
	@Qualifier("queryEvaluacion")
	private QueryEvaluacion queryEvaluacion;
	
	@Autowired
	@Qualifier("respuestasRepository")
	private RespuestasRepository respuestasRepository;

	@Autowired
	@Qualifier("respuestasConverter")
	private RespuestasConverter respuestasConverter;
	@Autowired
	@Qualifier("evaluacionesRepository")
	private EvaluacionRepository evaluacionesRepository;
	@Autowired
	@Qualifier("asignaExamenRepository")
	private AsignaExamenRepository asignaExamenRepository;

	
	@Override
	public List<PreguntasModel> listarPreguntasByExamErrado(int idEvaluacion, int idAsignaExamen){
		Evaluaciones eval = evaluacionesRepository.findByIdEvaluacion(idEvaluacion);
		List<Preguntas> preguntas = preguntasRepository.findByEvaluaciones(eval);
		AsignaExamenEntity asignaExamen = asignaExamenRepository.findByIdasignaExamen(idAsignaExamen);
		Iterator<RespuestaALMEntity> iterAsignaExam = asignaExamen.getRespuestasAML().iterator(); // iterator de
																									// respuestaALM
		List<PreguntasModel> preguntasNoModel = new ArrayList<>();
		List<PreguntasModel> preguntasSiModel = new ArrayList<>();
		List<PreguntasModel> totalPreguntas = new ArrayList<>();
		List<RespuestaALMEntity> respuestasALMEntity = new ArrayList<>();
		while (iterAsignaExam.hasNext()) {
			respuestasALMEntity.add(iterAsignaExam.next());
		}
		LOG.info("TAMAÑO de RESPUESTAS ALM: " + asignaExamen.getRespuestasAML().size());
		for (Preguntas pregunta : preguntas) {
			PreguntasModel preguntaModel = preguntasConverter.converterPreguntasToPreguntasModelAndRespuestas(pregunta);
			totalPreguntas.add(preguntaModel);
			for (Respuestas resp : pregunta.getRespuestas()) {
				//Iterator <RespuestasALMEntity> 
				if(respuestasALMEntity.contains(resp) && !(resp.getrSolucion().equals("1"))) {
					preguntasNoModel.add(preguntaModel);
				}	
			}
		}
		for (PreguntasModel pregunta : totalPreguntas) {
			if (!preguntasNoModel.contains(pregunta)) {
				preguntasSiModel.add(pregunta);
				LOG.info("PREGUNTA AGREGADA: " + pregunta.toString());
			}
		}
		LOG.info("PREGUNTAS AGREGADAS: " + preguntasSiModel.size());
		LOG.info("PREGUNTAS No AGREGADAS: " + preguntasNoModel.size());
		LOG.info("PREGUNTAS tatales AGREGADAS: " + totalPreguntas.size());
		// preguntasModel.iterator().next();
		return preguntasSiModel;
	}

	
	@Override
	public List<RespuestasModel> listarRespuestas() {
		List<Respuestas> respuestas = respuestasRepository.findAll();
		List<RespuestasModel> respModel = new ArrayList<RespuestasModel>();
		for (Respuestas resp : respuestas) {
			respModel.add(respuestasConverter.converterRespuestasToRespuestasModel(resp));
		}
		return respModel;
	}


	@Override
	public List<EvaluacionesModel> listAllEvaluaciones(int idCurso) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<RespuestasModel> listarRespuestas(int idExamen) {
		// TODO Auto-generated method stub
		return null;
	}



}
