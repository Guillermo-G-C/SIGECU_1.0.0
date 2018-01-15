package com.sigecu.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "asignaExamen")

public class AsignaExamenEntity {
	
	@Id
	@GeneratedValue (strategy= GenerationType.AUTO)
	@Column(name="idAsignaExamen",unique=true,nullable=false)
	private int idAsignaExamen;
	@Column (name="asignado")
	private String asignado;
	@Column (name="fechaInicio")
	private String fechaInicio;
	@Column (name="fechaFin")
	private String fechaFin;
	@Column (name="horaInicio")
	private String horaInicio;
	@Column (name="horafin")
	private String horafin;
	@Column (name="realizado")
	private String realizado;
	@Column (name="status")
	private String status;
	@OneToMany(fetch=FetchType.EAGER, mappedBy="asignaExamen")
	private Set<RespuestaALMEntity> respuestasAML = new HashSet<>();
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="asignaExamen")
	private Set<Alumno_Has_Eventos> alumnoHasEvento = new HashSet<>(); 
	
	
	public int getIdAsignaExamen() {
		return idAsignaExamen;
	}
	public void setIdAsignaExamen(int idAsignaExamen) {
		this.idAsignaExamen = idAsignaExamen;
	}
	public Set<RespuestaALMEntity> getRespuestasAML() {
		return respuestasAML;
	}
	public void setRespuestasAML(Set<RespuestaALMEntity> respuestasAML) {
		this.respuestasAML = respuestasAML;
	}
	public String getAsignado() {
		return asignado;
	}
	public void setAsignado(String asignado) {
		this.asignado = asignado;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	public String getHorafin() {
		return horafin;
	}
	public void setHorafin(String horafin) {
		this.horafin = horafin;
	}
	public String getRealizado() {
		return realizado;
	}
	public void setRealizado(String realizado) {
		this.realizado = realizado;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	


	public AsignaExamenEntity() {
		
	}
	public AsignaExamenEntity(int idAsignaExamen, String asignado, String fechaInicio, String fechaFin,
			String horaInicio, String horafin, String realizado, String status, Set<RespuestaALMEntity> respuestasAML,
			Set<Alumno_Has_Eventos> alumnoHasEvento) {
		super();
		this.idAsignaExamen = idAsignaExamen;
		this.asignado = asignado;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.horaInicio = horaInicio;
		this.horafin = horafin;
		this.realizado = realizado;
		this.status = status;
		this.respuestasAML = respuestasAML;
		this.alumnoHasEvento = alumnoHasEvento;
	}
	

}





