/**
 * 
 */
package com.sigecu.model;

/**
 * @author Rolando Castillo
 * @contact castillomartinez@acm.org
 * @Fecha 05/01/2018
 *
 */
public class InstructorModel {
	
	private int id;
	private String carrera;
	private String i_direccion;
	private String i_email;
	private String i_materno;
	private String i_nombre;
	private String i_paterno;
	private String i_telefono;
	/**
	 * 
	 */
	public InstructorModel() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the carrera
	 */
	public String getCarrera() {
		return carrera;
	}
	/**
	 * @param carrera the carrera to set
	 */
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}
	/**
	 * @return the i_direccion
	 */
	public String getI_direccion() {
		return i_direccion;
	}
	/**
	 * @param i_direccion the i_direccion to set
	 */
	public void setI_direccion(String i_direccion) {
		this.i_direccion = i_direccion;
	}
	/**
	 * @return the i_email
	 */
	public String getI_email() {
		return i_email;
	}
	/**
	 * @param i_email the i_email to set
	 */
	public void setI_email(String i_email) {
		this.i_email = i_email;
	}
	/**
	 * @return the i_materno
	 */
	public String getI_materno() {
		return i_materno;
	}
	/**
	 * @param i_materno the i_materno to set
	 */
	public void setI_materno(String i_materno) {
		this.i_materno = i_materno;
	}
	/**
	 * @return the i_nombre
	 */
	public String getI_nombre() {
		return i_nombre;
	}
	/**
	 * @param i_nombre the i_nombre to set
	 */
	public void setI_nombre(String i_nombre) {
		this.i_nombre = i_nombre;
	}
	/**
	 * @return the i_paterno
	 */
	public String getI_paterno() {
		return i_paterno;
	}
	/**
	 * @param i_paterno the i_paterno to set
	 */
	public void setI_paterno(String i_paterno) {
		this.i_paterno = i_paterno;
	}
	/**
	 * @return the i_telefono
	 */
	public String getI_telefono() {
		return i_telefono;
	}
	/**
	 * @param i_telefono the i_telefono to set
	 */
	public void setI_telefono(String i_telefono) {
		this.i_telefono = i_telefono;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "InstructorModel [carrera=" + carrera + ", i_direccion=" + i_direccion + ", i_email=" + i_email
				+ ", i_materno=" + i_materno + ", i_nombre=" + i_nombre + ", i_paterno=" + i_paterno + ", i_telefono="
				+ i_telefono + "]";
	}
	
	

}
