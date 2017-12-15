/**
 * 
 */
package com.sigecu.repository;
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sigecu.entity.Evaluaciones;

/**
 * @author Rolando Castillo
 * @contact castillomartinez@acm.org
 * @Fecha 14/12/2017
 *
 */
@Repository("evaluacionesRepository")
public interface EvaluacionRepository extends JpaRepository <Evaluaciones, Serializable> {
	//public abstract Evaluaciones findById(int idEvaluacion);
}
