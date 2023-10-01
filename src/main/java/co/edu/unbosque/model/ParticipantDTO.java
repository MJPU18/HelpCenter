package co.edu.unbosque.model;

import java.time.LocalDate;

/**
 * Class that represents the participants in the help center.
 * 
 * @author Juan Pablo Urrego
 * @author Javier Meza Montero
 * @author Juan Esteban Quintero
 * @author Joann Alejandro Zamudio
 * @author Jeisson Nicolas Uyaban
 */
public class ParticipantDTO extends PersonDTO {

	private int participatedSessions;
	private String nickName;

	/**
	 * Create an object of class ParticipantDTO
	 */
	public ParticipantDTO() {
	}

	/**
	 * Create an object of class ParticipantDTO
	 * 
	 * @param userName             :Username of the participant
	 * @param password             :Password of the participant
	 * @param name                 :Name of participant
	 * @param document             :Document of participant
	 * @param dateOfBirth          :Birth day of participant
	 * @param cityOfBirth          :City of birth of participant
	 * @param participatedSessions :Number of sessions.
	 * @param nickName             :Participant nickname.
	 */
	public ParticipantDTO(String userName, String password, String name, long document, LocalDate dateOfBirth,
			String cityOfBirth, int participatedSessions, String nickName) {
		super(userName, password, name, document, dateOfBirth, cityOfBirth);
		this.participatedSessions = participatedSessions;
		this.nickName = nickName;
	}

	/**
	 * Create an object of class ParticipantDTO
	 * 
	 * @param participatedSessions :Number of sessions.
	 * @param nickName             :Participant's nickname.
	 */
	public ParticipantDTO(int participatedSessions, String nickName) {
		super();
		this.participatedSessions = participatedSessions;
		this.nickName = nickName;
	}

	/**
	 * Create an object of class ParticipantDTO
	 * 
	 * @param userName    :Username of the participant
	 * @param password    :Password of the participant
	 * @param name        :Name of participant
	 * @param document    :Document of participant
	 * @param dateOfBirth :Birth day of participant
	 * @param cityOfBirth :City of birth of participant
	 */
	public ParticipantDTO(String userName, String password, String name, long document, LocalDate dateOfBirth,
			String cityOfBirth) {
		super(userName, password, name, document, dateOfBirth, cityOfBirth);
	}

	/**
	 * Gets the number of sessions.
	 * 
	 * @return Number of sessions of the participant.
	 */
	public int getParticipatedSessions() {
		return participatedSessions;
	}

	/**
	 * Update the number of sessions.
	 * 
	 * @param participatedSessions :Number of sessions
	 */
	public void setParticipatedSessions(int participatedSessions) {
		this.participatedSessions = participatedSessions;
	}

	/**
	 * Gets the nickname.
	 * 
	 * @return Nickname of the participant.
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * Update participant nickname.
	 * 
	 * @param nickName :Nickname of the participant.
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

}
