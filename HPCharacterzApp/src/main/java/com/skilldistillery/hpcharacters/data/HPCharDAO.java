package com.skilldistillery.hpcharacters.data;

import java.util.List;

import com.skilldistillery.hpcharacters.entities.HPCharacter;
import com.skilldistillery.hpcharacters.entities.House;
import com.skilldistillery.hpcharacters.entities.Type;

public interface HPCharDAO {

	//C
	HPCharacter create(HPCharacter character);
	//R
	HPCharacter findByID(int id);
	List<HPCharacter> getAllCharacters();
	List<HPCharacter> getFromHouse(House house);
	List<HPCharacter> getFromType(Type type);
	List<HPCharacter> getAllDeathEaters();
	List<HPCharacter> getAllNonDeathEaters();
	//U
	HPCharacter edit(HPCharacter character);
	//D
	boolean delete(int id);
	
}
