package com.sigecu.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sigecu.constant.ViewConstant;
import com.sigecu.exception.BusinessException;
import com.sigecu.model.AlumnoModel;
import com.sigecu.model.PreguntasModel;
import com.sigecu.model.RespuestasModel;
import com.sigecu.service.DefineUsuarioService;
import com.sigecu.service.EvaluacionAlumnoService;
import com.sigecu.service.ValidarExamenAlumnoService;





@Controller
@PreAuthorize("hasRole('ROLE_ALUMNO')")
@RequestMapping("/EvaluacionAlumno")
public class EvaluacionAlumnoController {
	
	private static final Log LOG = LogFactory.getLog(EvaluacionAlumnoController.class);
	private User user;
	AlumnoModel alumnoModel;
	
	
	@Autowired
	@Qualifier("EvaluacionAlumnoImpl")
	private EvaluacionAlumnoService evaluacionAlumnoService;
	
	@Autowired
	@Qualifier("validarRealizarExamen")
	private ValidarExamenAlumnoService validaRealizarExamenAlumno;
	@Autowired
	@Qualifier("defineUsuario")
	private DefineUsuarioService defineUsuario;

	@GetMapping("/mostrarExamen")
	public ModelAndView mostrarExamenN(@RequestParam(name="idEvento", required=false)int idEvento,
			@RequestParam(name="idEvaluacion", required=false)int idEvaluacion,
			Model model) {
		
		ModelAndView mav = new ModelAndView();
		boolean validaActivo= false;
		user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		alumnoModel =defineUsuario.buscarUsuarioAlumno(user.getUsername());
		try {
			validaActivo = validaRealizarExamenAlumno.validaRealizarExamen(idEvaluacion, alumnoModel.getId_alumno(), idEvento);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			LOG.info("ID: "+e.getIdException()+" MENSAJE: "+e.getMsj());
			e.printStackTrace();
		} 
		if(validaActivo) {
			mav.setViewName(ViewConstant.MOSTRAR_EXAMEN);
			PreguntasModel preModel = new PreguntasModel();
			RespuestasModel respuestasModel = new RespuestasModel();

			mav.addObject("user", alumnoModel );
			mav.addObject("listaPreguntas", evaluacionAlumnoService.listarPreguntasByEvaluacionAlumno(idEvaluacion)); //id examen, preguntas 
			mav.addObject("listaRespuestas", evaluacionAlumnoService.listarRespuestas());
			
			// agregar respuestas
			model.addAttribute("respuestasModel", respuestasModel);
			model.addAttribute("preModel", preModel);
			model.addAttribute("idEvaluacion", idEvaluacion);
			model.addAttribute("eTiempo",evaluacionAlumnoService.tiempoExamen(idEvaluacion));
			return mav;
		}else {
			mav.setViewName(ViewConstant.EXAMEN_NO_ACTIVO);
			mav.addObject("idEvento", idEvento);
			return mav;
			
		}
		

		
	}


}
