package com.sigecu.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sigecu.constant.ViewConstant;

@Controller
@RequestMapping("/Notificacion")
public class EvaluacionAlumController {
	private static final Log LOG = LogFactory.getLog(EvaluacionAlumController.class);
	
	@GetMapping("/mostrarExamen")
	public ModelAndView mostrarExamen(){
		ModelAndView mav = new ModelAndView(ViewConstant.MOSTRAREXAMEN);
		return mav;
	}
}
