package com.sigecu.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sigecu.constant.ViewConstant;
import com.sigecu.model.AlumnoModel;
import com.sigecu.service.DefineUsuarioService;
import com.sigecu.service.PreguntasErradasConService;

@Controller
@PreAuthorize("hasRole('ROLE_ALUMNO')")
@RequestMapping("/realizarExamen")
public class examenjoshControler {

	private static final Log LOG = LogFactory.getLog(examenjoshControler.class);
	
	@Autowired
	@Qualifier("defineUsuario")
	private DefineUsuarioService defineUsuario;
	
	private User user;
	AlumnoModel alumnoModel;
	
	@Autowired
	@Qualifier("preErradasServiceImpl")
	private PreguntasErradasConService preguntasErradasConService;
	
	@GetMapping("/evaluacion")
	public ModelAndView preguntasErradas(@RequestParam(name = "idEvaluacion",required = false)
	int idEvaluacion) {
		ModelAndView mav = new ModelAndView(ViewConstant.EXAMEN_JO);
		user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		alumnoModel =defineUsuario.buscarUsuarioAlumno(user.getUsername());
		mav.addObject("listaPreguntas", preguntasErradasConService.listarPregunrasByExam(idEvaluacion));
		mav.addObject("listaRespuestas", preguntasErradasConService.listarRespuestas(idEvaluacion));
		//mav.addObject("listaResAlm",preguntasErradasConService.listarRespuestasAlumno());
		mav.addObject("user", alumnoModel );
		return mav;
		
	}
}
