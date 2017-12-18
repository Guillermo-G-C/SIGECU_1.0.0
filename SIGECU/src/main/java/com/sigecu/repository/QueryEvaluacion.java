/**
 * 
 */
package com.sigecu.repository;

import java.util.List;

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
@Repository("queryEvaluacion")
public class QueryEvaluacion {
	QEvaluaciones qEval = QEvaluaciones.evaluaciones;
	QCursos qCursos = QCursos.cursos;
	//persistencia de la app
	@PersistenceContext
	private EntityManager em;
	
	public void listarExamenes() {
		
	}
	
	public List<Evaluaciones> find(int idCurs) {
		JPAQuery query = new JPAQuery(em);
		List<Evaluaciones> eval =   (List<Evaluaciones>) query.from(qEval)
				.where(qEval.cursos.idCurso.eq(idCurs));
				//.uniqueResult(qEval);
		return eval;
	}
}
