package com.sigecu.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sigecu.constant.ViewConstant;
import com.sigecu.model.EvaluacionesModel;
import com.sigecu.service.EvaluacionAlumnoService;

@Controller
@RequestMapping("/EvaluacionAlumno")
public class EvaluacionAlumController {
	private static final Log LOG = LogFactory.getLog(EvaluacionAlumController.class);
	
	@Autowired
	@Qualifier("evaluacionAlumnoServiceImpl")
	private EvaluacionAlumnoService EvaluacionAlumnoService;
	
	
	@GetMapping("/mostrarExamen")
	public ModelAndView mostrarExamen(@RequestParam(name="idEvaluacion") int idEvaluacion, Model model){
		EvaluacionesModel evalModel = new EvaluacionesModel();
		ModelAndView mav = new ModelAndView(ViewConstant.MOSTRAREXAMEN);
		mav.addObject("NombreEvaluacion", EvaluacionAlumnoService.BuscarNombreEva(idEvaluacion));
		model.addAttribute("Examen", EvaluacionAlumnoService.BuscarNombreEva(idEvaluacion));
		return mav;
	}
}
