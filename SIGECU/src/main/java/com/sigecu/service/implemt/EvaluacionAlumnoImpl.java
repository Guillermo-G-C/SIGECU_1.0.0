package com.sigecu.service.implemt;

import org.apache.commons.logging.LogFactory;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.sigecu.converter.CursosConverter;
import com.sigecu.converter.EvaluacionAlumnoConverter;
import com.sigecu.converter.EvaluacionConverter;
import com.sigecu.entity.Cursos;
import com.sigecu.entity.Evaluaciones;
import com.sigecu.model.CursoModel;
import com.sigecu.model.EvaluacionesModel;
import com.sigecu.repository.CursosRepository;
import com.sigecu.repository.EvaluacionAlumnoRepository;
import com.sigecu.repository.EvaluacionRepository;
import com.sigecu.repository.QueryEvaAlumno;
import com.sigecu.repository.QueryEvaluacion;
import com.sigecu.service.EvaluacionAlumnoService;

@Service("evaluacionAlumnoServiceImpl")

public class EvaluacionAlumnoImpl  implements EvaluacionAlumnoService{
	
	private static final Log LOG = LogFactory.getLog(EvaluacionAlumnoImpl.class);
	
	@Autowired
	@Qualifier("evaluacionAlumnoRepository")
	private EvaluacionAlumnoRepository evaluacionAlumnoRepository;

	@Autowired
	@Qualifier("evaluacionesRepository")
	private EvaluacionRepository evaluacionesRepository;

	@Autowired
	@Qualifier("evalaucionesConverter")
	private EvaluacionConverter evaluacionConverter;
	
	@Autowired
	@Qualifier("queryEvaAlumno")
	private QueryEvaAlumno queryEvaAlumno;

	@Autowired
	@Qualifier("cursoRepository")
	private CursosRepository cursoRepository;
	@Autowired
	@Qualifier("cursosConvertir")
	private CursosConverter cursosConverter;
	
	
	
	@Override
	public List<EvaluacionesModel> listAllEvaluaciones(int idCurso) {
		List<Evaluaciones> evaluaciones = queryEvaAlumno.findAllExamenesById(idCurso);
		List<EvaluacionesModel> evaluacionModel = new ArrayList<EvaluacionesModel>();

		for (Evaluaciones evaluacion : evaluaciones) {
			evaluacionModel.add(evaluacionConverter.convertEvaluacion2EvaluacionModel(evaluacion));
		}
		LOG.info("BUSCAR examen de CURSO " + idCurso);
		return evaluacionModel;
	}
	
	@Override
	public List<CursoModel> listaCursos() {
		List<Cursos> cursos = cursoRepository.findAll();
		List<CursoModel> cursoModel = new ArrayList<CursoModel>();
		for (Cursos curso : cursos) {
			cursoModel.add(cursosConverter.convertCursoToCursoModel(curso));
		}
		return cursoModel;
	}


/*	@Override
	public String BuscarNombreEva(int idEvaluacion) {
		Evaluaciones eva = evaluacionAlumnoRepository.findByIdEvaluacion(idEvaluacion);
		EvaluacionesModel eval = new  EvaluacionesModel();
		eval= evaluacionConverter.convertEvaluacion2EvaluacionModel(eva);
		return eval.geteNombre();
	}

	
*/
	
	
	
}
