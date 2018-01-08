package com.sigecu.controller;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sigecu.constant.ViewConstant;
import com.sigecu.service.EvaluacionAlumnoService;

@Controller
@RequestMapping("/EvaluacionAlumno")
public class EvaluacionAlumnoController {
	@Autowired
	@Qualifier("EvaluacionAlumnoImpl")
	private EvaluacionAlumnoService EvaluacionAlumnoService;
	private static final Log LOG = LogFactory.getLog(EvaluacionAlumnoController.class);
	
	@GetMapping("/mostrarExamen")
	public ModelAndView mostrarExamen(Model model){
		ModelAndView mav = new ModelAndView(ViewConstant.MOSTRAREXAMEN);
		mav.addObject("eTiempo",EvaluacionAlumnoService.tiempoExamen(1));
		return mav;
	}

}
