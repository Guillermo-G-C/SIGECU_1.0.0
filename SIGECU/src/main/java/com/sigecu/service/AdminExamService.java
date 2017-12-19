package com.sigecu.service;

import java.util.List;

import com.sigecu.entity.Preguntas;
import com.sigecu.model.CursoModel;
import com.sigecu.model.EvaluacionesModel;
import com.sigecu.model.PreguntasModel;

public interface AdminExamService {
	
	public abstract List<EvaluacionesModel> listAllEvaluaciones(int idCurso);
	public abstract List<CursoModel> listaCursos();
	public abstract void nuevaEvaluacion(EvaluacionesModel evalModel, int idCurso);
	
	public abstract List<PreguntasModel> listarPregunrasByExam(int idExamen);
	public abstract void nuevaPregunta(PreguntasModel preguntaModel, int idEvaluacion);

}
