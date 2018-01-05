package com.sigecu.repository;


import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sigecu.entity.Evaluaciones;

@Repository("evaluacionAlumnoRepository")
public interface EvaluacionAlumnoRepository extends JpaRepository <Evaluaciones, Serializable>{
	
	//Busca por nombre Evaluacion 
	public abstract Evaluaciones findByIdEvaluacion(int idEvaluacion);
	
	
	
	
	
	

}
