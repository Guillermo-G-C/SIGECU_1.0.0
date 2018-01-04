package com.sigecu.service.implemt;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.sigecu.converter.EvaluacionAlumnoConverter;
import com.sigecu.converter.EvaluacionConverter;
import com.sigecu.entity.Evaluaciones;
import com.sigecu.model.EvaluacionesModel;
import com.sigecu.repository.EvaluacionAlumnoRepository;
import com.sigecu.service.EvaluacionAlumnoService;

@Service("EvaluacionAlumnoImpl")

public class EvaluacionAlumnoImpl  implements EvaluacionAlumnoService{
	
	private static final Log LOG = LogFactory.getLog(EvaluacionAlumnoImpl.class);
	
	@Autowired
	@Qualifier("evaluacionAlumnRepository")
	private EvaluacionAlumnoRepository evaluacionAlumnRepository;

	@Autowired
	@Qualifier("evaluacionConverter")
	private EvaluacionConverter evaluacionConverter;
	
	@Override
	public String BuscarNombreEva(int idEvaluacion) {
		Evaluaciones eva = evaluacionAlumnRepository.findByIdEvaluacion(idEvaluacion);
		EvaluacionesModel eval = new  EvaluacionesModel();
		eval= evaluacionConverter.convertEvaluacion2EvaluacionModel(eva);
		return eval.geteNombre();
	}

	

	
	
	
}
