package com.sigecu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alumno")
public class AlumnoEntity {
	
	@Id
	@GeneratedValue (strategy= GenerationType.AUTO)
	@Column(name="idAlumno", unique=true,nullable=false)
	private int idAlumno;
	@Column(name="aNombre")
    private String aNombre;
	@Column(name="aPaterno")
    private String aParterno;
	@Column(name="aMaterno")
    private String aMaterno;
	@Column(name="telefono")
    private String telefono; 
	@Column(name="email")
    private String email;
	@Column(name="carrera")
    private String carrera;
	@Column(name="notbook")
    private String notbook;
	@Column(name="status")
    private String status;

	
	
	public int getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}
	public String getNombre() {
		return aNombre;
	}
	public void setNombre(String nombre) {
		this.aNombre = nombre;
	}
	public String getaParterno() {
		return aParterno;
	}
	public void setaParterno(String aParterno) {
		this.aParterno = aParterno;
	}
	public String getaMaterno() {
		return aMaterno;
	}
	public void setaMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	public String getNotbook() {
		return notbook;
	}
	public void setNotbook(String notbook) {
		this.notbook = notbook;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
	public AlumnoEntity(int idAlumno, String aNombre, String aParterno, String aMaterno, String telefono, String email, String carrera, String notbook, String status) {
		super();
		this.idAlumno = idAlumno;
		this.aNombre = aNombre;
		this.aParterno = aParterno;
		this.aMaterno = aMaterno;
		this.telefono = telefono;
		this.email = email;
		this.carrera = carrera;
		this.notbook = notbook;
		this.status = status;
	}
}
