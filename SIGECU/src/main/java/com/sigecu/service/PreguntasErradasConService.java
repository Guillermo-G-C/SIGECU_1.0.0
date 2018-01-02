/**
 * 
 */
package com.sigecu.service;

import java.util.List;

import com.sigecu.entity.Evaluaciones;
import com.sigecu.entity.Respuestas;
import com.sigecu.model.CursoModel;

/**
 * @author Dell
 *
 */
public interface PreguntasErradasConService {
	
	public abstract List<Respuestas> listarPreguntasHerradas();
	public abstract List<Evaluaciones> listarEvaluaciones();
	public abstract List<CursoModel> listaCursos();

}
