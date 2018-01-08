package com.sigecu.service;

import java.util.List;

import com.sigecu.model.CursoModel;
import com.sigecu.model.EvaluacionesModel;

public interface EvaluacionAlumnoService {
	
	
//public abstract  String BuscarNombreEva(int idEvaluacion);
	
	public abstract List<EvaluacionesModel> listAllEvaluaciones(int idCurso);

	public abstract List<CursoModel> listaCursos();
	
	

}
