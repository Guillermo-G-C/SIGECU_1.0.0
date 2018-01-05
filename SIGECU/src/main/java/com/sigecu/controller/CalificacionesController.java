package com.sigecu.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sigecu.constant.ViewConstant;

@Controller
@RequestMapping("/calificaciones")
public class CalificacionesController {
	private static final Log LOG = LogFactory.getLog(CalificacionesController.class);

	
	@GetMapping("/mostrarCalificaciones")
	public ModelAndView mostrarExamen(Model model){
		ModelAndView mav = new ModelAndView(ViewConstant.CALIFICACIONEXAMEN );
		//mav.addObject("eTiempo",EvaluacionAlumnoService.tiempoExamen(1));
		return mav;
}}
