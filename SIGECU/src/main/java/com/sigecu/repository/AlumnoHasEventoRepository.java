package com.sigecu.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sigecu.entity.AlumnoHasEvento;

@Repository("alumnoHasEventoRepository")
public interface AlumnoHasEventoRepository extends JpaRepository<AlumnoHasEvento, Serializable> {
	
	public abstract AlumnoHasEvento findAlumnoHasEventoByIdAHE(int idAHE);
	
}
