
package com.sigecu.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Column;

@Entity
@Table(name = "alumno_has_eventos")
public class AlumnoHasEventoEntity {
	
	@Id
	@GeneratedValue
	@Column(name="idAlumno_has_Evento")
	private int idAlumno_has_Evento;

	//@ManyToOne
	//@JoinColumn(name="a_idalumno") 
	//private AlumnoEntity alumno;
	
	//@ManyToOne
	//@JoinColumn(name="e_idevento")
	//private EventoEntity eventos;
	
		
	//@ManyToOne
	//@JoinColumn(name="aE_idasignaExamen")
	//private AsignaExamenEntity asigna;
	
	
	@Column(name="confirmado")
	private String confirmado;
	@Column(name="activo")
	private String activo;
	
	
	public String getConfirmado() {
		return confirmado;
	}
	public void setConfirmado(String confirmado) {
		this.confirmado = confirmado;
	}
	public String getActivo() {
		return activo;
	}
	public void setActivo(String activo) {
		this.activo = activo;
	}
	
	public AlumnoHasEventoEntity(String confirmado, String activo) {
		super();
		this.confirmado = confirmado;
		this.activo = activo;
		
	}

}
