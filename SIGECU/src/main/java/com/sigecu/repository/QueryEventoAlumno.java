package com.sigecu.repository;

import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.sigecu.entity.Cursos;
import com.sigecu.entity.QAlumnoEntity;
import com.sigecu.entity.QAlumnoHasEventoEntity;
import com.sigecu.entity.QCursos;
import com.sigecu.entity.QEventoEntity;

import com.sigecu.entity.EventoEntity;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;

@Repository("queryEventoAlumno")
public class QueryEventoAlumno {
	private static final Log LOG=LogFactory.getLog(QueryEventoAlumno.class);
	
	//Tablas a utilizar
	QEventoEntity qEvento=QEventoEntity.eventoEntity;
	QAlumnoEntity qAlumno=QAlumnoEntity.alumnoEntity;
	QAlumnoHasEventoEntity qAlEve=QAlumnoHasEventoEntity.alumnoHasEventoEntity;
	QCursos qCursos=QCursos.cursos;
	
	
	@PersistenceContext
	private EntityManager em;
	JPAQueryFactory queryFactory=null;
	
	//Busca los eventos relacionado por el ID del Alumno
	public List<EventoEntity> findAllEventosById (int idAlumno){
		JPAQuery<EventoEntity> query=new JPAQuery<> (em);
		List<EventoEntity> listaEventos=query.select(qEvento)
				.from(qEvento)
				.where(qEvento.id)
		
	}
	
	
	

}
