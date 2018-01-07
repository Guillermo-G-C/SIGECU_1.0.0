package com.sigecu.converter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.sigecu.model.EventosModel;
import com.sigecu.entity.Eventos;

@Component("eventosConverter")
public class EventosConverter {
	private static final Log LOG = LogFactory.getLog(EventosConverter.class);

	//Entidad a Modelo
	
	public EventosModel convertEventoToEentoModel(Eventos evento) {
		 EventosModel eventoModel=new EventosModel();
		 eventoModel.setIdevento(evento.getId_evento());
		 eventoModel.seteDescripcion(evento.getE_descripcion());
		 eventoModel.setE_fecha_inicio(evento.getE_fecha_inicio());
		 eventoModel.seteFechaTermino(evento.getE_fecha_termino());
		 eventoModel.setePrograma(evento.getE_programa());
		 eventoModel.seteHorario(evento.getE_horario());
		 eventoModel.seteCapacidad(evento.getE_capacidad());
		 eventoModel.seteTipo(evento.getE_tipo());
		 eventoModel.seteEstatus(evento.getE_estatus());
		 eventoModel.setCurso(evento.getCursos());
		 eventoModel.setInstructor(evento.getInstructor());
		 
		 return eventoModel;
	}
	
	
	//Modelo a Entidad
	
	public Eventos convertEventoModelToEvento (EventosModel evento) {
		Eventos even=new Eventos() ;
		even.setId_evento(evento.getIdevento());
		even.setE_descripcion(evento.geteDescripcion());
		even.setE_fecha_inicio(evento.getE_fecha_inicio());
		even.setE_fecha_termino(evento.geteFechaTermino());
		even.setE_programa(evento.getePrograma());
		even.setE_horario(evento.geteHorario());
		even.setE_capacidad(evento.geteCapacidad());
		even.setE_tipo(evento.geteTipo());
		even.setE_estatus(evento.geteEstatus());
		even.setInstructor(evento.getInstructor());
		even.setCursos(evento.getCurso());
		return even;
		
	}
}
