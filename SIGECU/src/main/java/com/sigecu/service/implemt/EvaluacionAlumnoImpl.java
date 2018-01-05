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

@Service("evaluacionAlumnoServiceImpl")

public class EvaluacionAlumnoImpl  implements EvaluacionAlumnoService{
	
	private static final Log LOG = LogFactory.getLog(EvaluacionAlumnoImpl.class);
	
	@Autowired
	@Qualifier("evaluacionAlumnoRepository")
	private EvaluacionAlumnoRepository evaluacionAlumnoRepository;

	@Autowired
	@Qualifier("evalaucionesConverter")
	private EvaluacionConverter evaluacionConverter;
	
	@Override
	public String BuscarNombreEva(int idEvaluacion) {
		Evaluaciones eva = evaluacionAlumnoRepository.findByIdEvaluacion(idEvaluacion);
		EvaluacionesModel eval = new  EvaluacionesModel();
		eval= evaluacionConverter.convertEvaluacion2EvaluacionModel(eva);
		return eval.geteNombre();
	}

	

	
	
	
}
