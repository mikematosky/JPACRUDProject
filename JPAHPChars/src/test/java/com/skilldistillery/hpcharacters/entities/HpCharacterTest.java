package com.skilldistillery.hpcharacters.entities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HpCharacterTest {

	private static EntityManagerFactory emf;
	private EntityManager em;
	private HPCharacter harry;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	emf= Persistence.createEntityManagerFactory("HPCharacters");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		emf.close();
	}

	@BeforeEach
	void setUp() throws Exception {
		em = emf.createEntityManager();
		harry= em.find(HPCharacter.class, 1);
	}

	@AfterEach
	void tearDown() throws Exception {
		em.close();
		harry= null;
	}

	@Test
	void test() {
		assertNotNull(harry);
		assertEquals("Harry", harry.getFirstName());
		assertEquals("Potter", harry.getLastName());
		assertEquals("The boy who lived. Main protagonist and target of Death Eaters.", harry.getDescription());
		assertEquals(Type.Human, harry.getType());
		assertTrue(harry.isMale());
		assertEquals(House.Gryffindor, harry.getHouse());
		assertEquals(7, harry.getNumOfBooks());
		assertEquals(false, harry.isDead());
		assertEquals(false, harry.isWasDeathEater());
		assertEquals("Harry received a (P) for \"Poor\" in Divination.", harry.getTrivia());
		assertEquals("https://assets.readbrightly.com/wp-content/uploads/2015/09/harry_potter_featured-768x550.gif", harry.getImageLink());
		
	}

}
