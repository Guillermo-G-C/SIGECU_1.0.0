package com.sigecu.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;

/**
 * @author Rolando Castillo
 * @contact castillomartinez@acm.org
 * @Fecha 02/01/2018
 *
 */
@Entity
@Table(name="alumno")
public class Alumno {
	
	private int id_alumno;
	private String a_nombre;
	private String a_paterno;
	private String a_materno;
	private String a_telefono;
	private String a_email;
	private String a_carrera;
	private String a_notebook;
	private String a_status;
	
	private Set<Alumno_Has_Eventos> alumno_has_eventos = new HashSet<>(); 
	public Alumno() {
	}
	/**
	 * @param a_nombre
	 * @param a_paterno
	 * @param a_materno
	 * @param a_telefono
	 * @param a_email
	 * @param a_carrera
	 * @param a_notebook
	 * @param a_status
	 */
	public Alumno( String a_nombre, String a_paterno, String a_materno, String a_telefono, String a_email,
			String a_carrera, String a_notebook, String a_status) {
		this.a_nombre = a_nombre;
		this.a_paterno = a_paterno;
		this.a_materno = a_materno;
		this.a_telefono = a_telefono;
		this.a_email = a_email;
		this.a_carrera = a_carrera;
		this.a_notebook = a_notebook;
		this.a_status = a_status;
	}
	public void addEventos(Alumno_Has_Eventos alm_has_event) {
		this.alumno_has_eventos.add(alm_has_event);
		
	}
	/**
	 * @return the id_alumno
	 */
	@Id
	@GeneratedValue
	@Column(name="id_alumno")
	public int getId_alumno() {
		return id_alumno;
	}
	/**
	 * @param id_alumno the id_alumno to set
	 */
	public void setId_alumno(int id_alumno) {
		this.id_alumno = id_alumno;
	}
	/**
	 * @return the a_nombre
	 */
	public String getA_nombre() {
		return a_nombre;
	}
	/**
	 * @param a_nombre the a_nombre to set
	 */
	public void setA_nombre(String a_nombre) {
		this.a_nombre = a_nombre;
	}
	/**
	 * @return the a_paterno
	 */
	public String getA_paterno() {
		return a_paterno;
	}
	/**
	 * @param a_paterno the a_paterno to set
	 */
	public void setA_paterno(String a_paterno) {
		this.a_paterno = a_paterno;
	}
	/**
	 * @return the a_materno
	 */
	public String getA_materno() {
		return a_materno;
	}
	/**
	 * @param a_materno the a_materno to set
	 */
	public void setA_materno(String a_materno) {
		this.a_materno = a_materno;
	}
	/**
	 * @return the a_telefono
	 */
	public String getA_telefono() {
		return a_telefono;
	}
	/**
	 * @param a_telefono the a_telefono to set
	 */
	public void setA_telefono(String a_telefono) {
		this.a_telefono = a_telefono;
	}
	/**
	 * @return the a_email
	 */
	public String getA_email() {
		return a_email;
	}
	/**
	 * @param a_email the a_email to set
	 */
	public void setA_email(String a_email) {
		this.a_email = a_email;
	}
	/**
	 * @return the a_carrera
	 */
	public String getA_carrera() {
		return a_carrera;
	}
	/**
	 * @param a_carrera the a_carrera to set
	 */
	public void setA_carrera(String a_carrera) {
		this.a_carrera = a_carrera;
	}
	/**
	 * @return the a_notebook
	 */
	public String getA_notebook() {
		return a_notebook;
	}
	/**
	 * @param a_notebook the a_notebook to set
	 */
	public void setA_notebook(String a_notebook) {
		this.a_notebook = a_notebook;
	}
	/**
	 * @return the a_status
	 */
	public String getA_status() {
		return a_status;
	}
	/**
	 * @param a_status the a_status to set
	 */
	public void setA_status(String a_status) {
		this.a_status = a_status;
	}
	/**
	 * @return the alumno_has_eventos
	 */
	@OneToMany(mappedBy = "primaryKey.alumno", cascade = CascadeType.ALL)
	public Set<Alumno_Has_Eventos> getAlumno_has_eventos() {
		return alumno_has_eventos;
	}
	/**
	 * @param alumno_has_eventos the alumno_has_eventos to set
	 */
	public void setAlumno_has_eventos(Set<Alumno_Has_Eventos> alumno_has_eventos) {
		this.alumno_has_eventos = alumno_has_eventos;
	}
	
}
