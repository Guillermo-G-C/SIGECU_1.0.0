package com.sigecu.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsPdfView;

import com.sigecu.constant.ViewConstant;

import com.sigecu.service.CertificadoService;
import com.sigecu.service.implemt.AlumnoHasEventoServiceImpl;

import com.sigecu.service.implemt.CertificadoServiceImpl;


@Controller
@RequestMapping("/alumno")
public class CertificadoController {
	
	private static final Log LOG = LogFactory.getLog(CertificadoController.class);
	
	@Autowired
    private ApplicationContext applicationContext;
	
	@Autowired
	private CertificadoServiceImpl certificadoService;
	
	@Autowired
	private AlumnoHasEventoServiceImpl alumnoHasEventoService;
	
	@GetMapping("/inicio")
	public ModelAndView ejemploMAV() {
		ModelAndView mav = new ModelAndView(ViewConstant.CERTIFICADO);
		mav.addObject("certificadoO",certificadoService.findCertificadoById(2));
		
		return mav;
	}
	
	@GetMapping("/ahe")
	public ModelAndView ahe() {
		ModelAndView mav = new ModelAndView(ViewConstant.CERTIFICADO);
		
		//mav.addObject("AHEB", alumnoHasEventoService.findAlumnoHasEventoByIdAlumnoAndIdEvento(1, 1));
		alumnoHasEventoService.findAlumnoHasEventoByIdAlumnoAndIdEvento(1,1);
		
		return mav;
	}
	
	@GetMapping("/certificado2")
	public ModelAndView certificado2() {
		JasperReportsPdfView cerView = new JasperReportsPdfView();
		cerView.setUrl("classpath:reports/certificadoR.jasper");
		cerView.setApplicationContext(applicationContext);
		
		Map<String, Object> params = new HashMap<String, Object>();
	    params.put("datasource", certificadoService.report());
	    //params.put("img", this.getClass().getResource("/src/main/resources/reports/c.png"));
		return new ModelAndView(cerView, params);
	}
	
	@GetMapping("/certificado")
	public ModelAndView certificado() {
		JasperReportsPdfView cerView = new JasperReportsPdfView();
		cerView.setUrl("classpath:reports/certificadoR.jasper");
		cerView.setApplicationContext(applicationContext);
		
		Map<String, Object> params = new HashMap<String, Object>();
	    params.put("datasource", certificadoService.report(1));//nombre ,fecha, curso
	    //params.put("img", this.getClass().getResource("/src/main/resources/reports/c.png"));
		return new ModelAndView(cerView, params);
	}
	
	
}
