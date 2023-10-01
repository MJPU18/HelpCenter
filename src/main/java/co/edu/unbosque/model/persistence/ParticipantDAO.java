package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.ParticipantDTO;

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
public class ParticipantDAO implements CRUDoperation<ParticipantDTO> {

	private ArrayList<ParticipantDTO> listParticipants;

	/**
	 * Create an object of class ParticipantDAO
	 */
	public ParticipantDAO() {
		listParticipants = new ArrayList<>();
	}

	/**
	 * Gets the ArrayList containing ParticipantDTO objects.
	 * 
	 * @return The ArrayList of ParticipantDTO objects.
	 */
	public ArrayList<ParticipantDTO> getListParticipants() {
		return listParticipants;
	}

	/**
	 * Update the ArrayList containing ParticipantDTO objects.
	 * 
	 * @param listParticipants :The ArrayList of ParticipantDTO objects.
	 */
	public void setListParticipants(ArrayList<ParticipantDTO> listParticipants) {
		this.listParticipants = listParticipants;
	}

	@Override
	public void create(ParticipantDTO info) {
		listParticipants.add(info);
	}

	@Override
	public void update(int index, ParticipantDTO info) {
		listParticipants.set(index, info);
	}

	@Override
	public ParticipantDTO delete(int index) {
		return listParticipants.remove(index);
	}

}
