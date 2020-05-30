package com.skilldistillery.hpcharacters.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.hpcharacters.data.HPCharDAO;

@Controller
public class HPController {

	@Autowired
	private HPCharDAO dao;
	
	@RequestMapping(path = {"/","","home.do"})
	public String index() {
		return "index";
	}
	
	//Drawing a blank on how to set multiple paths
	
}
