package co.edu.unbosque.model;

import java.time.LocalDate;

/**
 * Class that represents the people in the help center.
 * 
 * @author Juan Pablo Urrego
 * @author Javier Meza Montero
 * @author Juan Esteban Quintero
 * @author Joann Alejandro Zamudio
 * @author Jeisson Nicolas Uyaban
 */
public class PersonDTO {

	private String userName;
	private String password;
	private String name;
	private long document;
	private LocalDate dateOfBirth;
	private String cityOfBirth;

	/**
	 * Create an object of class PersonaDTO
	 */
	public PersonDTO() {
	}

	/**
	 * Create an object of class PersonaDTO
	 * 
	 * @param userName    :Username of the person
	 * @param password    :Password of the person
	 * @param name        :Name of the person
	 * @param document    :Document of the person
	 * @param dateOfBirth :BirthDay of the person.
	 * @param cityOfBirth :City of birth of the person.
	 */
	public PersonDTO(String userName, String password, String name, long document, LocalDate dateOfBirth,
			String cityOfBirth) {
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.document = document;
		this.dateOfBirth = dateOfBirth;
		this.cityOfBirth = cityOfBirth;
	}

	/**
	 * Gets the username of the person.
	 * 
	 * @return Username of the person
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Update the person username
	 * 
	 * @param userName :Username of the person.
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Gets the password of the person.
	 * 
	 * @return Password of the person
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Update the person password
	 * 
	 * @param password :Password of the person.
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * Gets the name of the person.
	 * 
	 * @return Name of the person
	 */
	public String getName() {
		return name;
	}

	/**
	 * Update the person name
	 * 
	 * @param name :Name of the person.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the document of the person
	 * 
	 * @return Document of the person
	 */
	public long getDocument() {
		return document;
	}

	/**
	 * Update the person document.
	 * 
	 * @param document :Document of the person.
	 */
	public void setDocument(long document) {
		this.document = document;
	}

	/**
	 * Gets the date of birth of the person.
	 * 
	 * @return Date of birth of the person
	 */
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	/**
	 * Update the person BirthDay
	 * 
	 * @param dateOfBirth :Birth of day of the person.
	 */
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	/**
	 * Gets the city of birth of the person.
	 * 
	 * @return city of birth of the person
	 */
	public String getCityOfBirth() {
		return cityOfBirth;
	}

	/**
	 * Update city of birth person
	 * 
	 * @param cityOfBirth :City of birth of the person.
	 */
	public void setCityOfBirth(String cityOfBirth) {
		this.cityOfBirth = cityOfBirth;
	}

	@Override
	public String toString() {
		return "PersonDTO [userName=" + userName + ", password=" + password + ", name=" + name + ", document="
				+ document + ", dateOfBirth=" + dateOfBirth + ", cityOfBirth=" + cityOfBirth + "]";
	}

}
