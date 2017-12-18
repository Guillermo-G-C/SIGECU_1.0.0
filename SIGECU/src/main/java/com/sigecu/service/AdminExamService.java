package com.sigecu.service;

import java.util.List;

import com.sigecu.entity.Cursos;
import com.sigecu.model.CursoModel;
import com.sigecu.model.EvaluacionesModel;

public interface AdminExamService {
	
	public abstract List<EvaluacionesModel> listAllEvaluaciones();
	public abstract List<CursoModel> listaCursos();

}
