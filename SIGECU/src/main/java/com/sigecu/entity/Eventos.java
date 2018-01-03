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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Rolando Castillo
 * @contact castillomartinez@acm.org
 * @Fecha 03/01/2018
 *
 */
@Entity
@Table(name="evantos")
public class Eventos {
	
	private int id_evento;
	private String e_descripcion;
	
	private Set<Alumno_Has_Eventos> alumnos_has_eventos = new HashSet<>();
	
	public Eventos() {
		// TODO Auto-generated constructor stub
	}
	

	/**
	 * @param id_evento
	 * @param e_descripcion
	 * @param alumnos_has_eventos
	 */
	public Eventos(String e_descripcion) {
		super();
		this.e_descripcion = e_descripcion;

	}
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
	

}
