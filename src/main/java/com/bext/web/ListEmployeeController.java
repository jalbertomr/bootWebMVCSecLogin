package com.bext.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bext.domain.Employee;
import com.bext.service.EmployeeService;

@Controller
public class ListEmployeeController {
	private static final Logger logger = LoggerFactory.getLogger(ListEmployeeController.class);
	
	@Autowired
	private EmployeeService employeeService;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/listaEmpleados")
	public ModelAndView viewAllItems() {
		logger.info("listando items...");
		
		List<Employee> listaEmpleados = employeeService.getAllEmployees();
		return new ModelAndView("/listaEmpleados","listaEmpleados", listaEmpleados);
	}
}
