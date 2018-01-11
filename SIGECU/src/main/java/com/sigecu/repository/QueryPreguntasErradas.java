package com.sigecu.repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Anel
 * 
 */
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.sigecu.entity.QAlumno;
import com.sigecu.entity.QAlumno_Has_Eventos;
import com.sigecu.entity.QPreguntas;
import com.sigecu.entity.QRespuestas;

import antlr.collections.List;

@Repository("queryPreguntasErradas")

public class QueryPreguntasErradas {
	private static final Log LOG=LogFactory.getLog(QueryPreguntasErradas.class);
	
	QAlumno qAlumno=QAlumno.alumno;
	QAlumno_Has_Eventos qAhE=QAlumno_Has_Eventos.alumno_Has_Eventos;
	QPreguntas qPreguntas=QPreguntas.preguntas;
	QRespuestas qRespuestas=QRespuestas.respuestas;
	
	@PersistenceContext
	private EntityManager em;
	JPAQueryFactory query=null;
	
	public List<ExamenErrado> findAllExamenErradoByID(){
		
		JPAQuery<ExamenErrado> query = new JPAQuery<>(em);
		List <ExamenErrado> listaExamenErrado=query.select() 
		
		
		return ExamenErrado;
	}
	
	
	
	
	

}
