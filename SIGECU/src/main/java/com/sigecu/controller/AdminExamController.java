package com.sigecu.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sigecu.constant.ViewConstant;
import com.sigecu.service.AdminExamService;

//import com.escuela.constant.ViewConstant;
///import com.sigecu.service.CursoService;

@Controller
@RequestMapping("/adminExamen")
public class AdminExamController {

	private static final Log LOG = LogFactory.getLog(AdminExamController.class);

	@Autowired
	@Qualifier("adminExamServiceImpl")
	private AdminExamService adminExamService;

	@GetMapping("/listaExamen")
	public ModelAndView showExamenes(@RequestParam(name="idCurso", required=false) int idCurso, Model model) {
		ModelAndView mav = new ModelAndView(ViewConstant.LISTAR_EXAMEN);
		mav.addObject("listaExamen", adminExamService.listAllEvaluaciones(idCurso));
		return mav;
	}
	@GetMapping("/listaCursos")
	public ModelAndView showCursos() {
		ModelAndView mav = new ModelAndView(ViewConstant.LISTAR_CURSOS);
		mav.addObject("listaCursos", adminExamService.listaCursos());
		
		return mav;
	}

	@GetMapping("/nuevoExamen")
	public ModelAndView nuevoExamen() {
		ModelAndView mav = new ModelAndView(ViewConstant.NUEVO_EXAMEN);
		return mav;
	}

	//
	// @PostMapping("/addalumno")
	// public String addAlumno(@ModelAttribute(name="alumnoModel") AlumnoModel
	// alumnoModel,
	// Model model) {
	// LOG.info("METHOD: addAlumno() -- PARAMS: " + alumnoModel.toString());
	//
	// if(null != alumnoService.addAlumno(alumnoModel)) {
	// model.addAttribute("result",1);
	// }else {
	// model.addAttribute("result",0);
	// }
	// return "redirect:/alumnos/showalumnos";
	// }

}
