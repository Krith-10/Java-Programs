package com.krith.employee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PathVariable;

import com.krith.employee.domain.Employee;
import com.krith.employee.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@GetMapping("/")
	public String homePage(Model model) {
		List<Employee> listemployee = service.listAll();
		model.addAttribute("listemployee", listemployee);
		System.out.println("Get /");
		return "index";
	}
	
	@GetMapping("/new")
	public String add(Model model) {
		model.addAttribute("employee", new Employee());
		return "new";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("employee") Employee emp) {
		service.save(emp);
		return "redirect:/";
	}
	
	@RequestMapping("/edit/{id}")
	public ModelAndView showEditEmployeePage(@PathVariable(name = "id")long id) {
		ModelAndView mav = new ModelAndView("new");
		Optional<Employee> emp = service.get(id);
		mav.addObject("employee",emp);
		return mav;
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable(name="id")long id) {
		service.delete(id);
		return "redirect:/";
	}
}
