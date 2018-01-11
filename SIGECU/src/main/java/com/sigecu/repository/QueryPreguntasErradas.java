package com.sigecu.repository;
/**
 * Anel
 * 
 */
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.sigecu.entity.QAlumno;

@Repository("queryPreguntasErradas")

public class QueryPreguntasErradas {
	private static final Log LOG=LogFactory.getLog(QueryPreguntasEsrradas.class);
	
	QAlumno qAlumno=QAlumno.alumno;
	
	

}
