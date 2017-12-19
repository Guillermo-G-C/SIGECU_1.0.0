package com.sigecu.entity;

import javax.jdo.annotations.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="eventos")
public class Evento {
	
	@Id
	@GeneratedValue
	@Column(name="idevento")
	private int idevento;
	@Column(name="edescripcion")
	private String descripcion;
	@Column(name="efechainicio")
	private String efechainicio;
	@Column(name="eprograma")
	private String eprograma;
	@Column(name="ehorario")
	private String ehorario;
	@Column(name="ecapacidad")
	private String ecapacidad;
	@Column(name="etipo")
	private String etipo;
	@Column(name="eestatus")
	private String eestatus;
	@ManyToMany
	private Alumno alumno;
	
	public Evento() {
	}
	
	public Evento(int idevento, String descripcion, String efechainicio, String eprograma, String ehorario,
			String ecapacidad, String etipo, String eestatus, Alumno alumno) {
		super();
		this.idevento = idevento;
		this.descripcion = descripcion;
		this.efechainicio = efechainicio;
		this.eprograma = eprograma;
		this.ehorario = ehorario;
		this.ecapacidad = ecapacidad;
		this.etipo = etipo;
		this.eestatus = eestatus;
		this.alumno = alumno;
	}

	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Evento [idevento=" + idevento + ", descripcion=" + descripcion + ", efechainicio=" + efechainicio
				+ ", eprograma=" + eprograma + ", ehorario=" + ehorario + ", ecapacidad=" + ecapacidad + ", etipo="
				+ etipo + ", eestatus=" + eestatus + ", alumno=" + alumno + "]";
	}

	
	/**
	 * @return the alumno
	 */
	public Alumno getAlumno() {
		return alumno;
	}

	/**
	 * @param alumno the alumno to set
	 */
	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	/**
	 * @return the idevento
	 */
	public int getIdevento() {
		return idevento;
	}
	/**
	 * @param idevento the idevento to set
	 */
	public void setIdevento(int idevento) {
		this.idevento = idevento;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the efechainicio
	 */
	public String getEfechainicio() {
		return efechainicio;
	}
	/**
	 * @param efechainicio the efechainicio to set
	 */
	public void setEfechainicio(String efechainicio) {
		this.efechainicio = efechainicio;
	}
	/**
	 * @return the eprograma
	 */
	public String getEprograma() {
		return eprograma;
	}
	/**
	 * @param eprograma the eprograma to set
	 */
	public void setEprograma(String eprograma) {
		this.eprograma = eprograma;
	}
	/**
	 * @return the ehorario
	 */
	public String getEhorario() {
		return ehorario;
	}
	/**
	 * @param ehorario the ehorario to set
	 */
	public void setEhorario(String ehorario) {
		this.ehorario = ehorario;
	}
	/**
	 * @return the ecapacidad
	 */
	public String getEcapacidad() {
		return ecapacidad;
	}
	/**
	 * @param ecapacidad the ecapacidad to set
	 */
	public void setEcapacidad(String ecapacidad) {
		this.ecapacidad = ecapacidad;
	}
	/**
	 * @return the etipo
	 */
	public String getEtipo() {
		return etipo;
	}
	/**
	 * @param etipo the etipo to set
	 */
	public void setEtipo(String etipo) {
		this.etipo = etipo;
	}
	/**
	 * @return the eestatus
	 */
	public String getEestatus() {
		return eestatus;
	}
	/**
	 * @param eestatus the eestatus to set
	 */
	public void setEestatus(String eestatus) {
		this.eestatus = eestatus;
	}
	
	
			

}
