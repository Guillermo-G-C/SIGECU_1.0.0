package com.sigecu.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.querydsl.core.Tuple;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.sigecu.entity.Alumno_Has_Eventos;
import com.sigecu.entity.QAlumno;
import com.sigecu.entity.QAlumno_Has_Eventos;
import com.sigecu.entity.QAsignaExamenEntity;
import com.sigecu.entity.QCursos;
import com.sigecu.entity.QEventos;

@Repository
public class QueryAlumnoHasEvento {
	private static final Log LOG = LogFactory.getLog(QueryAlumnoHasEvento.class);
	QAlumno_Has_Eventos qAlumno_Has_Eventos = QAlumno_Has_Eventos.alumno_Has_Eventos;
	QCursos qCursos = QCursos.cursos;
	QAlumno qAlumno = QAlumno.alumno;
	QAsignaExamenEntity qAsignaExamen = QAsignaExamenEntity.asignaExamenEntity;
	QEventos qEventos = QEventos.eventos;
	//persistencia de la app
	@PersistenceContext
	private EntityManager em;
	JPAQueryFactory queryFactory = null;
	
	//Buscar los el evento en relación con el alumnoHasEvento
	public Tuple findAlumnoHasEventosByIdAlumnoAndIdEvento(int id_alumno, int id_evento) {
		JPAQuery<Alumno_Has_Eventos> query = new JPAQuery<>(em);
		
		Tuple AHE = query.select(qAlumno.a_nombre, qCursos.cNombre,  qEventos.e_fecha_termino)
				.from(qAlumno_Has_Eventos, qCursos, qAlumno, qEventos)
				.where(qAlumno_Has_Eventos.primaryKey.alumno.id_alumno.eq(qAlumno.id_alumno).and(qAlumno.id_alumno.eq(id_alumno)).and(qEventos.id_evento.eq(id_evento)).and(qAlumno_Has_Eventos.primaryKey.eventos.id_evento.eq(qEventos.id_evento).and(qEventos.cursos.idCurso.eq(qCursos.idCurso))))
				.fetchOne();
		return AHE;
	}
	
}
