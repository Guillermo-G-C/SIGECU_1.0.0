package com.sigecu.model;
/**
 * @author Anel
 *
 */
public class RespuestaALMModel {
	private int idrespuestaALM;
	private int r_idRespuesta;
	private int aE_idasignaExamen;
	private String seleccionada;
	public int getIdrespuestaALM() {
		return idrespuestaALM;
	}
	public void setIdrespuestaALM(int idrespuestaALM) {
		this.idrespuestaALM = idrespuestaALM;
	}
	public int getR_idRespuesta() {
		return r_idRespuesta;
	}
	public void setR_idRespuesta(int r_idRespuesta) {
		this.r_idRespuesta = r_idRespuesta;
	}
	public int getaE_idasignaExamen() {
		return aE_idasignaExamen;
	}
	public void setaE_idasignaExamen(int aE_idasignaExamen) {
		this.aE_idasignaExamen = aE_idasignaExamen;
	}
	public String getSeleccionada() {
		return seleccionada;
	}
	public void setSeleccionada(String seleccionada) {
		this.seleccionada = seleccionada;
	}
	
	@Override
	public String toString() {
		return "RespuestaALM [idrespuestaALM=" + idrespuestaALM + ", r_idRespuesta=" + r_idRespuesta + ", aE_idasignaExamen=" + aE_idasignaExamen + ", seleccionada="
				+ seleccionada + "]";
	}
	


}
