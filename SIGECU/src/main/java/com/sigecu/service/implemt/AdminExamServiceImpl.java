package com.sigecu.service.implemt;

import java.util.ArrayList;
import java.util.List;

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
import com.sigecu.service.AdminExamService;


@Service("adminExamServiceImpl")
public class AdminExamServiceImpl implements AdminExamService {

	/* (non-Javadoc)
	 * @see com.sigecu.service.AdminExamService#listAllEvaluaciones()
	 */
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

	@Override
	public List<EvaluacionesModel> listAllEvaluaciones() {
		// TODO Auto-generated method stub
		List<Evaluaciones> evaluaciones = evaluacionesRepository.findAll();
		List<EvaluacionesModel> evaluacionModel = new ArrayList<EvaluacionesModel>();;
		for(Evaluaciones evaluacion: evaluaciones) {
			//evaluacionModel.add(evaluacionConverter.convertEvaluacionModel2Evaluacion(evaluacion));
		}
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
