/**
 * 
 */
package com.sigecu.converter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;

import com.sigecu.entity.Alumno;
import com.sigecu.model.AlumnoModel;

/**
 * @author Rolando Castillo
 * @contact castillomartinez@acm.org
 * @Fecha 09/01/2018
 *
 */
@Component("alumnosConverter")
public class AlumnosConverter {

private static final Log LOG = LogFactory.getLog(CertificadoConverter.class);
	
	//entity -- to -- model
	public AlumnoModel converterAlumnoToAlumnoModel(Alumno alumno) {
		AlumnoModel alumnoModel = new AlumnoModel();
		alumnoModel.setId_alumno(alumno.getId_alumno());
		alumnoModel.setA_nombre(alumno.getA_nombre());
		alumnoModel.setA_paterno(alumno.getA_paterno());
		alumnoModel.setA_materno(alumno.getA_materno());
		alumnoModel.setA_carrera(alumno.getA_carrera());
		alumnoModel.setA_email(alumno.getA_email());
		alumnoModel.setA_telefono(alumno.getA_telefono());
		alumnoModel.setA_notebook(alumno.getA_notebook());
		alumnoModel.setA_status(alumno.getA_status());
		LOG.info("ALUMNO se convierte a MODEL");
		return alumnoModel;
	}
	
	//model -- to -- entity
	

}
