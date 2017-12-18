/**
 * 
 */
package com.sigecu.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.hibernate.HibernateQuery;
import com.querydsl.jpa.impl.JPAQuery;
import com.sigecu.entity.Evaluaciones;
import com.sigecu.entity.QCursos;
import com.sigecu.entity.QEvaluaciones;

/**
 * @author Rolando Castillo
 * @contact castillomartinez@acm.org
 * @Fecha 16/12/2017
 *
 */
@Repository("")
public class queryEvaluacion {
	QEvaluaciones qEval = QEvaluaciones.evaluaciones;
	QCursos qCursos = QCursos.cursos;
	//persistencia de la app
	@PersistenceContext
	private EntityManager em;
	
	public void listarExamenes() {
		
	}
	
	public Evaluaciones find() {
		JPAQuery<Evaluaciones> query = new JPAQuery<>(em);
		Evaluaciones eval = query.select(qEval).from(qEval).where(qEval.idEvaluacion.eq(1)).fetchOne();
		return eval;
	}
}
