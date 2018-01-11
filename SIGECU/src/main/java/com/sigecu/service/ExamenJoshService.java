/**
 * 
 */
package com.sigecu.service;

import java.util.List;

import com.sigecu.entity.Preguntas;
import com.sigecu.entity.RespuestaALMEntity;
import com.sigecu.entity.Respuestas;
import com.sigecu.model.PreguntasModel;
import com.sigecu.model.RespuestasModel;

/**
 * @author Dell
 *
 */
public interface ExamenJoshService {
	
	public abstract List<PreguntasModel> listarPreguntas(int idPregunta);
	public abstract List<RespuestasModel> listaRespuestas(int idEvaluacion);
	public abstract List<RespuestaALMEntity> listaRespuestasAlumno();

}
