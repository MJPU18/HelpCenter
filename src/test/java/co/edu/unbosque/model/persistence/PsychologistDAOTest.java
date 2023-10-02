package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.PsychologistDTOTest;
/**
 * This class represents a data access object (DAO) for managing PsychologistsDTO objects.
 * @author Juan Pablo Urrego
 * @author Javier Meza Montero
 * @author Juan Esteban Quintero
 * @author Joann Alejandro Zamudio
 * @author Jeisson Nicolas Uyaban
 */
public class PsychologistDAOTest implements CRUDoperation<PsychologistDTOTest>{
	
	private ArrayList<PsychologistDTOTest> listPsychologists;
	
	/**
	 * Create an object of class PsychologistsDAO
	 */
	public PsychologistDAOTest() {
		listPsychologists=new ArrayList<>();
	}
	
	/**
     * Gets the ArrayList containing PsychologistsDTO objects.
     * @return The ArrayList of PsychologistsDTO objects.
     */
	public ArrayList<PsychologistDTOTest> getListPsychologists() {
		return listPsychologists;
	}
	
	/**
	 * Update the ArrayList containing PsychologistsDTO objects.
	 * @param listPsychologists :The ArrayList of PsychologistsDTO objects.
	 */
	public void setListPsychologists(ArrayList<PsychologistDTOTest> listPsychologists) {
		this.listPsychologists = listPsychologists;
	}



	@Override
	public void create(PsychologistDTOTest info) {
		listPsychologists.add(info);
	}

	@Override
	public void update(int index, PsychologistDTOTest info) {
		listPsychologists.set(index, info);
	}

	@Override
	public PsychologistDTOTest delete(int index) {
		return listPsychologists.remove(index);
	}


}
