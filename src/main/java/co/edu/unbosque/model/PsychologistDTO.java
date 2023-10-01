package co.edu.unbosque.model;

import java.sql.Date;
import java.time.Year;
/**
 * Class that represents the psychologist in the help center.
 *  @author Juan Pablo Urrego
 *  @author Javier Meza Montero
 *  @author Juan Esteban Quintero
 *  @author Joann Alejandro Zamudio
 *  @author Jeisson Nicolas Uyaban
 */
public class PsychologistDTO extends PersonDTO{
	
	private Year yearOfGraduation;
	private int daysInService;
	private int suportedSessions;
	private double salary;
	
	/**
	 * Create an object of class PsychologistDTO
	 */
	public PsychologistDTO() {}

	/**
	 * Create an object of class PsychologistDTO.
	 * @param yearOfGraduation :Year of graduation of the psychologist
	 * @param daysInService :Days in service of the psychologist
	 * @param suportedSessions :Sessions supported by the psychologist
	 * @param salary :Psychologist salary
	 */
	public PsychologistDTO(Year yearOfGraduation, int daysInService, int suportedSessions, double salary) {
		super();
		this.yearOfGraduation = yearOfGraduation;
		this.daysInService = daysInService;
		this.suportedSessions = suportedSessions;
		this.salary = salary;
	}
	
	/**
	 * Create an object of class PsychologistDTO.
	 * @param userName :Username of the psychologist
	 * @param password :Password of the psychologist
	 * @param name :Name of the psychologist
	 * @param document :Document of the psychologist
	 * @param dateOfBirth :BirthDay of the psychologist
	 * @param cityOfBirth :City of birth of the psychologist
	 * @param yearOfGraduation :Year of graduation of the psychologist
	 * @param daysInService :Days in service of the psychologist
	 * @param suportedSessions :Sessions supported by the psychologist
	 * @param salary :Psychologist salary
	 */
	public PsychologistDTO(String userName,String password,String name, long document, Date dateOfBirth, String cityOfBirth, Year yearOfGraduation, int daysInService, int suportedSessions, double salary) {
		super(userName, password,name, document, dateOfBirth, cityOfBirth);
		this.yearOfGraduation = yearOfGraduation;
		this.daysInService = daysInService;
		this.suportedSessions = suportedSessions;
		this.salary = salary;
	}
	
	
	/**
	 * Create an object of class PsychologistDTO.
	 * @param userName :Username of the psychologist
	 * @param password :Password of the psychologist
	 * @param name :Name of the psychologist
	 * @param document :Document of the psychologist
	 * @param dateOfBirth :BirthDay of the psychologist
	 * @param cityOfBirth :City of birth of the psychologist
	 */
	public PsychologistDTO(String userName, String password, String name, long document, Date dateOfBirth,String cityOfBirth) {
		super(userName, password, name, document, dateOfBirth, cityOfBirth);
	}

	/**
	 * Gets the psychologist year of graduation.
	 * @return psychologist year of graduation
	 */
	public Year getYearOfGraduation() {
		return yearOfGraduation;
	}
	
	/**
	 * Update the psychologist year of graduation.
	 * @param yearOfGraduation :psychologist year of graduation
	 */
	public void setYearOfGraduation(Year yearOfGraduation) {
		this.yearOfGraduation = yearOfGraduation;
	}
	
	/**
	 * Gets the psychologist days of service
	 * @return the psychologist days of service 
	 */
	public int getDaysInService() {
		return daysInService;
	}
	
	/**
	 * Update the psychologist days of service
	 * @param daysInService :The psychologist days of service
	 */
	public void setDaysInService(int daysInService) {
		this.daysInService = daysInService;
	}
	
	/**
	 * Gets the sessions supported by the psychologist
	 * @return the sessions supported by the psychologist
	 */
	public int getSuportedSessions() {
		return suportedSessions;
	}
	
	/**
	 * Update the sessions supported by the psychologist
	 * @param suportedSessions :the sessions supported by the psychologist
	 */
	public void setSuportedSessions(int suportedSessions) {
		this.suportedSessions = suportedSessions;
	}
	
	/**
	 * Gets the psychologist salary
	 * @return psychologist salary
	 */
	public double getSalary() {
		return salary;
	}
	
	/**
	 * Update the psychologist salary
	 * @param salary :psychologist salary
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "PsychologistDTO [yearOfGraduation=" + yearOfGraduation + ", daysInService=" + daysInService
				+ ", suportedSessions=" + suportedSessions + ", salary=" + salary + ", UserName=" + getUserName()
				+ ", Password=" + getPassword() + ", Name=" + getName() + ", Document=" + getDocument()
				+ ", DateOfBirth=" + getDateOfBirth() + ", CityOfBirth()=" + getCityOfBirth() + "]";
	}

	

}
