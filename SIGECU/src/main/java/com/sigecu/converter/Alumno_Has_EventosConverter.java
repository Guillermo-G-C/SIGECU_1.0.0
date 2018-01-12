package com.sigecu.converter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.sigecu.model.AlumnoHasEventoModel;
import com.sigecu.entity.Alumno_Has_Eventos;

@Component("alumno_Has_EventosConverter")
public class Alumno_Has_EventosConverter {
	private static final Log LOG = LogFactory.getLog(EventosConverter.class);
	
	//Entidad a Modelo
	public AlumnoHasEventoModel convertAlumno_Has_EventosToModel(Alumno_Has_Eventos alumno_Has_Eventos) {
		AlumnoHasEventoModel alumnoHasEventoModel = new AlumnoHasEventoModel();
		
		alumnoHasEventoModel.setConfirmado(alumno_Has_Eventos.getConfirmado());
		
		return alumnoHasEventoModel;
	}
	
	//Modelo a Entidad
	public Alumno_Has_EventosConverter convertAlumnoHasEventoModelToAlumno_Has_Eventos(AlumnoHasEventoModel alumnoHasEvento) {
		Alumno_Has_EventosConverter alumno_Has_Eventos = new Alumno_Has_EventosConverter();
		
		return alumno_Has_Eventos;
	}
}
