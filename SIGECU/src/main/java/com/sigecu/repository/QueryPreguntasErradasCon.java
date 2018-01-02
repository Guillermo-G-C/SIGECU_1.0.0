/**
 * 
 */
package com.sigecu.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQuery;
import com.sigecu.entity.Preguntas;
import com.sigecu.entity.QEvaluaciones;
import com.sigecu.entity.QPreguntas;
import com.sigecu.entity.QRespuestas;
import com.sigecu.entity.Respuestas;

/**
 * @author Dell
 *
 */
@Repository("queryDSLPreguntasRepo")
public class QueryPreguntasErradasCon {
	
//	private QEvaluaciones qEvaluaciones = QEvaluaciones.evaluaciones;
//	private QPreguntas qPreguntas = QPreguntas.preguntas;
//	private QRespuestas qRespuestas = QRespuestas.respuestas;
//	private QRespuestaALM qrepuestasalm = QRespuestaALM.respuestaALM;
//	
//	@PersistenceContext
//	private EntityManager em;
//	
//	public List<Respuestas> preguntasErradasMo() {
//		JPAQuery<Preguntas> query = new JPAQuery<Preguntas>(em);
//		
//		//query.select(qPreguntas,qRespuestas).from(qPreguntas,qRespuestas).where(qRespuestas.preguntas.idPregunta.eq(qPreguntas.idPregunta)).fetch();
//		List<Respuestas> pre=query.select(qRespuestas).from(qRespuestas,qrepuestasalm).where(qrepuestasalm.respuestas.idRespuesta.eq(qRespuestas.idRespuesta)).fetch();
//		return pre;
//	}

}
