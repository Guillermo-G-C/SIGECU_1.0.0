package com.sigecu.service.implemt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sigecu.component.EvaluacionConverter;
import com.sigecu.entity.Evaluaciones;
import com.sigecu.model.EvaluacionesModel;
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

	@Override
	public List<EvaluacionesModel> listAllEvaluaciones() {
		// TODO Auto-generated method stub
		List<Evaluaciones> evaluaciones = evaluacionesRepository.findAll();
		List<EvaluacionesModel> evaluacionModel = new ArrayList<EvaluacionesModel>();;
		for(Evaluaciones evaluacion: evaluaciones) {
			evaluacionModel.add(evaluacionConverter.convertEvaluacionModel2Evaluacion(evaluacion));
		}
		return evaluacionModel;
	}

	
}
