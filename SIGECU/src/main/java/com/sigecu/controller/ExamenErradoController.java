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
import com.sigecu.service.ExamenErradoService;
import com.sigecu.service.ValidarExamenAlumnoService;

/**
 * @author Anel
 *
 */


@Controller
@PreAuthorize("hasRole('ROLE_ALUMNO')")
@RequestMapping("/ExamenErrado")
public class ExamenErradoController {
	
	private static final Log LOG = LogFactory.getLog(ExamenErradoController.class);
	private User user;
	AlumnoModel alumnoModel;

	@Autowired
	@Qualifier("ExamenErradoServiceImplement")
	private ExamenErradoService examenErradoService;
	
	@Autowired
	@Qualifier("EvaluacionAlumnoImpl")
	private EvaluacionAlumnoService EvaluacionAlumnoService;
	@Autowired
	@Qualifier("defineUsuario")
	private DefineUsuarioService defineUsuario;
	@Autowired
	@Qualifier("validarRealizarExamen")
	private ValidarExamenAlumnoService validaRealizarExamenAlumno;

	@GetMapping("/ExamenErrado1")
	public ModelAndView ExamenErrado1(@RequestParam(name="idEvento", required=true)int idEvento,
			@RequestParam(name="idEvaluacion", required=true)int idEvaluacion, 
			Model model) {


		//int idEvaluacion=3;
		user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		alumnoModel =defineUsuario.buscarUsuarioAlumno(user.getUsername());

		PreguntasModel preModel = new PreguntasModel();
		RespuestasModel respuestasModel = new RespuestasModel();
		ModelAndView mav = new ModelAndView(ViewConstant.NUEVO_EXAMENERRADO);
		mav.addObject("listaPreguntas", examenErradoService.listarPreguntasByExamErrado(idEvaluacion)); //id examen, preguntas erradas
		mav.addObject("listaRespuestas", examenErradoService.listarRespuestas());
		mav.addObject("user", alumnoModel );
		// agregar respuestas
		model.addAttribute("respuestasModel", respuestasModel);
		model.addAttribute("preModel", preModel);
		model.addAttribute("idEvaluacion", idEvaluacion);
		model.addAttribute("eTiempo",EvaluacionAlumnoService.tiempoExamen(1));


		return mav;
	}


}
