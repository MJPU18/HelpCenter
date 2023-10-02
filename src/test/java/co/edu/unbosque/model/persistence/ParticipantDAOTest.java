package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.ParticipantDTOTest;

/**
 * This class represents a data access object (DAO) for managing ParticipantDAO
 * objects.
 * 
 * @author Juan Pablo Urrego
 * @author Javier Meza Montero
 * @author Juan Esteban Quintero
 * @author Joann Alejandro Zamudio
 * @author Jeisson Nicolas Uyaban
 */
public class ParticipantDAOTest implements CRUDoperation<ParticipantDTOTest> {

	private ArrayList<ParticipantDTOTest> listParticipants;

	/**
	 * Create an object of class ParticipantDAO
	 */
	public ParticipantDAOTest() {
		listParticipants = new ArrayList<>();
	}

	/**
	 * Gets the ArrayList containing ParticipantDTOTest objects.
	 * 
	 * @return The ArrayList of ParticipantDTOTest objects.
	 */
	public ArrayList<ParticipantDTOTest> getListParticipants() {
		return listParticipants;
	}

	/**
	 * Update the ArrayList containing ParticipantDTOTest objects.
	 * 
	 * @param listParticipants :The ArrayList of ParticipantDTOTest objects.
	 */
	public void setListParticipants(ArrayList<ParticipantDTOTest> listParticipants) {
		this.listParticipants = listParticipants;
	}

	@Override
	public void create(ParticipantDTOTest info) {
		listParticipants.add(info);
	}

	@Override
	public void update(int index, ParticipantDTOTest info) {
		listParticipants.set(index, info);
	}

	@Override
	public ParticipantDTOTest delete(int index) {
		return listParticipants.remove(index);
	}

}
