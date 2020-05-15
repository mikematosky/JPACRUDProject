package com.skilldistillery.hpcharacters.entities;

import static org.junit.jupiter.api.Assertions.fail;

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
		fail("Not yet implemented");
	}

}
