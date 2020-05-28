package com.skilldistillery.hpcharacters.data;

import java.util.List;

import org.springframework.stereotype.Component;

import com.skilldistillery.hpcharacters.entities.HPCharacter;
import com.skilldistillery.hpcharacters.entities.House;
import com.skilldistillery.hpcharacters.entities.Type;


@Component
public class HPCharDAOImpl implements HPCharDAO{

	@Override
	public HPCharacter create(HPCharacter character) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HPCharacter findByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HPCharacter> getAllCharacters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HPCharacter> getFromHouse(House house) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HPCharacter> getFromType(Type type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HPCharacter> getAllDeathEaters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HPCharacter> getAllNonDeathEaters() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HPCharacter edit(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}


	
}
