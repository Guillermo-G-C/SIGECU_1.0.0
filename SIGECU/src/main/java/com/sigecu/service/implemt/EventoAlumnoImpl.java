package com.sigecu.service.implemt;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sigecu.converter.EventosConverter;
import com.sigecu.repository.EventosAlumnoRepository;

@Service("eventoAlumnoImpl")
public class EventoAlumnoImpl {
	private static final Log LOG=LogFactory.getLog(EventoAlumnoImpl.class);
	
    @Autowired 
	@Qualifier("eventosAlumnoRepository")
     private EventosAlumnoRepository evaucaionesEventoRepository;
    
    @Autowired
    @Qualifier("eventosConverter")
    private EventosConverter eventosConverter;
}
