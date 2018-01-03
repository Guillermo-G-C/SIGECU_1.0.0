package com.sigecu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alumno")
public class Alumno {
	
	@Id
	@GeneratedValue
	@Column(name="idAlumno")
	private int idAlumno;
	@Column(name="aNombre")
	private String aNombre;
	
	public Alumno(int idAlumno, String aNombre) {
		super();
		this.idAlumno = idAlumno;
		this.aNombre = aNombre;
	}
	
	public Alumno() {
		
	}

	public int getIdAlumno() {
		return idAlumno;
	}

	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}

	public String getaNombre() {
		return aNombre;
	}

	public void setaNombre(String aNombre) {
		this.aNombre = aNombre;
	}
	
	

}
