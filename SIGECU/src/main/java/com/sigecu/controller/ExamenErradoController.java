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
import com.sigecu.service.ExamenErradoService;

/**
 * @author Anel
 *
 */


@Controller
@RequestMapping("/ExamenErrado")
public class ExamenErradoController {
	
	private static final Log LOG = LogFactory.getLog(ExamenErradoController.class);

	@Autowired
	@Qualifier("ExamenErradoServiceImplement")
	private ExamenErradoService examenErradoService;

	@GetMapping("/ExamenErrado1")
	public ModelAndView ExamenErrado1(
			Model model) {
		int idEvaluacion=1;
		PreguntasModel preModel = new PreguntasModel();
		RespuestasModel respuestasModel = new RespuestasModel();
		ModelAndView mav = new ModelAndView(ViewConstant.NUEVO_EXAMENERRADO);
		mav.addObject("listaPreguntas", examenErradoService.listarPreguntasByExamErrado(idEvaluacion)); //id examen, preguntas erradas
		mav.addObject("listaRespuestas", examenErradoService.listarRespuestas());
		// agregar respuestas
		model.addAttribute("respuestasModel", respuestasModel);
		model.addAttribute("preModel", preModel);
		model.addAttribute("idEvaluacion", idEvaluacion);

		return mav;
	}


}
