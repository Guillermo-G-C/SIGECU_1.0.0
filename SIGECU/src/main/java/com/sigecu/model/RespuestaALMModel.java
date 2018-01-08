package com.sigecu.model;
/**
 * @author Anel
 *
 */


public class RespuestaALMModel {
	private int idrespuestaALM;
	private RespuestasModel RespuestaModel;
	private int aE_idasignaExamen;
	private String seleccionada;
	public int getIdrespuestaALM() {
		return idrespuestaALM;
	}
	public void setIdrespuestaALM(int idrespuestaALM) {
		this.idrespuestaALM = idrespuestaALM;
	}

	
	
	public RespuestasModel getRespuestaModel() {
		return RespuestaModel;
	}
	public void setRespuestaModel(RespuestasModel respuestaModel) {
		RespuestaModel = respuestaModel;
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RespuestaALMModel [idrespuestaALM=" + idrespuestaALM + ", RespuestaModel=" + RespuestaModel
				+ ", aE_idasignaExamen=" + aE_idasignaExamen + ", seleccionada=" + seleccionada + "]";
	}

	



}
