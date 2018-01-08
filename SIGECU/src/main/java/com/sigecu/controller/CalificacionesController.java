package com.sigecu.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sigecu.constant.ViewConstant;
import com.sigecu.service.CalificacionService;
import com.sigecu.service.EvaluacionAlumnoService;

@Controller
@RequestMapping("/calificaciones")
public class CalificacionesController {
	@Autowired
	@Qualifier("EvaluacionAlumnoImpl")
	private EvaluacionAlumnoService EvaluacionAlumnoService;
	
	
	@Autowired
	@Qualifier("CalificacionImplement")
	private CalificacionService calificacionService;
	
	private static final Log LOG = LogFactory.getLog(CalificacionesController.class);
	
	@GetMapping("/mostrarCalificaciones")
	public ModelAndView mostrarExamen(Model model){
		ModelAndView mav = new ModelAndView(ViewConstant.CALIFICACIONEXAMEN );
		//mav.addObject("ePorsentaje",EvaluacionAlumnoService.calificacion(1));
		mav.addObject("ePorsentaje",calificacionService.calificacionFnl());
		mav.addObject("aciertos",calificacionService.aciertosPregunta());
		mav.addObject("errores",calificacionService.erroresPregunta());
		return mav;
	}
	
}
