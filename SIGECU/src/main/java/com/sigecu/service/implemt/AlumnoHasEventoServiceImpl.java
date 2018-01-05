package com.sigecu.service.implemt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sigecu.entity.AlumnoHasEvento;
import com.sigecu.repository.AlumnoHasEventoRepository;
import com.sigecu.service.AlumnoHasEventoService;

@Service("alumnoHasEventoServiceImpl")
public class AlumnoHasEventoServiceImpl implements AlumnoHasEventoService {

	@Autowired
	@Qualifier("alumnoHasEventoRepository")
	private AlumnoHasEventoRepository alumnoHasEventoRepository;

	@Override
	public AlumnoHasEvento findAlumnoHasEventoById(int idAHE) {
		return alumnoHasEventoRepository.findAlumnoHasEventoByIdAHE(idAHE);
	}
	
}
