package com.sigecu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "alumno_has_evento")
public class AlumnoHasEvento{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idAHE")
	private int idAHE;
	
	//Bi-direcional many-to-many association to Alumno
	@ManyToOne
	@JoinColumn(name="idalumno")
	private Alumno alumno;

	public AlumnoHasEvento(int idAHE, Alumno alumno) {
		super();
		this.idAHE = idAHE;
		this.alumno = alumno;
	}
	
	public AlumnoHasEvento() {
		
	}

	public int getIdAHE() {
		return idAHE;
	}

	public void setIdAHE(int idAHE) {
		this.idAHE = idAHE;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
	
	
}