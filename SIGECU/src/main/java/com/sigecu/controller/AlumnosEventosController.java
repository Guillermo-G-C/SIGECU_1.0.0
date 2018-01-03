/**
 * 
 */
package com.sigecu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.sigecu.constant.ViewConstant;

/**
 * @author Rolando Castillo
 * @contact castillomartinez@acm.org
 * @Fecha 02/01/2018
 *
 */
@Controller
@RequestMapping("/eventosAlumno")
public class AlumnosEventosController {
//	public AlumnosEventosController() {
//		@Autowired
//		@Qualifier("eventoServiceImpl")
//		private EventoService eventoService;
//		
//		@GetMapping("eventosAlumno")
//		public ModelAndView showAlumnoEVentos(@RequestParam(name="idEvento", required=false) int idEvento, Model model) {
//			EventosModel eventModel=new EventosModel();
//			ModelAndView mo=new ModelAndView(ViewConstant.EVENTOS_ALUMNO);
//			mo.addObject("evenAlumno", eventoServic.listaEventos());
//			model.addAttribute("eventosModel", eventModel);
//			model.addAtribute("idEvento", idEvento);
//			
//		}
//		
//	}

}
