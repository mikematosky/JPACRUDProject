package com.skilldistillery.hpcharacters.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.skilldistillery.hpcharacters.entities.HPCharacter;
import com.skilldistillery.hpcharacters.entities.House;
import com.skilldistillery.hpcharacters.entities.Type;


@Component
@Transactional
public class HPCharDAOImpl implements HPCharDAO{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public HPCharacter create(HPCharacter character) {
		em.persist(character);
		em.flush();
		return character;
	}

	@Override
	public HPCharacter findByID(int id) {
		return em.find(HPCharacter.class, id);
	}

	@Override
	public List<HPCharacter> getAllCharacters() {
		String query= "SELECT c FROM hp_characters c";
		return em.createQuery(query, HPCharacter.class).getResultList();
	}

	@Override
	public List<HPCharacter> getFromHouse(House house) {
		String thisHouse= ""+house;
		String query= "SELECT c FROM hp_characters c WHERE c.house = :house";
		return em.createQuery(query, HPCharacter.class).setParameter("house", thisHouse).getResultList();
	}

	@Override
	public List<HPCharacter> getFromType(Type type) {
		String thisType= ""+type;
		String query= "SELECT c FROM hp_characters c WHERE c.type= :type";
		return em.createQuery(query, HPCharacter.class).setParameter("type", type).getResultList();
	}

	@Override
	public List<HPCharacter> getAllDeathEaters() {
		String query= "SELECT c FROM hp_characters c WHERE c.death_eater = 1";
		return em.createQuery(query, HPCharacter.class).getResultList();
	}

	@Override
	public List<HPCharacter> getAllNonDeathEaters() {
		String query= "SELECT c FROM hp_characters c WHERE c.death_eater = 0";
		return em.createQuery(query, HPCharacter.class).getResultList();
	}

	@Override
	public HPCharacter edit(HPCharacter updated) {
		HPCharacter character= em.find(HPCharacter.class, updated.getId());
		if(character != null) {
			character.setFirstName(updated.getFirstName());
			character.setLastName(updated.getLastName());
			character.setDescription(updated.getDescription());
			character.setType(updated.getType());
			character.setMale(updated.isMale());
			character.setHouse(updated.getHouse());
			character.setNumOfBooks(updated.getNumOfBooks());
			character.setDead(updated.isDead());
			character.setWasDeathEater(updated.isWasDeathEater());
			character.setTrivia(updated.getTrivia());
			character.setImageLink(updated.getImageLink());
			em.persist(character);
			em.flush();
		}
		return character;
	}

	@Override
	public boolean delete(int id) {
		// TODO Replace with enableds AFTER LUNCH
		return false;
	}


	
}
