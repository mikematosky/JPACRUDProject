package com.skilldistillery.hpcharacters.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.skilldistillery.hpcharacters.data.HPCharDAO;
import com.skilldistillery.hpcharacters.entities.HPCharacter;

@Controller
public class CharController {

	@Autowired
	private HPCharDAO dao;
	
	@PostMapping("createChar.do")
	public String create(HPCharacter newChar, Model model) {
		HPCharacter character = dao.create(newChar);
		model.addAttribute("Character", character);
		return "character_popout";
	}
	
	@PostMapping("updateChar.do")
	public String update(HPCharacter updated, Model model) {
		HPCharacter character = dao.edit(updated);
		model.addAttribute("Updated", character);
		return "characters_popout";
	}
	
	@PostMapping("disable.do")
	public String disable(@RequestParam int id, Model model) {
		String result="Could not Delete";
		if(dao.delete(id)) {
			result="Deleted";
		}
		model.addAttribute("Result", result);
		return "characters";
	}
	
	@GetMapping("allCharacters.do")
	public String getAll(Model model) {
		List<HPCharacter> list = dao.getAllCharacters();
		model.addAttribute("List", list);
		return "characters";
	}
	
	@GetMapping("search.do")
	public String search(@RequestParam String keyword, Model model) {
		List<HPCharacter> list = dao.getByKeywordSearch(keyword);
		model.addAttribute("List", list);
		return "characters";
	}
}
