/**
 * 
 */
package com.sigecu.converter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import com.sigecu.entity.Evaluaciones;
import com.sigecu.entity.Preguntas;
import com.sigecu.model.PreguntasModel;

/**
 * @author Rolando Castillo
 * @contact castillomartinez@acm.org
 * @Fecha 17/12/2017
 *
 */
@Component("preguntasConverter")
public class PreguntasConverter {
	private static final Log LOG = LogFactory.getLog(PreguntasConverter.class);

	// entity -- to -- model
	public PreguntasModel converterPreguntasToPreguntasModel(Preguntas preguntas) {
		PreguntasModel preguntaModel = new PreguntasModel();
		preguntaModel.setIdPregunta(preguntas.getIdPregunta());
		preguntaModel.setpPregunta(preguntas.getpPregunta());
		preguntaModel.setpDescripcion(preguntas.getpDescripcion());
		preguntaModel.setEvaluacion(preguntas.getEvaluaciones());
		preguntaModel.setPuntaje(preguntas.getpPuntaje());
		LOG.info("Conversion correcta: Pregunta a PreguntaModel");
		return preguntaModel;
	}

	// model -- to -- entity
	public Preguntas converterPreguntaModelToPreguntas(PreguntasModel preguntaModel, Evaluaciones eval) {
		Preguntas pregunta = new Preguntas();
		pregunta.setpPregunta(preguntaModel.getpPregunta());
		pregunta.setpPuntaje(preguntaModel.getPuntaje());
		pregunta.setpDescripcion(preguntaModel.getpDescripcion());
		pregunta.setEvaluaciones(eval);
		return pregunta;
	}
}
