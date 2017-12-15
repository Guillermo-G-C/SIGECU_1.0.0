/**
 * 
 */
package com.sigecu.component;

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
	
	public EvaluacionesModel convertEvaluacionModel2Evaluacion(Evaluaciones evaluacion) {
		EvaluacionesModel eval = new EvaluacionesModel();
		eval.seteNombre(evaluacion.geteNombre());
		eval.setePorcentaje(evaluacion.getePorsentaje());
		eval.seteTiempo(evaluacion.geteTiempo());

		return eval;
		
	}
}
