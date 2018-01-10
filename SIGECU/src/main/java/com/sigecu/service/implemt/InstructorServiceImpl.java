/**
 * 
 */
package com.sigecu.service.implemt;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sigecu.converter.EventosConverter;
import com.sigecu.entity.Eventos;
import com.sigecu.entity.Instructor;
import com.sigecu.model.EventosModel;
import com.sigecu.repository.EventosRepository;
import com.sigecu.repository.InstructorRepository;
import com.sigecu.service.InstructorService;

/**
 * @author Rolando Castillo
 * @contact castillomartinez@acm.org
 * @Fecha 09/01/2018
 *
 */
@Service("instructorServiceImpl")
public class InstructorServiceImpl implements InstructorService {

	@Autowired
	@Qualifier("eventosRepository")
	private EventosRepository eventoRepository;
	
	@Autowired
	@Qualifier("instructorRepository")
	private InstructorRepository instructorRepository;
	
	@Autowired
	@Qualifier("eventosConverter")
	private EventosConverter eventosConverter;
	
	/* (non-Javadoc)
	 * @see com.sigecu.service.InstructorService#eventosPorInstructor(int)
	 */
	@Override
	public List<EventosModel> eventosPorInstructor(int idInstructor) {
		Instructor instructor = instructorRepository.findByIdInstructor(idInstructor);
		List<Eventos> eventosEntity = eventoRepository.findByInstructor(instructor);
		List<EventosModel> eventosModel= new ArrayList<>();
		for(Eventos evento : eventosEntity) {
			EventosModel eventoModel = eventosConverter.convertEventoToEentoModel(evento);
			eventosModel.add(eventoModel);
		}
		return eventosModel;
	}

}
