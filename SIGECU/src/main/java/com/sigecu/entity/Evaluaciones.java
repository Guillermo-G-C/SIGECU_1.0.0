package com.sigecu.entity;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*
 * @author Rolando Castillo 
 * @contact castillomartinez@acm.org
 * */

@Entity
@Table (name="evaluaciones")
public class Evaluaciones {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name="idEvaluacion")
	private int idEvaluacion;
	@Column(name="eNombre")
	private String eNombre;
	@Column(name="eTiempo")
	private Time eTiempo;
	@Column (name="ePorsentaje")
	private String ePorsentaje;
	
	@ManyToOne
	private Cursos cursos;
	
	public Evaluaciones() {
		
	}
	public Evaluaciones(int idEvaluacion, String eNombre, Time eTiempo, String ePorsentaje)  {
		this.idEvaluacion=idEvaluacion;
		this.eNombre=eNombre;
		this.eTiempo=eTiempo;
		this.ePorsentaje=ePorsentaje;
		
	}

	/**
	 * @return the idEvaluacion
	 */
	public int getIdEvaluacion() {
		return idEvaluacion;
	}

	/**
	 * @param idEvaluacion the idEvaluacion to set
	 */
	public void setIdEvaluacion(int idEvaluacion) {
		this.idEvaluacion = idEvaluacion;
	}

	/**
	 * @return the eNombre
	 */
	public String geteNombre() {
		return eNombre;
	}

	/**
	 * @param eNombre the eNombre to set
	 */
	public void seteNombre(String eNombre) {
		this.eNombre = eNombre;
	}

	/**
	 * @return the eTiempo
	 */
	public Time geteTiempo() {
		return eTiempo;
	}

	/**
	 * @param eTiempo the eTiempo to set
	 */
	public void seteTiempo(Time eTiempo) {
		this.eTiempo = eTiempo;
	}

	/**
	 * @return the ePorsentaje
	 */
	public String getePorsentaje() {
		return ePorsentaje;
	}

	/**
	 * @param ePorsentaje the ePorsentaje to set
	 */
	public void setePorsentaje(String ePorsentaje) {
		this.ePorsentaje = ePorsentaje;
	}

	/**
	 * @return the cursos
	 */
	public Cursos getCursos() {
		return cursos;
	}

	/**
	 * @param cursos the cursos to set
	 */
	public void setCursos(Cursos cursos) {
		this.cursos = cursos;
	}
	
	
}
