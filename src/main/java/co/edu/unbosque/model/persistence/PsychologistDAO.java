package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.PsychologistDTO;

/**
 * This class represents a data access object (DAO) for managing
 * PsychologistsDTO objects.
 * 
 * @author Juan Pablo Urrego
 * @author Javier Meza Montero
 * @author Juan Esteban Quintero
 * @author Joann Alejandro Zamudio
 * @author Jeisson Nicolas Uyaban
 */
public class PsychologistDAO implements CRUDoperation<PsychologistDTO> {

	private ArrayList<PsychologistDTO> listPsychologists;

	/**
	 * Create an object of class PsychologistsDAO
	 */
	public PsychologistDAO() {
		listPsychologists = new ArrayList<>();
	}

	/**
	 * Gets the ArrayList containing PsychologistsDTO objects.
	 * 
	 * @return The ArrayList of PsychologistsDTO objects.
	 */
	public ArrayList<PsychologistDTO> getListPsychologists() {
		return listPsychologists;
	}

	/**
	 * Update the ArrayList containing PsychologistsDTO objects.
	 * 
	 * @param listPsychologists :The ArrayList of PsychologistsDTO objects.
	 */
	public void setListPsychologists(ArrayList<PsychologistDTO> listPsychologists) {
		this.listPsychologists = listPsychologists;
	}

	@Override
	public void create(PsychologistDTO info) {
		listPsychologists.add(info);
	}

	@Override
	public void update(int index, PsychologistDTO info) {
		listPsychologists.set(index, info);
	}

	@Override
	public PsychologistDTO delete(int index) {
		return listPsychologists.remove(index);
	}

}
