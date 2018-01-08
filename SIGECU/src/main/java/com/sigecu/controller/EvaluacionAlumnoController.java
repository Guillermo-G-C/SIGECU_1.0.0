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
import com.sigecu.model.RespuestasModel;
import com.sigecu.service.AdminExamService;
import com.sigecu.service.EvaluacionAlumnoService;





@Controller
@RequestMapping("/EvaluacionAlumno")
public class EvaluacionAlumnoController {
	
	private static final Log LOG = LogFactory.getLog(EvaluacionAlumnoController.class);

	
	
	@Autowired
	@Qualifier("EvaluacionAlumnoImpl")
	private EvaluacionAlumnoService evaluacionAlumnoService;

	@GetMapping("/mostrarExamen")
	public ModelAndView mostrarExamenN(Model model) {
		int idEvaluacion=3;
		PreguntasModel preModel = new PreguntasModel();
		RespuestasModel respuestasModel = new RespuestasModel();
		ModelAndView mav = new ModelAndView(ViewConstant.MOSTRAR_EXAMEN);
		mav.addObject("listaPreguntas", evaluacionAlumnoService.listarPreguntasByEvaluacionAlumno(idEvaluacion)); //id examen, preguntas 
		mav.addObject("listaRespuestas", evaluacionAlumnoService.listarRespuestas());
		
		// agregar respuestas
		model.addAttribute("respuestasModel", respuestasModel);
		model.addAttribute("preModel", preModel);
		model.addAttribute("idEvaluacion", idEvaluacion);
		model.addAttribute("eTiempo",evaluacionAlumnoService.tiempoExamen(3));

		return mav;
	}


}
