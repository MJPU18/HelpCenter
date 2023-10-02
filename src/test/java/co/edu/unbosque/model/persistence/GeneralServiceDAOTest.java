package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.GeneralServiceDTOTest;

/**
 * This class represents a data access object (DAO) for managing
 * GeneralServiceDAO objects.
 * 
 * @author Juan Pablo Urrego
 * @author Javier Meza Montero
 * @author Juan Esteban Quintero
 * @author Joann Alejandro Zamudio
 * @author Jeisson Nicolas Uyaban
 */
public class GeneralServiceDAOTest implements CRUDoperation<GeneralServiceDTOTest> {

	private ArrayList<GeneralServiceDTOTest> listGeneralService;

	/**
	 * Create an object of class GeneralServiceDAO.
	 */
	public GeneralServiceDAOTest() {
		listGeneralService = new ArrayList<>();
	}

	/**
	 * Gets the ArrayList containing GeneralServiceDTO objects.
	 * 
	 * @return The ArrayList of PersonDTO objects.
	 */
	public ArrayList<GeneralServiceDTOTest> getListGeneralService() {
		return listGeneralService;
	}

	/**
	 * Update the ArrayList containing GeneralServiceDTO objects.
	 * 
	 * @param listGeneralService :The ArrayList of GeneralServiceDTO objects.
	 */
	public void setListGeneralService(ArrayList<GeneralServiceDTOTest> listGeneralService) {
		this.listGeneralService = listGeneralService;
	}

	@Override
	public void create(GeneralServiceDTOTest info) {
		listGeneralService.add(info);

	}

	@Override
	public void update(int index, GeneralServiceDTOTest info) {
		listGeneralService.set(index, info);
	}

	@Override
	public GeneralServiceDTOTest delete(int index) {
		return listGeneralService.remove(index);
	}

}
