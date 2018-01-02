package com.sigecu.service;

import java.util.List;

import com.sigecu.model.CursoModel;
import com.sigecu.model.EvaluacionesModel;
import com.sigecu.model.PreguntasModel;

/**
 * @author Anel
 *
 */
public interface ExamenErradoService {
	
	public abstract List<EvaluacionesModel> listAllExamenes(int idCurso);
	public abstract List<CursoModel> listaCursos();
	public abstract void nuevaExamen(EvaluacionesModel evalModel, int idCurso);

	public abstract List<PreguntasModel> listarPregunrasByExam(int idExamen);
	public abstract void nuevaPregunta(PreguntasModel preguntaModel, int idEvaluacion);
	public abstract Object listAllEvaluaciones(int idCurso);
	



}