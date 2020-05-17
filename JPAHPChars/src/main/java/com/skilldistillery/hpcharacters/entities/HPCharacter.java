package com.skilldistillery.hpcharacters.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hp_characters")
public class HPCharacter {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	private String firstName;
	private String lastName;
	private String description;
	private String type;
	private boolean isMale;
	private House house;
	private Integer numOfBooks;
	private boolean isDead;
	private boolean wasDeathEater;
	private String trivia;
	private String imageLink;
	
	
	public HPCharacter() {}
	
	
	//Character with no Last Name
	public HPCharacter(String first, String descript, String type, House house, boolean gender,
						boolean isDead, boolean wasDE, Integer books ) {
		firstName= first;
		description= descript;
		this.type= type;
		this.house= house;
		isMale=gender;
		this.isDead= isDead;
		wasDeathEater= wasDE;
		numOfBooks= books;
	}
	
	//Character with a Last Name
	public HPCharacter(String first, String last, String descript, String type, House house, boolean gender,
			boolean isDead, boolean wasDE, Integer books ) {
		firstName= first;
		lastName= last;
		description= descript;
		this.type= type;
		this.house= house;
		isMale=gender;
		this.isDead= isDead;
		wasDeathEater= wasDE;
		numOfBooks= books;
	}
	
	@Override
	public String toString() {
		return "HPCharacter [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", description="
				+ description + ", type=" + type + ", isMale=" + isMale + ", house=" + house + ", numOfBooks="
				+ numOfBooks + ", isDead=" + isDead + ", wasDeathEater=" + wasDeathEater + ", trivia=" + trivia
				+ ", imageLink=" + imageLink + "]";
	}
	
	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public boolean isMale() {
		return isMale;
	}



	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}



	public House getHouse() {
		return house;
	}



	public void setHouse(House house) {
		this.house = house;
	}



	public int getNumOfBooks() {
		return numOfBooks;
	}



	public void setNumOfBooks(int numOfBooks) {
		this.numOfBooks = numOfBooks;
	}



	public boolean isDead() {
		return isDead;
	}



	public void setDead(boolean isDead) {
		this.isDead = isDead;
	}



	public boolean isWasDeathEater() {
		return wasDeathEater;
	}



	public void setWasDeathEater(boolean wasDeathEater) {
		this.wasDeathEater = wasDeathEater;
	}



	public String getTrivia() {
		return trivia;
	}



	public void setTrivia(String trivia) {
		this.trivia = trivia;
	}



	public String getImageLink() {
		return imageLink;
	}



	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}




	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	
}
