package com.sigecu.service;

import com.sigecu.model.AlumnoModel;
import com.sigecu.model.Evento;

import java.util.List;

public interface eventoAlumnoService {
	public abstract List<Evento> listAllEventosAl (int idEvento);
	public abstract List<AlumnoModel> listaAlumnos();

}
