package com.sigecu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
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
	
	@ManyToOne
	@JoinColumn(name="r_idRespuesta")
	private Respuestas respuestas;
	
	

	
	
	@Column(name="seleccionada")
	private String seleccionada;
	
	public int getIdrespuestaALM() {
		return idrespuestaALM;
	}
	public void setIdrespuestaALM(int idrespuestaALM) {
		this.idrespuestaALM = idrespuestaALM;
	}
	
	public String getSeleccionada() {
		return seleccionada;
	}
	public void setSeleccionada(String seleccionada) {
		this.seleccionada = seleccionada;
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
	public RespuestaALMEntity() {
		
	}
	
	public RespuestaALMEntity(int idrespuestaALM, String seleccionada) {
		super();
		this.idrespuestaALM = idrespuestaALM;
		
		this.seleccionada = seleccionada;
	}
	
	
	


}
