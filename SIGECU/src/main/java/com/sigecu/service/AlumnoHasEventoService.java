package com.sigecu.service;

import com.sigecu.entity.AlumnoHasEvento;
import com.sigecu.entity.Alumno_Has_Eventos;

public interface AlumnoHasEventoService {

	public abstract AlumnoHasEvento findAlumnoHasEventoById(int idAHE);
	
	public abstract void findAlumnoHasEventoByIdAlumnoAndIdEvento(int id_alumno, int id_evento);
	
}
