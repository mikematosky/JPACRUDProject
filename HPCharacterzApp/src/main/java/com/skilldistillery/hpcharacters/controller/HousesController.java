package com.skilldistillery.hpcharacters.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.skilldistillery.hpcharacters.data.HPCharDAO;
import com.skilldistillery.hpcharacters.entities.HPCharacter;
import com.skilldistillery.hpcharacters.entities.House;

@Controller
public class HousesController {

	@Autowired
	private HPCharDAO dao;
	
	@GetMapping(path = "gryff.do")
	public String gryffindor(Model model) {
		List<HPCharacter> list = dao.getFromHouse(House.Gryffindor);
		model.addAttribute("List", list);
		return "characters";
	}
	
	@GetMapping(path = "slyth.do")
	public String slytherin(Model model) {
		List<HPCharacter> list = dao.getFromHouse(House.Slytherin);
		model.addAttribute("List", list);
		return "characters";
	}
	
	@GetMapping(path = "raven.do")
	public String ravenclaw(Model model) {
		List<HPCharacter> list = dao.getFromHouse(House.Ravenclaw);
		model.addAttribute("List", list);
		return "characters";
	}
	
	@GetMapping(path = "puff.do")
	public String hufflepuff(Model model) {
		List<HPCharacter> list = dao.getFromHouse(House.Hufflepuff);
		model.addAttribute("List", list);
		return "characters";
	}
}
