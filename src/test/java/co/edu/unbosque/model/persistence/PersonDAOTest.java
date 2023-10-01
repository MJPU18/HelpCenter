package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.PersonDTOTest;
/**
 * This class represents a data access object (DAO) for managing PersonDTO objects.
 * @author Juan Pablo Urrego
 * @author Javier Meza Montero
 * @author Juan Esteban Quintero
 * @author Joann Alejandro Zamudio
 * @author Jeisson Nicolas Uyaban
 */
public class PersonDAOTest implements CRUDoperation<PersonDTOTest>{
	
	private ArrayList<PersonDTOTest> listPeople;
	
	/**
	 * Create an object of class PersonDAO
	 */
	public PersonDAOTest() {
		listPeople=new ArrayList<>();
	}
	
	/**
     * Gets the ArrayList containing PersonDTO objects.
     * @return The ArrayList of PersonDTO objects.
     */
	public ArrayList<PersonDTOTest> getListpeople() {
		return listPeople;
	}
	
	/**
	 * Update the ArrayList containing PersonDTO objects.
	 * @param listpeople :The ArrayList of PersonDTO objects.
	 */
	public void setListpeople(ArrayList<PersonDTOTest> listpeople) {
		this.listPeople = listpeople;
	}

	@Override
	public void create(PersonDTOTest info) {
		listPeople.add(info);
	}

	@Override
	public void update(int index, PersonDTOTest info) {
		listPeople.set(index, info);
	}

	@Override
	public PersonDTOTest delete(int index) {
		return listPeople.remove(index);
	}
	
	

}
