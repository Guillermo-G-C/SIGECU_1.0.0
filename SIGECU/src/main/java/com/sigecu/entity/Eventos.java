/**
 * 
 */
package com.sigecu.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Rolando Castillo
 * @contact castillomartinez@acm.org
 * @Fecha 03/01/2018
 *
 */
@Entity
@Table(name="eventos")
public class Eventos {
	
	private int id_evento;
	private String e_descripcion;
	@ManyToOne
	@JoinColumn(name = "cursos_id_curso")
	private Cursos cursos;
	private Instructor instructor;
	private String e_fecha_inicio;
	private String e_fecha_termino;
	private String e_programa;
	private String e_horario;
	private String e_capacidad;
	private String e_tipo;
	private String e_estatus;
	
	private Set<Alumno_Has_Eventos> alumnos_has_eventos = new HashSet<>();
	
	public Eventos() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id_evento
	 * @param e_descripcion
	 * @param alumnos_has_eventos
	 */
	
	public void addAlumnosHasEventos(Alumno_Has_Eventos alm_has_event) {
		this.alumnos_has_eventos.add(alm_has_event);
	}


	/**
	 * @return the id_evento
	 */
	@Id
	@GeneratedValue
	@Column(name="id_evento")
	public int getId_evento() {
		return id_evento;
	}

	/**
	 * @param id_evento the id_evento to set
	 */
	public void setId_evento(int id_evento) {
		this.id_evento = id_evento;
	}

	/**
	 * @return the e_descripcion
	 */
	public String getE_descripcion() {
		return e_descripcion;
	}

	/**
	 * @param e_descripcion the e_descripcion to set
	 */
	public void setE_descripcion(String e_descripcion) {
		this.e_descripcion = e_descripcion;
	}
	

	/**
	 * @return the e_fecha_inicio
	 */
	public String getE_fecha_inicio() {
		return e_fecha_inicio;
	}

	/**
	 * @param e_fecha_inicio the e_fecha_inicio to set
	 */
	public void setE_fecha_inicio(String e_fecha_inicio) {
		this.e_fecha_inicio = e_fecha_inicio;
	}

	/**
	 * @return the e_fecha_termino
	 */
	public String getE_fecha_termino() {
		return e_fecha_termino;
	}

	/**
	 * @param e_fecha_termino the e_fecha_termino to set
	 */
	public void setE_fecha_termino(String e_fecha_termino) {
		this.e_fecha_termino = e_fecha_termino;
	}

	/**
	 * @return the e_programa
	 */
	public String getE_programa() {
		return e_programa;
	}

	/**
	 * @param e_programa the e_programa to set
	 */
	public void setE_programa(String e_programa) {
		this.e_programa = e_programa;
	}

	/**
	 * @return the e_horario
	 */
	public String getE_horario() {
		return e_horario;
	}

	/**
	 * @param e_horario the e_horario to set
	 */
	public void setE_horario(String e_horario) {
		this.e_horario = e_horario;
	}

	/**
	 * @return the e_capacidad
	 */
	public String getE_capacidad() {
		return e_capacidad;
	}

	/**
	 * @param e_capacidad the e_capacidad to set
	 */
	public void setE_capacidad(String e_capacidad) {
		this.e_capacidad = e_capacidad;
	}

	/**
	 * @return the e_tipo
	 */
	public String getE_tipo() {
		return e_tipo;
	}

	/**
	 * @param e_tipo the e_tipo to set
	 */
	public void setE_tipo(String e_tipo) {
		this.e_tipo = e_tipo;
	}

	/**
	 * @return the e_estatus
	 */
	public String getE_estatus() {
		return e_estatus;
	}

	/**
	 * @param e_estatus the e_estatus to set
	 */
	public void setE_estatus(String e_estatus) {
		this.e_estatus = e_estatus;
	}

	@ManyToOne
	@JoinColumn(name="idCurso")
	public Cursos getCursos() {
		return cursos;
	}

	public void setCursos(Cursos cursos) {
		this.cursos = cursos;
	}
	

	/**
	 * @return the instructor
	 */
	@ManyToOne
	@JoinColumn(name="id_instructor")
	public Instructor getInstructor() {
		return instructor;
	}

	/**
	 * @param instructor the instructor to set
	 */
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	/**
	 * @return the alumnos_has_eventos
	 */
	@OneToMany(mappedBy = "primaryKey.eventos", cascade = CascadeType.ALL)
	public Set<Alumno_Has_Eventos> getAlumnos_has_eventos() {
		return alumnos_has_eventos;
	}

	/**
	 * @param alumnos_has_eventos the alumnos_has_eventos to set
	 */
	public void setAlumnos_has_eventos(Set<Alumno_Has_Eventos> alumnos_has_eventos) {
		this.alumnos_has_eventos = alumnos_has_eventos;
	}

	public Eventos(int id_evento, String e_descripcion, Cursos cursos, Instructor instructor, String e_fecha_inicio,
			String e_fecha_termino, String e_programa, String e_horario, String e_capacidad, String e_tipo,
			String e_estatus, Set<Alumno_Has_Eventos> alumnos_has_eventos) {
		super();
		this.id_evento = id_evento;
		this.e_descripcion = e_descripcion;
		this.cursos = cursos;
		this.instructor = instructor;
		this.e_fecha_inicio = e_fecha_inicio;
		this.e_fecha_termino = e_fecha_termino;
		this.e_programa = e_programa;
		this.e_horario = e_horario;
		this.e_capacidad = e_capacidad;
		this.e_tipo = e_tipo;
		this.e_estatus = e_estatus;
		this.alumnos_has_eventos = alumnos_has_eventos;
	}


	
	

}
