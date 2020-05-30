package com.skilldistillery.hpcharacters.entities;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Table;

@Entity
@Table(name="hp_characters")
public class HPCharacter {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	private String description;
	@Enumerated(EnumType.STRING)
	private Type type;
	@Column(name="gender")
	private boolean isMale;
	@Enumerated(EnumType.STRING)
	private House house;
	@Column(name="number_of_books")
	private Integer numOfBooks;
	@Column(name="dead")
	private boolean isDead;
	@Column(name="death_eater")
	private boolean wasDeathEater;
	private String trivia;
	@Column(name="image_link")
	private String imageLink;
	private boolean disabled;
	
	
	public HPCharacter() {}
	
	
	//Character with no Last Name
	public HPCharacter(String first, String descript, Type type, House house, boolean gender,
						boolean isDead, boolean wasDE, Integer books ) {
		firstName= first;
		description= descript;
		this.type= type;
		this.house= house;
		isMale=gender;
		this.isDead= isDead;
		wasDeathEater= wasDE;
		numOfBooks= books;
		disabled=false;
	}
	
	//Character with a Last Name
	public HPCharacter(String first, String last, String descript, Type type, House house, boolean gender,
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
		disabled= false;
	}
	
	@Override
	public String toString() {
		return "HPCharacter [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", description="
				+ description + ", type=" + type + ", isMale=" + isMale + ", house=" + house + ", numOfBooks="
				+ numOfBooks + ", isDead=" + isDead + ", wasDeathEater=" + wasDeathEater + ", trivia=" + trivia
				+ ", imageLink=" + imageLink + ", disabled=" + disabled + "]";
	}
	
	public boolean isDisabled() {
		return disabled;
	}


	public void setDisabled(boolean disabled) {
		this.disabled = disabled;
	}


	public void setNumOfBooks(Integer numOfBooks) {
		this.numOfBooks = numOfBooks;
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



	public Type getType() {
		return type;
	}



	public void setType(Type type) {
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
