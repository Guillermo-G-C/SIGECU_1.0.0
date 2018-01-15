package com.sigecu.service;

import java.util.List;

import com.sigecu.model.EvaluacionesModel;
import com.sigecu.model.PreguntasModel;
import com.sigecu.model.RespuestasModel;

public interface EvaluacionAlumnoService {
	
	
	public abstract List<EvaluacionesModel> listAllEvaluaciones(int idCurso);
	
	public abstract List<PreguntasModel> listarPreguntasByEvaluacionAlumno(int idExamen);

	public abstract String tiempoExamen(int idEvaluacion);
	
	public abstract String calificacion(int idEvaluacion);
	
	public abstract List<RespuestasModel> listarRespuestas(int idExamen);
	
	List<RespuestasModel> listarRespuestas();

	//public abstract List<EvaluacionesModel> EvaluacionPorEvento(int idEvento);

}
