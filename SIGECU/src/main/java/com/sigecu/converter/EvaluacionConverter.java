/**
 * 
 */
package com.sigecu.converter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.sigecu.entity.Evaluaciones;
import com.sigecu.model.EvaluacionesModel;

/**
 * @author Rolando Castillo
 * @contact castillomartinez@acm.org
 * @Fecha 14/12/2017
 *
 */
@Component("evalaucionesConverter")
public class EvaluacionConverter {

	private static final Log LOG = LogFactory.getLog(EvaluacionConverter.class);

	//Entity --> Model
	public EvaluacionesModel convertEvaluacion2EvaluacionModel(Evaluaciones evaluacion) {
		EvaluacionesModel eval = new EvaluacionesModel();
		eval.setIdevaluacion(evaluacion.getIdEvaluacion());
		eval.seteNombre(evaluacion.geteNombre());
		eval.setePorcentaje(evaluacion.getePorsentaje());
		eval.seteTiempo(evaluacion.geteTiempo());
		LOG.info("convierte el entity a Model");

		return eval;

	}
	
	// Model --> Entity
	public Evaluaciones convertEvaluacionModelToEvaluacion(EvaluacionesModel evaluacionModel) {
		Evaluaciones evaluacion = new Evaluaciones();
		evaluacion.seteNombre(evaluacionModel.geteNombre());
		evaluacion.setePorsentaje(evaluacionModel.getePorcentaje());
		//evaluacion.setCursos(evaluacionModel.getIdCurso());
		evaluacion.seteTiempo(evaluacionModel.geteTiempo());
		return evaluacion;
	}
}
