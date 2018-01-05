package com.sigecu.service.implemt;

import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.querydsl.core.Tuple;
import com.sigecu.entity.AlumnoHasEvento;
import com.sigecu.entity.Alumno_Has_Eventos;
import com.sigecu.repository.AlumnoHasEventoRepository;
import com.sigecu.repository.QueryAlumnoHasEvento;
import com.sigecu.repository.QueryEvaluacion;
import com.sigecu.service.AlumnoHasEventoService;

@Service("alumnoHasEventoServiceImpl")
public class AlumnoHasEventoServiceImpl implements AlumnoHasEventoService {
	private static final Log LOG = LogFactory.getLog(QueryEvaluacion.class);
	@Autowired
	@Qualifier("alumnoHasEventoRepository")
	private AlumnoHasEventoRepository alumnoHasEventoRepository;
	@Autowired
	@Qualifier("queryAlumnoHasEvento")
	private QueryAlumnoHasEvento queryAlumnoHasEvento;
	
	@Override
	public AlumnoHasEvento findAlumnoHasEventoById(int idAHE) {
		return alumnoHasEventoRepository.findAlumnoHasEventoByIdAHE(idAHE);
	}

	@Override
	public void findAlumnoHasEventoByIdAlumnoAndIdEvento(int id_alumno, int id_evento) {
		Tuple result = queryAlumnoHasEvento.findAlumnoHasEventosByIdAlumnoAndIdEvento(id_alumno, id_evento);
		
		LOG.info("Alumno :" + result.get(0, null));
		LOG.info("Curso :" + result.get(1, null));
	}
	
}
