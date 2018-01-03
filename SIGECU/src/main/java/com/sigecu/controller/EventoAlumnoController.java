package com.sigecu.controller;

import com.sigecu.model.Evento;
import com.sigecu.constant.ViewConstant;
import com.sigecu.service.eventoAlumnoService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("eventosAlumno")
public class EventoAlumnoController {
	private static final Log LOG = LogFactory.getLog(EventoAlumnoController.class);
	
	@Autowired
	@Qualifier("eventoAlumnoImpl")
	private eventoAlumnoService eventoAlumnoService;
	
	@GetMapping("/eventosAlumno")
	public ModelAndView showEventosAl(@RequestParam(name="idEvento", required=false)int idEvento, Model model) {
		Evento eventoModel=new Evento();
		ModelAndView mo=new ModelAndView(ViewConstant.EVENTOS_ALUMNO);
		mo.addObject("eventosAlumno", eventoAlumnoService.listAllEventosAl(idEvento));
		model.addAttribute("eventoModel", eventoModel);
		model.addAttribute("idEvento", idEvento);
		return mo;
	}
	
	@GetMapping("/listarEventos")
	public ModelAndView mostrarEventos() {
		ModelAndView mav=new ModelAndView(ViewConstant.EVENTOS_ALUMNO);
		mav.addObject("listarEventos", eventoAlumnoService.listaAlumnos());
		return mav;
		
	}
	
	
	

}
