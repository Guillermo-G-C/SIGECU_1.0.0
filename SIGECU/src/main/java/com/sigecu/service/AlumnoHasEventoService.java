package com.sigecu.service;

import java.util.List;
import java.util.Map;

import com.querydsl.core.Tuple;
import com.sigecu.entity.Alumno_Has_Eventos;

public interface AlumnoHasEventoService {

	public abstract Alumno_Has_Eventos findAlumnoHasEventoById(int idAHE);
	
	List<Map<String, Object>> report(int idAlumno, int idEvento);

	public abstract void findAHEByIdAlumnoAndIdEvento(int id_alumno, int id_evento);
	
}
