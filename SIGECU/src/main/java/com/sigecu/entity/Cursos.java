package com.sigecu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cursos")
public class Cursos {
	@Id
	@GeneratedValue
	@Column(name="idCurso")
	private int idCurso;
	@Column(name="cNombre", unique=true, nullable=false, length=45)
	private String cNombre;
	@Column(name="cDescripcion")
	private String cDescripcion;
	/**
	 * @return the cNombre
	 */
	public String getcNombre() {
		return cNombre;
	}
	/**
	 * @param cNombre the cNombre to set
	 */
	public void setcNombre(String cNombre) {
		this.cNombre = cNombre;
	}
	/**
	 * @return the cDescripcion
	 */
	public String getcDescripcion() {
		return cDescripcion;
	}
	/**
	 * @param cDescripcion the cDescripcion to set
	 */
	public void setcDescripcion(String cDescripcion) {
		this.cDescripcion = cDescripcion;
	}
	/**
	 * @return the idCurso
	 */
	public int getIdCurso() {
		return idCurso;
	}
	/**
	 * @param idCurso the idCurso to set
	 */
	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}
	
	
	

}
