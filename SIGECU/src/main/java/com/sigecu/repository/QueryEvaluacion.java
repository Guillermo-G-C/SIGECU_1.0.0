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
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.sigecu.entity.Evaluaciones;
import com.sigecu.entity.Preguntas;
import com.sigecu.entity.QCursos;
import com.sigecu.entity.QEvaluaciones;
import com.sigecu.entity.QPreguntas;
import com.sigecu.entity.QRespuestas;
import com.sigecu.entity.Respuestas;

/**
 * @author Rolando Castillo
 * @contact castillomartinez@acm.org
 * @Fecha 16/12/2017
 *
 */
@Repository("queryEvaluacion")
public class QueryEvaluacion {
	private static final Log LOG = LogFactory.getLog(QueryEvaluacion.class);
	QEvaluaciones qEval = QEvaluaciones.evaluaciones;
	QCursos qCursos = QCursos.cursos;
	QPreguntas qPreguntas = QPreguntas.preguntas;
	QRespuestas qRespuestas = QRespuestas.respuestas;
	//persistencia de la app
	@PersistenceContext
	private EntityManager em;
	JPAQueryFactory queryFactory = null;
	
	public void listarExamenes() {
		
	}
	
	/*Busca los examenes por id relacionados con el curso*/
	public List<Evaluaciones> findAllExamenesById(int idCurso) {
		
		 JPAQuery<Evaluaciones> query = new JPAQuery<>(em);
		 List<Evaluaciones> eval = query.select(qEval)
		 .from(qEval)
		 .where(qEval.cursos.idCurso.eq(idCurso))
		 .fetch();
		 LOG.info("LISTA DE EXAMENES POR CURSO");
		 
		 return eval;
	}
	
	/*Busca preguntas por id de examen*/
	public List<Preguntas> findAllPreguntasById(int idExamen){
		JPAQuery<Preguntas> query = new JPAQuery<> (em);
		List<Preguntas> listPreguntas = query.select(qPreguntas)
				.from(qPreguntas)
				.where(qPreguntas.evaluaciones.idEvaluacion.eq(idExamen))
				.orderBy(qPreguntas.idPregunta.desc())
				.fetch();
		return listPreguntas;
		
	}
	/*Busca respuestas de pregunta*/
	public List<Respuestas> findAllRespuestasByIdPregunta(int idPregunta){
		JPAQuery<Respuestas> query = new JPAQuery<> (em);
		List<Respuestas> listRespuestas = query.select(qRespuestas)
				.from(qRespuestas)
				.where(qRespuestas.preguntas.idPregunta.eq(idPregunta)).orderBy(qRespuestas.idRespuesta.desc())
				.fetch();
		return listRespuestas;
		
	}
}
