/**
 * 
 */
package com.sigecu.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Dell
 *
 */
@Entity
@Table(name="respuestaalm")
public class RespuestaALM {

	@Id
	@GeneratedValue
	@Column (name="idrespuestaalm")
	private int idrespuestaalm;
	@Column (name="seleccionada")
	private String seleccionada;
	@ManyToOne
	@JoinColumn(name="idasignaexamen")
	private AsignarExamen asigarexamen ;
	
	@ManyToOne
	@JoinColumn(name="r_idrespuesta")
	private Respuestas respuestas;
	
	
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
	 * @return the asigarexamen
	 */
	public AsignarExamen getAsigarexamen() {
		return asigarexamen;
	}
	/**
	 * @param asigarexamen the asigarexamen to set
	 */
	public void setAsigarexamen(AsignarExamen asigarexamen) {
		this.asigarexamen = asigarexamen;
	}
	/**
	 * @return the idrespuestaalm
	 */
	public int getIdrespuestaalm() {
		return idrespuestaalm;
	}
	/**
	 * @param idrespuestaalm the idrespuestaalm to set
	 */
	public void setIdrespuestaalm(int idrespuestaalm) {
		this.idrespuestaalm = idrespuestaalm;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "respuestaalm [idrespuestaalm=" + idrespuestaalm + ", seleccionada=" + seleccionada + "]";
	}
	public RespuestaALM(int idrespuestaalm, String seleccionada) {
		super();
		this.idrespuestaalm = idrespuestaalm;
		this.seleccionada = seleccionada;
	}
	public RespuestaALM() {
		
	}
	
	
}
