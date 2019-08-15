package com.bext.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	private static final Logger logger = LoggerFactory.getLogger(ListEmployeeController.class);
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model, String error, String logout) {
		if (error != null) {
			model.addAttribute("errorMsg", "El Usuario y/o Clave son incorrectos.");
		}
		if (logout != null) {
			model.addAttribute("msg", "Se ha Desautenticado Satisfactoriamente.");
		}
		return "login";
	}
}
