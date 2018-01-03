package com.sigecu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "eventos")
public class EventoEntity {
	
	@Id
	@GeneratedValue
	@Column(name="idevento")
	private int idEvento;
	@Column(name="c_idcursos")
	private int c_idcursos;
	
	@Column(name="i_idInstructor")
	private int i_idInstructor;
	@Column(name="eDescripcion")
	private String eDescripcion;
	@Column(name="eFechaInicio")
	private String eFechaInicio;
	@Column(name="eFechaTermino")
	private String eFechaTermino;
	@Column(name="ePrograma")
	private String ePrograma;
	@Column(name="eHorario")
	private String eHorario;
	@Column(name="lugar_idLugar")
	private int lugar_idLugar;
	@Column(name="t_idtemplates")
	private int t_idtemplates;
	@Column(name="eCapacidad")
	private String eCapacidad;
	@Column (name="eTipo")
	private String eTipo;
	@Column(name="eEstatus")
	private String eEstatus;

	
	
	
	
	//Getter and setter
	

	
	
	public int getIdEvento() {
		return idEvento;
	}
	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}
	
	public int getI_idInstructor() {
		return i_idInstructor;
	}
	public void setI_idInstructor(int i_idInstructor) {
		this.i_idInstructor = i_idInstructor;
	}
	public String geteDescripcion() {
		return eDescripcion;
	}
	public void seteDescripcion(String eDescripcion) {
		this.eDescripcion = eDescripcion;
	}
	public String geteFechaInicio() {
		return eFechaInicio;
	}
	public void seteFechaInicio(String eFechaInicio) {
		this.eFechaInicio = eFechaInicio;
	}
	public String geteFechaTermino() {
		return eFechaTermino;
	}
	public void seteFechaTermino(String eFechaTermino) {
		this.eFechaTermino = eFechaTermino;
	}
	public String getePrograma() {
		return ePrograma;
	}
	public void setePrograma(String ePrograma) {
		this.ePrograma = ePrograma;
	}
	public String geteHorario() {
		return eHorario;
	}
	public void seteHorario(String eHorario) {
		this.eHorario = eHorario;
	}
	public int getLugar_idLugar() {
		return lugar_idLugar;
	}
	public void setLugar_idLugar(int lugar_idLugar) {
		this.lugar_idLugar = lugar_idLugar;
	}
	public int getT_idtemplates() {
		return t_idtemplates;
	}
	public void setT_idtemplates(int t_idtemplates) {
		this.t_idtemplates = t_idtemplates;
	}
	public String geteCapacidad() {
		return eCapacidad;
	}
	public void seteCapacidad(String eCapacidad) {
		this.eCapacidad = eCapacidad;
	}
	public String geteTipo() {
		return eTipo;
	}
	public void seteTipo(String eTipo) {
		this.eTipo = eTipo;
	}
	public String geteEstatus() {
		return eEstatus;
	}
	public void seteEstatus(String eEstatus) {
		this.eEstatus = eEstatus;
	}
	public int getC_idcursos() {
		return c_idcursos;
	}
	public void setC_idcursos(int c_idcursos) {
		this.c_idcursos = c_idcursos;
	}
	
	
	
}
	
	
	

	

