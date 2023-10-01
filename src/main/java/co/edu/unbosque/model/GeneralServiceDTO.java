package co.edu.unbosque.model;

import java.sql.Date;

/**
 * Class that represents the general services person in the help center.
 * 
 * @author Juan Pablo Urrego
 * @author Javier Meza Montero
 * @author Juan Esteban Quintero
 * @author Joann Alejandro Zamudio
 * @author Jeisson Nicolas Uyaban
 */
public class GeneralServiceDTO extends PersonDTO {

	private double salary;
	private int sessionsCleaned;

	/**
	 * Create an object of class GeneralServiceDTO
	 */
	public GeneralServiceDTO() {
	}

	/**
	 * Create an object of class GeneralServiceDTO
	 * 
	 * @param userName        :Username of the general services person
	 * @param password        :Password of the general services person
	 * @param name            :Name of the general services person
	 * @param document        :Document of the general services person
	 * @param dateOfBirth     :BirthDay of the general services person
	 * @param cityOfBirth     :City of birth of the general services person
	 * @param salary          : Salary of the general services person
	 * @param sessionsCleaned :Sessions cleaned of the general services person
	 */
	public GeneralServiceDTO(String userName, String password, String name, long document, Date dateOfBirth,
			String cityOfBirth, double salary, int sessionsCleaned) {
		super(userName, password, name, document, dateOfBirth, cityOfBirth);
		this.salary = salary;
		this.sessionsCleaned = sessionsCleaned;

	}

	/**
	 * Create an object of class GeneralServiceDTO
	 * 
	 * @param salary          : Salary of the general services person
	 * @param sessionsCleaned :Sessions cleaned of the general services person
	 */
	public GeneralServiceDTO(double salary, int sessionsCleaned) {
		super();
		this.salary = salary;
		this.sessionsCleaned = sessionsCleaned;
	}

	/**
	 * Create an object of class GeneralServiceDTO
	 * 
	 * @param userName    :Username of the general services person
	 * @param password    :Password of the general services person
	 * @param name        :Name of the general services person
	 * @param document    :Document of the general services person
	 * @param dateOfBirth :BirthDay of the general services person
	 * @param cityOfBirth :City of birth of the general services person
	 */
	public GeneralServiceDTO(String userName, String password, String name, long document, Date dateOfBirth,
			String cityOfBirth) {
		super(userName, password, name, document, dateOfBirth, cityOfBirth);
	}

	/**
	 * Gets the salary of the general services person.
	 * 
	 * @return salary of the general services person.
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * Update the salary of the general services person
	 * 
	 * @param salary :Salary of the general services person
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * Gets sessions cleaned of the general services person
	 * 
	 * @return sessions cleaned of the general services person.
	 */
	public int getSessionsCleaned() {
		return sessionsCleaned;
	}

	/**
	 * Update sessions cleaned of the general services person
	 * 
	 * @param sessionsCleaned :sessions cleaned of the general services person.
	 */
	public void setSessionsCleaned(int sessionsCleaned) {
		this.sessionsCleaned = sessionsCleaned;
	}

	@Override
	public String toString() {
		return "GeneralServiceDTO [salary=" + salary + ", sessionsCleaned=" + sessionsCleaned + ", UserName="
				+ getUserName() + ", Password=" + getPassword() + ", Name=" + getName() + ", Document=" + getDocument()
				+ ", DateOfBirth=" + getDateOfBirth() + ", CityOfBirth()=" + getCityOfBirth() + "]";
	}

}
