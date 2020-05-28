package com.skilldistillery.hpcharacters.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.skilldistillery.hpcharacters.data.HPCharDAO;
import com.skilldistillery.hpcharacters.entities.HPCharacter;

@Controller
public class DEController {

	@Autowired
	HPCharDAO dao;
	
	@GetMapping(path = "bad_guys.do")
	public String deathEaters (Model model) {
		List<HPCharacter> list = dao.getAllDeathEaters();
		model.addAttribute("List", list);
		return "characters";
	}
	
	@GetMapping(path = "good_guys.do")
	public String nonDeathEaters(Model model) {
		List<HPCharacter> list = dao.getAllNonDeathEaters();
		model.addAttribute("List", list);
		return "characters";
	}
	
}
