package com.sigecu.repository;

import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.sigecu.entity.Cursos;
import com.sigecu.entity.Eventos;
import com.sigecu.entity.QAlumno;
import com.sigecu.entity.QAlumnoEventosId;
import com.sigecu.entity.QAlumno_Has_Eventos;
import com.sigecu.entity.QCursos;
import com.sigecu.entity.QEventos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;

@Repository("queryEventoAlumno")
public class QueryEventoAlumno {
	private static final Log LOG=LogFactory.getLog(QueryEventoAlumno.class);
	
	//Tablas a utilizar
	QAlumno qAlumno=QAlumno.alumno;
	QAlumno_Has_Eventos qAhE=QAlumno_Has_Eventos.alumno_Has_Eventos;
	QAlumnoEventosId qAEId=QAlumnoEventosId.alumnoEventosId;	
	QCursos qCursos=QCursos.cursos;
	QEventos qEventos=QEventos.eventos;
	
	
	@PersistenceContext
	private EntityManager em;
	JPAQueryFactory queryFactory=null;
	
	//Busca los eventos relacionado por el ID del Alumno
   public List<Eventos> findAllEventosAlumnosById(int idAlumno){
	   JPAQuery<Eventos> query=new JPAQuery<> (em);
	   List<Eventos> listaEventos=query.select(qEventos)
			   .from(qEventos, qAhE, qAlumno)
			   .where(qEventos.id_evento.eq(qAhE.primaryKey.eventos.id_evento).
					   and(qAhE.primaryKey.alumno.id_alumno.eq(idAlumno)))
			   .distinct()
			   .fetch();
	   
	   return listaEventos;
	   
   }
   
  
	
	

}
