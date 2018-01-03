package com.sigecu.converter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.sigecu.model.Evento;
import com.sigecu.entity.EventoEntity;

@Component("eventosConverter")
public class EventosConverter {
	private static final Log LOG = LogFactory.getLog(EventosConverter.class);

	//Entidad a Modelo
	
	public Evento convertEventoToEentoModel(EventoEntity evento) {
		 Evento eventoModel=new Evento();
		 eventoModel.setIdevento(evento.getIdEvento());
		 eventoModel.setDescripcion(evento.geteDescripcion());
		 eventoModel.setC_idcursos(evento.getC_idcursos());
		 eventoModel.setI_idinstructor(evento.getI_idInstructor());
		 eventoModel.setFechaInicio(evento.geteFechaInicio());
		 eventoModel.setFechaTermino(evento.geteFechaTermino());
		 eventoModel.setPrograma(evento.getePrograma());
		 eventoModel.setHorario(evento.geteHorario());
		 eventoModel.setL_idlugar(evento.getLugar_idLugar());
		 eventoModel.setT_templete(evento.getT_idtemplates());
		 eventoModel.setCapacidad(evento.geteCapacidad());
		 eventoModel.setTipo(evento.geteTipo());
		 eventoModel.setStatus(evento.geteEstatus());
		 
		 return eventoModel;
	}
	
	
	//Modelo a Entidad
	
	public EventoEntity convertEventoModelToEvento (Evento evento) {
		EventoEntity even=new EventoEntity() ;
		even.setIdEvento(evento.getIdevento());
		even.seteDescripcion(evento.getDescripcion());
		even.setC_idcursos(evento.getC_idcursos());
		even.setI_idInstructor(evento.getC_idcursos());
		even.seteFechaInicio(evento.getFechaInicio());
		even.seteFechaTermino(evento.getFechaTermino());
		even.setePrograma(evento.getPrograma());
		even.seteHorario(evento.getHorario());
		even.setLugar_idLugar(evento.getL_idlugar());
		even.setT_idtemplates(evento.getT_templete());
		even.seteCapacidad(evento.getCapacidad());
		even.seteTipo(evento.getTipo());
		even.seteEstatus(evento.getStatus());
		return even;
		
	}
}
