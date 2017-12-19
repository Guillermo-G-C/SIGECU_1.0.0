package com.sigecu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "asignarexamen")
public class AsignarExamen {

	@Id
	@GeneratedValue
	@Column(name = "idasignaexamen")
	private int idasignaexamen;
	@Column(name = "asignado")
	private String asignado;
	@Column(name = "fechainicio")
	private String fechainicio;
	@Column(name = "fechafin")
	private String fechafin;
	@Column(name = "horainicio")
	private String horainicio;
	@Column(name = "horafin")
	private String horafin;
	@Column(name = "realizado")
	private String realizado;
	@Column(name = "status")
	private String status;

	@OneToMany
	 @JoinColumn(name="aeidasignarexamen")
	private RespuestaALM respuestaalm;
	
	
	/**
	 * @return the respuestaalm
	 */
	public RespuestaALM getRespuestaalm() {
		return respuestaalm;
	}

	/**
	 * @param respuestaalm the respuestaalm to set
	 */
	public void setRespuestaalm(RespuestaALM respuestaalm) {
		this.respuestaalm = respuestaalm;
	}

	public AsignarExamen() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AsignarExamen [idasignaexamen=" + idasignaexamen + ", asignado=" + asignado + ", fechainicio="
				+ fechainicio + ", fechafin=" + fechafin + ", horainicio=" + horainicio + ", horafin=" + horafin
				+ ", realizado=" + realizado + ", status=" + status + "]";
	}

	

	public AsignarExamen(int idasignaexamen, String asignado, String fechainicio, String fechafin, String horainicio,
			String horafin, String realizado, String status, RespuestaALM respuestaalm) {
		super();
		this.idasignaexamen = idasignaexamen;
		this.asignado = asignado;
		this.fechainicio = fechainicio;
		this.fechafin = fechafin;
		this.horainicio = horainicio;
		this.horafin = horafin;
		this.realizado = realizado;
		this.status = status;
		this.respuestaalm = respuestaalm;
	}

	/**
	 * @return the idasignaexamen
	 */
	public int getIdasignaexamen() {
		return idasignaexamen;
	}

	/**
	 * @param idasignaexamen
	 *            the idasignaexamen to set
	 */
	public void setIdasignaexamen(int idasignaexamen) {
		this.idasignaexamen = idasignaexamen;
	}

	/**
	 * @return the asignado
	 */
	public String getAsignado() {
		return asignado;
	}

	/**
	 * @param asignado
	 *            the asignado to set
	 */
	public void setAsignado(String asignado) {
		this.asignado = asignado;
	}

	/**
	 * @return the fechainicio
	 */
	public String getFechainicio() {
		return fechainicio;
	}

	/**
	 * @param fechainicio
	 *            the fechainicio to set
	 */
	public void setFechainicio(String fechainicio) {
		this.fechainicio = fechainicio;
	}

	/**
	 * @return the fechafin
	 */
	public String getFechafin() {
		return fechafin;
	}

	/**
	 * @param fechafin
	 *            the fechafin to set
	 */
	public void setFechafin(String fechafin) {
		this.fechafin = fechafin;
	}

	/**
	 * @return the horainicio
	 */
	public String getHorainicio() {
		return horainicio;
	}

	/**
	 * @param horainicio
	 *            the horainicio to set
	 */
	public void setHorainicio(String horainicio) {
		this.horainicio = horainicio;
	}

	/**
	 * @return the horafin
	 */
	public String getHorafin() {
		return horafin;
	}

	/**
	 * @param horafin
	 *            the horafin to set
	 */
	public void setHorafin(String horafin) {
		this.horafin = horafin;
	}

	/**
	 * @return the realizado
	 */
	public String getRealizado() {
		return realizado;
	}

	/**
	 * @param realizado
	 *            the realizado to set
	 */
	public void setRealizado(String realizado) {
		this.realizado = realizado;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
