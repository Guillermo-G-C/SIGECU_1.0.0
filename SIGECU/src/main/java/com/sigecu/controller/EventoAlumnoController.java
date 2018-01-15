package com.sigecu.controller;

import com.sigecu.model.AlumnoModel;
import com.sigecu.model.EventosModel;
import com.sigecu.constant.ViewConstant;
import com.sigecu.service.DefineUsuarioService;
import com.sigecu.service.eventoAlumnoService;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@PreAuthorize("hasRole('ROLE_ALUMNO')")
@RequestMapping("/eventosAlumno")
public class EventoAlumnoController {
	private static final Log LOG = LogFactory.getLog(EventoAlumnoController.class);
	
	@Autowired
	@Qualifier("defineUsuario")
	private DefineUsuarioService defineUsuario;
	
	@Autowired
	@Qualifier("eventoAlumnoImpl")
	private eventoAlumnoService eventoAlumnoService;
	
	private User user;
	AlumnoModel alumnoModel;
//	@GetMapping("/eventosAlumno")
//	public ModelAndView showEventosAl(@RequestParam(name="idEvento", required=false)int idEvento, Model model) {
//		EventosModel eventoModel=new EventosModel();
//		ModelAndView mo=new ModelAndView(ViewConstant.EVENTOS_ALUMNO);
//		mo.addObject("listaEvenAl", eventoAlumnoService.listAllEventosAl(idEvento));
//		model.addAttribute("eventoModel", eventoModel);
//		model.addAttribute("idEvento", idEvento);
//		return mo;
//	}
	@GetMapping("/listarEventos")
	public ModelAndView mostrarEventos() {
		ModelAndView mav=new ModelAndView(ViewConstant.EVENTOS_ALUMNO);
		user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		alumnoModel =defineUsuario.buscarUsuarioAlumno(user.getUsername());
		LOG.info(user.getAuthorities());
		mav.addObject("listC", eventoAlumnoService.validarCertificado(eventoAlumnoService.listAllEventosAl(alumnoModel.getId_alumno()), alumnoModel.getId_alumno()));
		mav.addObject("user", alumnoModel );
		mav.addObject("listarEventos", eventoAlumnoService.listAllEventosAl(alumnoModel.getId_alumno()));
		return mav;
		
	}
	@GetMapping("/listarExamenAlumno")
	public ModelAndView mostrarExamenAlumno(@RequestParam(name="idEvento", required=false)int idEvento, Model model) {
		user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		alumnoModel =defineUsuario.buscarUsuarioAlumno(user.getUsername());
		ModelAndView mav = new ModelAndView(ViewConstant.EXAMENES_ALUMNO);
		mav.addObject("listExamen", eventoAlumnoService.listAllExamen(alumnoModel.getId_alumno(), idEvento));
		mav.addObject("user", alumnoModel);
		mav.addObject("idEvento", idEvento);
		return mav;
	}
}
