/**
 * 
 */
package com.sigecu.repository;
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sigecu.entity.Evaluaciones;
import com.sigecu.entity.Preguntas;

/**
 * @author Rolando Castillo
 * @contact castillomartinez@acm.org
 * @Fecha 14/12/2017
 *
 */
@Repository("preguntasRepository")
public interface PreguntasRepository extends JpaRepository <Preguntas, Serializable> {
	//busca por idEvaluacion y regresa evaluacion
	public abstract Evaluaciones findByIdPregunta(int idPregunta);
}
