package com.sigecu.converter;

import org.springframework.stereotype.Component;

import com.sigecu.entity.Alumno;
import com.sigecu.model.AlumnoModel;



@Component("alumnoConverter")
public class AlumnoConverter {
	//private static final Log=LogFactory.getLog(AlumnoConverter.class);
	
	//Entidad a Modelo
	public AlumnoModel convetAlumnoToAlumnoModel(Alumno alumno) {
		AlumnoModel alumnoModel=new AlumnoModel();
		alumnoModel.setNombre(alumno.getA_nombre());;
		alumnoModel.setId(alumno.getId_alumno());
		return alumnoModel;
	}
	

}
