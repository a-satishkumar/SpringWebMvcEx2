package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

	@RequestMapping("/show")
	public ModelAndView showRegPage()
	{
		ModelAndView m=new ModelAndView();
		m.setViewName("EmpReg");
		return m;
	}
	@RequestMapping("/viewAll")
	public ModelAndView showAllPage()
	{
		ModelAndView m=new ModelAndView();
		m.setViewName("EmpData");
		return m;
	}
	@RequestMapping("/save")
	public ModelAndView saveData()
	{
		ModelAndView m=new ModelAndView();
		m.setViewName("EmpSuccess");
		return m;
	}
}
