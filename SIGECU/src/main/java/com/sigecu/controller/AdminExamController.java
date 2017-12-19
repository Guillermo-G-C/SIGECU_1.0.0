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
import com.sigecu.model.EvaluacionesModel;
import com.sigecu.model.PreguntasModel;
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
	public ModelAndView showExamenes(@RequestParam(name = "idCurso", required = false) int idCurso, Model model) {
		EvaluacionesModel evalModel = new EvaluacionesModel();
		ModelAndView mav = new ModelAndView(ViewConstant.LISTAR_EXAMEN);
		mav.addObject("listaExamen", adminExamService.listAllEvaluaciones(idCurso));
		model.addAttribute("evaluacionesModel", evalModel);
		model.addAttribute("idCurso", idCurso);
		return mav;
	}
	@GetMapping("/listaCursos")
	public ModelAndView showCursos() {
		ModelAndView mav = new ModelAndView(ViewConstant.LISTAR_CURSOS);
		mav.addObject("listaCursos", adminExamService.listaCursos());
		return mav;
	}

	@GetMapping("/nuevoExamen")
	public ModelAndView nuevoExamen(@RequestParam(name="idEvaluacion", required= false) int idEvaluacion, Model model) {
		PreguntasModel preModel = new PreguntasModel();		
		ModelAndView mav = new ModelAndView(ViewConstant.NUEVO_EXAMEN);
		mav.addObject("listaPreguntas", adminExamService.listarPregunrasByExam(idEvaluacion));
		model.addAttribute("preModel", preModel);
		model.addAttribute("idEvaluacion", idEvaluacion);

		return mav;
	}

	@PostMapping("/addEvaluacion")
	public String addEvaluavion(@ModelAttribute(name="evaluacionesModel") EvaluacionesModel  evalModel, @RequestParam(name="idCurso", required=true) int idCurso,
			Model model) {
		LOG.info("METODO: addEvaluacion --- PARAMETROS "+evalModel.toString()+ " idCurso "+idCurso);
		adminExamService.nuevaEvaluacion(evalModel, idCurso);
		return "redirect:/adminExamen/listaExamen?idCurso="+idCurso;
	}
	
	@PostMapping("/addPregunta")
	public String addPregunta(@ModelAttribute(name="preguntasModel") PreguntasModel preguntasModel, @RequestParam(name="idEvaluacion", required=true) int idEvaluacion) {
		LOG.info("METODO: ADDPREGUNTA ---- PARAMETROS"+preguntasModel.toString()+" id evaluacione "+ idEvaluacion);
		adminExamService.nuevaPregunta(preguntasModel, idEvaluacion);
		return "redirect:/adminExamen/nuevoExamen?idEvaluacion="+idEvaluacion;
	}

}
