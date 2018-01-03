package com.sigecu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alumno")
public class AlumnoEntity {
	 
	
	@Id
	@GeneratedValue
	@Column(name="idalumno")
	private int idAlumno;
	@Column(name="aNombre")
	private String aNombre;
	@Column(name="aPaterno")
	private String aPaterno;
	@Column(name="aMaterno")
	private String aMaterno;
	@Column(name="aTelefono")
	private String aTelefono;
	@Column (name="aEmail")
	private String aEmail;
	@Column (name="aCarrera")
	private String aCarrera;
	@Column (name="aNotbook")
	private String aNotbook;
	@Column (name="aStatus")
	private String aStatus;
	@Column (name="e_idEmpresa")
	private int e_idEmpresa;
	@Column (name="u_idusers")
	private int u_idusers;
	
	    
   //Contructor vacio
	public AlumnoEntity() {
		
	}
	//Constructor con argumentos	
	

	public AlumnoEntity(int idAlumno, String aNombre, String aPaterno, String aMaterno, String aTelefono, String aEmail,
			String aCarrera, String aNotbook, String aStatus, int e_idEmpresa, int u_idusers) {
		
		this.idAlumno = idAlumno;
		this.aNombre = aNombre;
		this.aPaterno = aPaterno;
		this.aMaterno = aMaterno;
		this.aTelefono = aTelefono;
		this.aEmail = aEmail;
		this.aCarrera = aCarrera;
		this.aNotbook = aNotbook;
		this.aStatus = aStatus;
		this.e_idEmpresa = e_idEmpresa;
		this.u_idusers = u_idusers;
	}
	
//Getter and Setter
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
	public String getaPaterno() {
		return aPaterno;
	}
	public void setaPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}
	public String getaMaterno() {
		return aMaterno;
	}
	public void setaMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}
	public String getaTelefono() {
		return aTelefono;
	}
	public void setaTelefono(String aTelefono) {
		this.aTelefono = aTelefono;
	}
	public String getaEmail() {
		return aEmail;
	}
	public void setaEmail(String aEmail) {
		this.aEmail = aEmail;
	}
	public String getaCarrera() {
		return aCarrera;
	}
	public void setaCarrera(String aCarrera) {
		this.aCarrera = aCarrera;
	}
	public String getaNotbook() {
		return aNotbook;
	}
	public void setaNotbook(String aNotbook) {
		this.aNotbook = aNotbook;
	}
	public String getaStatus() {
		return aStatus;
	}
	public void setaStatus(String aStatus) {
		this.aStatus = aStatus;
	}
	public int getE_idEmpresa() {
		return e_idEmpresa;
	}
	public void setE_idEmpresa(int e_idEmpresa) {
		this.e_idEmpresa = e_idEmpresa;
	}
	public int getU_idusers() {
		return u_idusers;
	}
	public void setU_idusers(int u_idusers) {
		this.u_idusers = u_idusers;
	}
}
