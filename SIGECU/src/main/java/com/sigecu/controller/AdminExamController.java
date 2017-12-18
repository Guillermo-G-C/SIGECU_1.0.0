package com.sigecu.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

//import com.escuela.constant.ViewConstant;
///import com.sigecu.service.CursoService;

@Controller
@RequestMapping("/cursos")
public class AdminExamController {
	
	private static final Log LOG = LogFactory.getLog(AdminExamController.class);
	
//	@Autowired
//	@Qualifier("cursosServiceImpl")
//	private CursoService cursoService;
//	
	@GetMapping("/cancel")
	public String cancel() {
		return "redirect:/cursos/showCursos";
	}
	
	@GetMapping("/showalumnos")
	public ModelAndView showAlumnos() {
		ModelAndView mav = new ModelAndView("adminExamen");
		//mav.addObject("alumnos",alumnoService.listAllAlumnos());
		return mav;
	}
	
	@GetMapping("/certificado")
	public ModelAndView certificado() {
		ModelAndView mav = new ModelAndView("certificado");
		//mav.addObject("alumnos",alumnoService.listAllAlumnos());
		return mav;
	}
	
}
