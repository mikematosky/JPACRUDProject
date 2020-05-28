package com.skilldistillery.hpcharacters.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.hpcharacters.data.HPCharDAO;

@Controller
public class HPCharController {

	@Autowired
	private HPCharDAO dao;
	
	@RequestMapping(path = "/")
	public String index() {
		return "index";
	}
	
	//
	
	
}
