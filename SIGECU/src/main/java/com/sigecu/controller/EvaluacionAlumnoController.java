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
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sigecu.constant.ViewConstant;
import com.sigecu.model.AlumnoModel;
import com.sigecu.model.EvaluacionesModel;
import com.sigecu.model.PreguntasModel;
import com.sigecu.model.RespuestasModel;
import com.sigecu.service.AdminExamService;
import com.sigecu.service.DefineUsuarioService;
import com.sigecu.service.EvaluacionAlumnoService;





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
	@Qualifier("defineUsuario")
	private DefineUsuarioService defineUsuario;

	@GetMapping("/mostrarExamen")
	public ModelAndView mostrarExamenN(@RequestParam(name="idEvaluacion", required=false)int idEvaluacion, Model model) {
		PreguntasModel preModel = new PreguntasModel();
		RespuestasModel respuestasModel = new RespuestasModel();
		user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		alumnoModel =defineUsuario.buscarUsuarioAlumno(user.getUsername());
		
		
		
		ModelAndView mav = new ModelAndView(ViewConstant.MOSTRAR_EXAMEN);
		mav.addObject("listaPreguntas", evaluacionAlumnoService.listarPreguntasByEvaluacionAlumno(idEvaluacion)); //id examen, preguntas 
		mav.addObject("listaRespuestas", evaluacionAlumnoService.listarRespuestas());
		
		// agregar respuestas
		model.addAttribute("respuestasModel", respuestasModel);
		model.addAttribute("preModel", preModel);
		model.addAttribute("idEvaluacion", idEvaluacion);
		model.addAttribute("eTiempo",evaluacionAlumnoService.tiempoExamen(idEvaluacion));

		return mav;
	}


}
