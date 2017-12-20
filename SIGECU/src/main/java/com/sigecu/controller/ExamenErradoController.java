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
	
	
	@GetMapping("/listaExamenErrado")
	public ModelAndView showExamenErrado(@RequestParam(name = "idCurso", required = false) int idCurso, Model model) {
		EvaluacionesModel evalModel = new EvaluacionesModel();
		ModelAndView mav = new ModelAndView(ViewConstant.LISTAR_EXAMEN);
		mav.addObject("listaExamenErrado", ExamenErradoService.listAllExamenes(idCurso));
		model.addAttribute("evaluacionesModel", evalModel);
		model.addAttribute("idCurso", idCurso);
		return mav;
	}
	
	
	@GetMapping("/showexamen")
	public ModelAndView showexamen() {
		ModelAndView mav = new ModelAndView("ExamenErrado");
		
		return mav;
	}
}
