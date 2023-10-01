package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.PersonDTO;

/**
 * This class represents a data access object (DAO) for managing PersonDTO
 * objects.
 * 
 * @author Juan Pablo Urrego
 * @author Javier Meza Montero
 * @author Juan Esteban Quintero
 * @author Joann Alejandro Zamudio
 * @author Jeisson Nicolas Uyaban
 */
public class PersonDAO implements CRUDoperation<PersonDTO> {

	private ArrayList<PersonDTO> listPeople;

	/**
	 * Create an object of class PersonDAO
	 */
	public PersonDAO() {
		listPeople = new ArrayList<>();
	}

	/**
	 * Gets the ArrayList containing PersonDTO objects.
	 * 
	 * @return The ArrayList of PersonDTO objects.
	 */
	public ArrayList<PersonDTO> getListpeople() {
		return listPeople;
	}

	/**
	 * Update the ArrayList containing PersonDTO objects.
	 * 
	 * @param listpeople :The ArrayList of PersonDTO objects.
	 */
	public void setListpeople(ArrayList<PersonDTO> listpeople) {
		this.listPeople = listpeople;
	}

	@Override
	public void create(PersonDTO info) {
		listPeople.add(info);
	}

	@Override
	public void update(int index, PersonDTO info) {
		listPeople.set(index, info);
	}

	@Override
	public PersonDTO delete(int index) {
		return listPeople.remove(index);
	}

}
