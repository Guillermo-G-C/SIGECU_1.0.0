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
import com.sigecu.entity.Cursos;
import com.sigecu.entity.Evaluaciones;
import com.sigecu.model.CursoModel;
import com.sigecu.model.EvaluacionesModel;
import com.sigecu.repository.CursosRepository;
import com.sigecu.repository.EvaluacionRepository;
import com.sigecu.repository.QueryEvaluacion;
import com.sigecu.service.AdminExamService;


@Service("adminExamServiceImpl")
public class AdminExamServiceImpl implements AdminExamService {

	/* (non-Javadoc)
	 * @see com.sigecu.service.AdminExamService#listAllEvaluaciones()
	 */
	private static final Log LOG = LogFactory.getLog(AdminExamServiceImpl.class);
	@Autowired
	@Qualifier("evaluacionesRepository")
	private EvaluacionRepository evaluacionesRepository;
	
	@Autowired
	@Qualifier("evalaucionesConverter")
	private EvaluacionConverter evaluacionConverter;
	
	@Autowired
	@Qualifier("cursoRepository")
	private CursosRepository cursoRepository;
	@Autowired
	@Qualifier("cursosConvertir")
	private CursosConverter cursosConverter;
	
	@Autowired
	@Qualifier("queryEvaluacion")
	private QueryEvaluacion queryEvaluacion;

	@Override
	public List<EvaluacionesModel> listAllEvaluaciones(int idCurso) {
		List<Evaluaciones> evaluaciones = queryEvaluacion.findAllExamenesById(idCurso);
		List<EvaluacionesModel> evaluacionModel = new ArrayList<EvaluacionesModel>();
		
		for(Evaluaciones evaluacion: evaluaciones) {
			evaluacionModel.add(evaluacionConverter.convertEvaluacion2EvaluacionModel(evaluacion));
		}
		LOG.info("BUSCAR examen de CURSO "+idCurso);
		return evaluacionModel;
	}

	/* (non-Javadoc)
	 * @see com.sigecu.service.AdminExamService#listaCursos()
	 */
	@Override
	public List<CursoModel> listaCursos() {
		List<Cursos> cursos = cursoRepository.findAll();
		List<CursoModel> cursoModel = new ArrayList<CursoModel>();
		for(Cursos curso: cursos) {
			cursoModel.add(cursosConverter.convertCursoToCursoModel(curso));
		}
		return cursoModel;
	}

	
}
