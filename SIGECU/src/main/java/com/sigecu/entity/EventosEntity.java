package com.sigecu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "eventos")
public class EventosEntity {
	
	
	@Id
	@GeneratedValue (strategy= GenerationType.AUTO)
	@Column(name="idevento",unique=true,nullable=false)
	private int idevento;
	
	@Column(name="c_idcurso")
	private int c_idcurso;
	
	@Column(name="i_idinstructor")
	private int i_idinstructor;
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
	@Column(name="lugar_idlugar")
	private int lugar_idlugar;
	@Column(name="t_idtempletes")
	private int t_idtempletes;
	@Column(name="eCapacidad")
	private String eCapacidad;
	@Column(name="eTipo")
	private String eTipo;
	@Column(name="eEstatus")
	private String eEstatus;
	
	public int getIdevento() {
		return idevento;
	}
	public void setIdevento(int idevento) {
		this.idevento = idevento;
	}
	public int getC_idcurso() {
		return c_idcurso;
	}
	public void setC_idcurso(int c_idcurso) {
		this.c_idcurso = c_idcurso;
	}
	public int getI_idinstructor() {
		return i_idinstructor;
	}
	public void setI_idinstructor(int i_idinstructor) {
		this.i_idinstructor = i_idinstructor;
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
	public int getLugar_idlugar() {
		return lugar_idlugar;
	}
	public void setLugar_idlugar(int lugar_idlugar) {
		this.lugar_idlugar = lugar_idlugar;
	}
	public int getT_idtempletes() {
		return t_idtempletes;
	}
	public void setT_idtempletes(int t_idtempletes) {
		this.t_idtempletes = t_idtempletes;
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
	
	public EventosEntity(int idevento, int c_idcurso, int i_idinstructor, String eDescripcion, 
			String eFechaInicio, String eFechaTermino, String ePrograma, String eHorario,
			int lugar_idlugar, int t_idtempletes, String eCapacidad, String eTipo, String eEstatus) {
		super();
		this.idevento = idevento;
		this.c_idcurso = c_idcurso;
		this.i_idinstructor = i_idinstructor;
		this.eDescripcion = eDescripcion;
		this.eFechaInicio = eFechaInicio;
		this.eFechaTermino = eFechaTermino;
		this.ePrograma = ePrograma;
		this.eHorario = eHorario;
		this.lugar_idlugar = lugar_idlugar;
		this.t_idtempletes = t_idtempletes;
		this.eCapacidad = eCapacidad;
		this.eHorario = eHorario;
		this.eTipo = eTipo;
		this.eEstatus = eEstatus;

	
}
	
}