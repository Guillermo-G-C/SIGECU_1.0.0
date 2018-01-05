package com.sigecu.converter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.sigecu.model.Evento;
import com.sigecu.entity.Eventos;

@Component("eventosConverter")
public class EventosConverter {
	private static final Log LOG = LogFactory.getLog(EventosConverter.class);

	//Entidad a Modelo
	
	public Evento convertEventoToEentoModel(Eventos evento) {
		 Evento eventoModel=new Evento();
		 eventoModel.setIdevento(evento.getId_evento());
		 eventoModel.setDescripcion(evento.getE_descripcion());
		 eventoModel.setFechaInicio(evento.getE_fechaInicio());
		 eventoModel.setFechaTermino(evento.getE_fechaFin());
		 eventoModel.setPrograma(evento.getE_Programa());
		 eventoModel.setHorario(evento.getE_Horario());
		 eventoModel.setCapacidad(evento.getE_Capacidad());
		 eventoModel.setTipo(evento.getE__Tipo());
		 eventoModel.setStatus(evento.getE_Status());
		 
		 return eventoModel;
	}
	
	
	//Modelo a Entidad
	
	public Eventos convertEventoModelToEvento (Evento evento) {
		Eventos even=new Eventos() ;
		even.setId_evento(evento.getIdevento());
		even.setE_descripcion(evento.getDescripcion());
		even.setE_fechaInicio(evento.getFechaInicio());
		even.setE_fechaFin(evento.getFechaTermino());
		even.setE_Programa(evento.getPrograma());
		even.setE_Horario(evento.getHorario());
		even.setE_Capacidad(evento.getCapacidad());
		even.setE__Tipo(evento.getTipo());
		even.setE_Status(evento.getStatus());
		return even;
		
	}
}
