/**
 * 
 */
package com.sigecu.model;

/**
 * @author Rolando Castillo
 *
 */
public class AlumnoModel {

	/**
	 * Clase encapsuda de alumnos
	 */
	private int id;
	private String nombre;
	private String usuario;
	private String email;
	private String passw;
	
	public AlumnoModel() {
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the passw
	 */
	public String getPassw() {
		return passw;
	}

	/**
	 * @param passw the passw to set
	 */
	public void setPassw(String passw) {
		this.passw = passw;
	}
	public AlumnoModel(int id, String nombre, String usuario, String email, String passw) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.usuario = usuario;
		this.email = email;
		this.passw = passw;
	}
		
	@Override
	public String toString() {
		return "AlumnoModel [id=" + id + ", nombre=" + nombre + ", usuario=" + usuario + ", email="
				+ email + ", passw =" + passw + "]";
	}
}
