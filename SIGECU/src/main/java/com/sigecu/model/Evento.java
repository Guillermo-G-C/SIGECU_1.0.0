/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sigecu.model;
/**
 *
 * @author rolando
 */
public class Evento {
    private int idevento;
    private int c_idcursos;
    private int i_idinstructor;
    private String fechaInicio;
    private String fechaTermino;
    private String descripcion;
    private String  horario;
    private String programa;
    private int l_idlugar;
    private  String capacidad;
    private String status;
    private int t_templete;
    private String tipo;
    
    
    
    
    
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public int getIdevento() {
		return idevento;
	}
	public void setIdevento(int idevento) {
		this.idevento = idevento;
	}
	public int getC_idcursos() {
		return c_idcursos;
	}
	public void setC_idcursos(int c_idcursos) {
		this.c_idcursos = c_idcursos;
	}
	public int getI_idinstructor() {
		return i_idinstructor;
	}
	public void setI_idinstructor(int i_idinstructor) {
		this.i_idinstructor = i_idinstructor;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getFechaTermino() {
		return fechaTermino;
	}
	public void setFechaTermino(String fechaTermino) {
		this.fechaTermino = fechaTermino;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	public int getL_idlugar() {
		return l_idlugar;
	}
	public void setL_idlugar(int l_idlugar) {
		this.l_idlugar = l_idlugar;
	}
	public String getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getT_templete() {
		return t_templete;
	}
	public void setT_templete(int t_templete) {
		this.t_templete = t_templete;
	}

    

}
