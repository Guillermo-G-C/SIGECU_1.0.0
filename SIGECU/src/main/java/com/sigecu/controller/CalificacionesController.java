package com.sigecu.controller;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sigecu.constant.ViewConstant;
import com.sigecu.service.CalificacionService;
import com.sigecu.service.EvaluacionAlumnoService;
import com.sigecu.service.implemt.EmailService;

@Controller
@RequestMapping("/calificaciones")
public class CalificacionesController {
	@Autowired
	@Qualifier("EvaluacionAlumnoImpl")
	private EvaluacionAlumnoService EvaluacionAlumnoService;
	
	
	@Autowired
	@Qualifier("CalificacionImplement")
	private CalificacionService calificacionService;
	
	@Autowired
	@Qualifier("emailService")
	private EmailService mailService;
	
	private static final Log LOG = LogFactory.getLog(CalificacionesController.class);
	
	@GetMapping("/mostrarCalificaciones")
	public ModelAndView mostrarExamen(Model model){
		ModelAndView mav = new ModelAndView(ViewConstant.CALIFICACIONEXAMEN );
		//mav.addObject("ePorsentaje",EvaluacionAlumnoService.calificacion(1));
		mav.addObject("ePorsentaje",calificacionService.calificacionFnl());
		mav.addObject("aciertos",calificacionService.aciertosPregunta());
		mav.addObject("errores",calificacionService.erroresPregunta());
		try {
			mailService.send("castillor493@gmail.com", "Examen realizado", "Calificacion Final: "+calificacionService.calificacionFnl()+"");
		} catch (AddressException e) {
			LOG.error("La direccion de correo es incorrecta");
			e.printStackTrace();
		} catch (MessagingException e) {
			LOG.info("Error en el envio del correo");
			e.printStackTrace();
		}
		return mav;
	}
	
}
