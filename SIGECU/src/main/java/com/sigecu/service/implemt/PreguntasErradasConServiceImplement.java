/**
 * 
 */
package com.sigecu.service.implemt;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sigecu.converter.CursosConverter;
import com.sigecu.converter.EvaluacionConverter;
import com.sigecu.converter.PreguntasConverter;
import com.sigecu.converter.RespuestasConverter;
import com.sigecu.entity.Cursos;
import com.sigecu.entity.Evaluaciones;
import com.sigecu.entity.Preguntas;
import com.sigecu.entity.RespuestaALMEntity;
import com.sigecu.entity.Respuestas;
import com.sigecu.model.CursoModel;
import com.sigecu.model.EvaluacionesModel;
import com.sigecu.model.PreguntasModel;
import com.sigecu.model.RespuestaALMModel;
import com.sigecu.model.RespuestasModel;
import com.sigecu.repository.CursosRepository;
import com.sigecu.repository.QueryEvaluacion;
import com.sigecu.repository.RespuestasRepository;
import com.sigecu.repository.respuestaALMRepository;
import com.sigecu.service.PreguntasErradasConService;

/**
 * @author Dell
 *
 */

@Service("preErradasServiceImpl")
public class PreguntasErradasConServiceImplement implements PreguntasErradasConService{

	private static final Log LOG = LogFactory.getLog(PreguntasErradasConServiceImplement.class);
	@Autowired
	@Qualifier("cursoRepository")
	private CursosRepository cursoRepository;
	@Autowired
	@Qualifier("cursosConvertir")
	private CursosConverter cursosConverter;

	@Autowired
	@Qualifier("queryEvaluacion")
	private QueryEvaluacion queryEvaluacion;

	@Autowired
	@Qualifier("evalaucionesConverter")
	private EvaluacionConverter evaluacionConverter;

	@Autowired
	@Qualifier("preguntasConverter")
	private PreguntasConverter preguntasConverter;

	@Autowired
	@Qualifier("respuestasRepository")
	private RespuestasRepository respuestasRepository;

	@Autowired
	@Qualifier("respuestasConverter")
	private RespuestasConverter respuestasConverter;
	
	@Autowired
	@Qualifier("respuestasALMRepository")
	private respuestaALMRepository respuestaALMRepository;
	@Override
	public List<Respuestas> listarPreguntasHerradas() {
		// TODO Auto-generated method stub
		return null;
	}
 //listar Evaluaiones
	@Override
	public List<EvaluacionesModel> listarEvaluaciones(int idCurso) {
		List<Evaluaciones> evaluaciones = queryEvaluacion.findAllExamenesById(idCurso);
		List<EvaluacionesModel> evaluacionModel = new ArrayList<EvaluacionesModel>();

		for (Evaluaciones evaluacion : evaluaciones) {
			evaluacionModel.add(evaluacionConverter.convertEvaluacion2EvaluacionModel(evaluacion));
		}
		LOG.info("BUSCAR examen de CURSO " + idCurso);
		return evaluacionModel;
	}
	
	//listar CUrsos
	public List<CursoModel> listaCursos() {
		List<Cursos> cursos = cursoRepository.findAll();
		List<CursoModel> cursoModel = new ArrayList<CursoModel>();
		for (Cursos curso : cursos) {
			cursoModel.add(cursosConverter.convertCursoToCursoModel(curso));
		}
		return cursoModel;
	}
	@Override
	public List<PreguntasModel> listarPregunrasByExam(int idExamen) {
		List<Preguntas> listPreguntas = queryEvaluacion.findAllPreguntasById(idExamen);
		List<PreguntasModel> preguntasModel = new ArrayList<PreguntasModel>();

		for (Preguntas preg : listPreguntas) {
			preguntasModel.add(preguntasConverter.converterPreguntasToPreguntasModelAndRespuestas(preg));
		}
		LOG.info(preguntasModel.iterator().next().getRespuestasModel().iterator().next().getPregunta());
		return preguntasModel;
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
	public List<RespuestaALMModel> listarRespuestasAlumno() {
		List<RespuestaALMEntity> respuestasALumno = respuestaALMRepository.findAll();
		List <RespuestaALMModel> respuestaALMo = new ArrayList<RespuestaALMModel>();
		for(RespuestaALMEntity ressal : respuestasALumno) {
			//respuestaALMo.add(RespuestasAlumno.converterRespuestaALMEntitytoRespuestaALMModel(ressal));
			LOG.info("Lista de respuestas del alumno fue correcot " );
		}
		
		return respuestaALMo;
	}
	
	

}
