/**
 * 
 */
package com.sigecu.model;

import com.sigecu.entity.Preguntas;

/**
 * @author Rolando Castillo
 * @contact castillomartinez@acm.org
 * @Fecha 19/12/2017
 *
 */
public class RespuestasModel {

	/**
	 * 
	 */
	private int idRespuesta;
	private String rRespuesta;
	private String rSolucion;
	private Preguntas pregunta;
	
	
	public RespuestasModel() {
		// TODO Auto-generated constructor stub
	}
	public String toString() {
		return "idRespuesta: "+idRespuesta+" rRespuesta: "+ rRespuesta+ " rSolucion"+ rSolucion;
	}
	/**
	 * @return the idRespuesta
	 */
	public int getIdRespuesta() {
		return idRespuesta;
	}
	/**
	 * @param idRespuesta the idRespuesta to set
	 */
	public void setIdRespuesta(int idRespuesta) {
		this.idRespuesta = idRespuesta;
	}
	/**
	 * @return the rRespuesta
	 */
	public String getrRespuesta() {
		return rRespuesta;
	}
	/**
	 * @param rRespuesta the rRespuesta to set
	 */
	public void setrRespuesta(String rRespuesta) {
		this.rRespuesta = rRespuesta;
	}
	/**
	 * @return the rSolucion
	 */
	public String getrSolucion() {
		return rSolucion;
	}
	/**
	 * @param rSolucion the rSolucion to set
	 */
	public void setrSolucion(String rSolucion) {
		this.rSolucion = rSolucion;
	}
	/**
	 * @return the pregunta
	 */
	public Preguntas getPregunta() {
		return pregunta;
	}
	/**
	 * @param pregunta the pregunta to set
	 */
	public void setPregunta(Preguntas pregunta) {
		this.pregunta = pregunta;
	}
	

}
