/**
 * 
 */
package com.sigecu.service;

import java.util.List;


import com.sigecu.entity.Respuestas;
import com.sigecu.model.CursoModel;
import com.sigecu.model.EvaluacionesModel;

/**
 * @author Dell
 *
 */
public interface PreguntasErradasConService {
	
	public abstract List<Respuestas> listarPreguntasHerradas();
	public abstract List<EvaluacionesModel> listarEvaluaciones(int idCurso);
	public abstract List<CursoModel> listaCursos();
	

}
