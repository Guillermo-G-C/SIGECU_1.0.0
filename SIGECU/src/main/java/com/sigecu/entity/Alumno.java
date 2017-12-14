/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigecu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Anayeli Ramírez
 */
@Entity
@Table(name="alumno")
public class Alumno {
	@Id
	@GeneratedValue
	@Column(name="idalumno")
    private int idalumno;
	@Column(name="aNombre")
    private String aNombre;
	@Column (name="aPaterno")
	private String aPaterno;
	@Column (name="aMaterno")
	private String aMaterno;
	@Column (name="aTelefno")
	private String aTelefono;
	@Column (name="aEmail")
	private String aEmail;
	@Column (name="e_idEmpresa")
	private int e_idEmpresa;
	@Column (name="aCarrera")
	private String aCarrera;
	@Column (name="aNotebook")
	private String aNotebook;
	@Column (name="aStatus")
	private String aStatus;
	@Column (name="u_idusers")
	private int u_iduser;
	
	public Alumno() {
		
	}
	public Alumno(int idalumno, String aNombre, String aPaterno, String 
			aMaterno, String aTelefono, String aEmail, int e_idEmpresa, 
			String aCarrera, String aNotebook, String aStatus, int u_iduser) {
		this.idalumno=idalumno;
		this.aNombre=aNombre;
		this.aPaterno=aPaterno;
		this.aMaterno=aMaterno;
		this.aTelefono=aTelefono;
		this.aEmail=aEmail;
		this.e_idEmpresa=e_idEmpresa;
		this.aCarrera=aCarrera;
		this.aNotebook=aNotebook;
		this.aStatus=aStatus;
		this.u_iduser=u_iduser;
		
	}
	public String toString() {
		
		return "model";
	}
	/**
	 * @return the idalumno
	 */
	public int getIdalumno() {
		return idalumno;
	}
	/**
	 * @param idalumno the idalumno to set
	 */
	public void setIdalumno(int idalumno) {
		this.idalumno = idalumno;
	}
	/**
	 * @return the aNombre
	 */
	public String getaNombre() {
		return aNombre;
	}
	/**
	 * @param aNombre the aNombre to set
	 */
	public void setaNombre(String aNombre) {
		this.aNombre = aNombre;
	}
	/**
	 * @return the aPaterno
	 */
	public String getaPaterno() {
		return aPaterno;
	}
	/**
	 * @param aPaterno the aPaterno to set
	 */
	public void setaPaterno(String aPaterno) {
		this.aPaterno = aPaterno;
	}
	/**
	 * @return the aMaterno
	 */
	public String getaMaterno() {
		return aMaterno;
	}
	/**
	 * @param aMaterno the aMaterno to set
	 */
	public void setaMaterno(String aMaterno) {
		this.aMaterno = aMaterno;
	}
	/**
	 * @return the aTelefono
	 */
	public String getaTelefono() {
		return aTelefono;
	}
	/**
	 * @param aTelefono the aTelefono to set
	 */
	public void setaTelefono(String aTelefono) {
		this.aTelefono = aTelefono;
	}
	/**
	 * @return the aEmail
	 */
	public String getaEmail() {
		return aEmail;
	}
	/**
	 * @param aEmail the aEmail to set
	 */
	public void setaEmail(String aEmail) {
		this.aEmail = aEmail;
	}
	/**
	 * @return the e_idEmpresa
	 */
	public int getE_idEmpresa() {
		return e_idEmpresa;
	}
	/**
	 * @param e_idEmpresa the e_idEmpresa to set
	 */
	public void setE_idEmpresa(int e_idEmpresa) {
		this.e_idEmpresa = e_idEmpresa;
	}
	/**
	 * @return the aCarrera
	 */
	public String getaCarrera() {
		return aCarrera;
	}
	/**
	 * @param aCarrera the aCarrera to set
	 */
	public void setaCarrera(String aCarrera) {
		this.aCarrera = aCarrera;
	}
	/**
	 * @return the aNotebook
	 */
	public String getaNotebook() {
		return aNotebook;
	}
	/**
	 * @param aNotebook the aNotebook to set
	 */
	public void setaNotebook(String aNotebook) {
		this.aNotebook = aNotebook;
	}
	/**
	 * @return the aStatus
	 */
	public String getaStatus() {
		return aStatus;
	}
	/**
	 * @param aStatus the aStatus to set
	 */
	public void setaStatus(String aStatus) {
		this.aStatus = aStatus;
	}
	/**
	 * @return the u_iduser
	 */
	public int getU_iduser() {
		return u_iduser;
	}
	/**
	 * @param u_iduser the u_iduser to set
	 */
	public void setU_iduser(int u_iduser) {
		this.u_iduser = u_iduser;
	}
	
	
}
