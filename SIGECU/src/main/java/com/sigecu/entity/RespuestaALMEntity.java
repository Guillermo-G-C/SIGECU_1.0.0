package com.sigecu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RespuestaALM")
public class RespuestaALMEntity {
	
	@Id
	@GeneratedValue (strategy= GenerationType.AUTO)
	@Column(name="idrespuestaALM",unique=true,nullable=false)
	private int idrespuestaALM;

	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="r_idRespuesta")
	private Respuestas respuestas;
	@Column(name="seleccionada")
	private String seleccionada;
	@ManyToOne(fetch =FetchType.EAGER)
	@JoinColumn(name="aIdAsignaExamen")
	private AsignaExamenEntity asignaExamen;
	/**
	 * @return the idrespuestaALM
	 */
	
	@JoinColumn(name="aE_idasignaExamen")
	private AsignaExamenEntity asigna;
	
	
	public RespuestaALMEntity(int idrespuestaALM, String seleccionada) {
		super();
		this.idrespuestaALM = idrespuestaALM;
		
		this.seleccionada = seleccionada;
	}

	
	public int getIdrespuestaALM() {
		return idrespuestaALM;
	}
	/**
	 * @param idrespuestaALM the idrespuestaALM to set
	 */
	public void setIdrespuestaALM(int idrespuestaALM) {
		this.idrespuestaALM = idrespuestaALM;
	}
	/**
	 * @return the respuestas
	 */
	public Respuestas getRespuestas() {
		return respuestas;
	}
	/**
	 * @param respuestas the respuestas to set
	 */
	public void setRespuestas(Respuestas respuestas) {
		this.respuestas = respuestas;
	}
	/**
	 * @return the seleccionada
	 */
	public String getSeleccionada() {
		return seleccionada;
	}
	/**
	 * @param seleccionada the seleccionada to set
	 */
	public void setSeleccionada(String seleccionada) {
		this.seleccionada = seleccionada;
	}
	/**
	 * @return the asignaExamen
	 */
	public AsignaExamenEntity getAsignaExamen() {
		return asignaExamen;
	}
	/**
	 * @param asignaExamen the asignaExamen to set
	 */
	public void setAsignaExamen(AsignaExamenEntity asignaExamen) {
		this.asignaExamen = asignaExamen;
	}
	
	


}
