package com.sigecu.service;

import java.util.List;

import com.sigecu.model.EvaluacionesModel;
import com.sigecu.model.PreguntasModel;
import com.sigecu.model.RespuestasModel;

/**
 * @author Anel
 *
 */
public interface ExamenErradoService {
	public abstract List<EvaluacionesModel> listAllEvaluaciones(int idCurso);
	public abstract List<PreguntasModel> listarPreguntasByExamErrado(int idExamen , int idAsignaExamen);
	public abstract List<RespuestasModel> listarRespuestas(int idExamen);
	List<RespuestasModel> listarRespuestas();
	
	// public abstract void nuevaRespuesta(RespuestasModel respuestasModel, int idPregunta);

}
