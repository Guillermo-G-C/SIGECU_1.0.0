package com.sigecu.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.sigecu.constant.ViewConstant;

@Controller
public class LoginController {

	private static final Log LOG = LogFactory.getLog(LoginController.class);

	@GetMapping("/login")
	public String showLoginForm() {
		// LOG.info("METHOD: showLoginForm() -- PARAMS: error= " + error + ", logout= "
		// + logout);
		// model.addAttribute("error", error);
		// model.addAttribute("logout", logout);
		LOG.info("Regresando a la vista login");
		return ViewConstant.LOGIN;
	}

	@GetMapping({ "/loginsuccess", "/" })
	public String loginCheck() {
		LOG.info("METHOD: logincheck()");
		LOG.info("Regresando a la vista de alumnos");
		return "redirect:/alumnos/showalumnos";
	}
}
