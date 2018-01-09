/**
 * 
 */
package com.sigecu.service.implemt;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.sigecu.converter.AlumnosConverter;
import com.sigecu.entity.Alumno;
import com.sigecu.entity.Instructor;
import com.sigecu.entity.Users;
import com.sigecu.model.AlumnoModel;
import com.sigecu.repository.AlumnoRepository;
import com.sigecu.repository.InstructorRepository;
import com.sigecu.repository.UserRepository;
import com.sigecu.service.DefineUsuarioService;

/**
 * @author Rolando Castillo
 * @contact castillomartinez@acm.org
 * @Fecha 09/01/2018
 *
 */
@Service("defineUsuario")
public class DefineUsuario implements DefineUsuarioService{
	private static final Log LOG = LogFactory.getLog(DefineUsuario.class);
	
	@Autowired
	@Qualifier("userRepository")
	private UserRepository userRepository;
	
	@Autowired
	@Qualifier("instructorRepository")
	private InstructorRepository instructorRepository;
	@Autowired
	@Qualifier("alumnoRepository")
	private AlumnoRepository alumnoRepository;
	
	@Autowired
	@Qualifier("alumnosConverter")
	private AlumnosConverter alumnoConverter;
	
	/* (non-Javadoc)
	 * @see com.sigecu.service.DefineUsuarioService#buscarNombreUsuario(com.sigecu.entity.Users)
	 */
	@Override
	public AlumnoModel buscarUsuario(String user) {
		Users users =userRepository.findByUsername(user);
		LOG.info("USER TIENE ROLE: "+users.getUserRole().size());
		Alumno alumno= alumnoRepository.findByUser(users);
		AlumnoModel alumnoModel = alumnoConverter.converterAlumnoToAlumnoModel(alumno);
		return alumnoModel;
	}


}
