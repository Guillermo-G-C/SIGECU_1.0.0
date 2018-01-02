/**
 * 
 */
package com.sigecu.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQuery;
import com.sigecu.entity.Evaluaciones;
import com.sigecu.entity.Preguntas;
import com.sigecu.entity.QEvaluaciones;
import com.sigecu.entity.QPreguntas;
//import com.sigecu.entity.QRespuestaALM;
import com.sigecu.entity.QRespuestas;
import com.sigecu.entity.Respuestas;

/**
 * @author Dell
 *
 */
@Repository("queryDSLPreguntasRepo")
public class QueryPreguntasErradasCon {
	
	private static final Log LOG = LogFactory.getLog(QueryPreguntasErradasCon.class);
	private QEvaluaciones qEvaluaciones = QEvaluaciones.evaluaciones;
	private QPreguntas qPreguntas = QPreguntas.preguntas;
	private QRespuestas qRespuestas = QRespuestas.respuestas;
	//private QRespuestaALM qrepuestasalm = QRespuestaALM.respuestaALM;
	
	@PersistenceContext
	private EntityManager em;
//	
//	public List<Respuestas> preguntasErradasMo() {
//		JPAQuery<Preguntas> query = new JPAQuery<Preguntas>(em);
//		
//		//query.select(qPreguntas,qRespuestas).from(qPreguntas,qRespuestas).where(qRespuestas.preguntas.idPregunta.eq(qPreguntas.idPregunta)).fetch();
//		List<Respuestas> pre=query.select(qRespuestas).from(qRespuestas,qrepuestasalm).where(qrepuestasalm.respuestas.idRespuesta.eq(qRespuestas.idRespuesta)).fetch();
//		return pre;
//	}

	
	/*Busca los examenes por id relacionados con el curso*/
	public List<Evaluaciones> findAllExamenesById(int idCurso) {
		
		 JPAQuery<Evaluaciones> query = new JPAQuery<>(em);
		 List<Evaluaciones> eval = query.select(qEvaluaciones)
		 .from(qEvaluaciones)
		 .where(qEvaluaciones.cursos.idCurso.eq(idCurso))
		 .fetch();
		 LOG.info("LISTA DE EXAMENES POR CURSO");
		 
		 return eval;
	}
	
}
