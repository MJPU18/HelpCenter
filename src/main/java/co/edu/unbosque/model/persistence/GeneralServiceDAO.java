package co.edu.unbosque.model.persistence;

import java.util.ArrayList;

import co.edu.unbosque.model.GeneralServiceDTO;
/**
 * This class represents a data access object (DAO) for managing GeneralServiceDAO objects.
 * @author Juan Pablo Urrego
 * @author Javier Meza Montero
 * @author Juan Esteban Quintero
 * @author Joann Alejandro Zamudio
 * @author Jeisson Nicolas Uyaban
 */
public class GeneralServiceDAO implements CRUDoperation<GeneralServiceDTO>{
	
	private ArrayList<GeneralServiceDTO> listGeneralService;
	
	/**
	 * Create an object of class GeneralServiceDAO.
	 */
	public GeneralServiceDAO() {
		listGeneralService=new ArrayList<>();
	}
	
	/**
     * Gets the ArrayList containing GeneralServiceDTO objects.
     * @return The ArrayList of PersonDTO objects.
     */
	public ArrayList<GeneralServiceDTO> getListGeneralService() {
		return listGeneralService;
	}
	
	/**
	 * Update the ArrayList containing GeneralServiceDTO objects.
	 * @param listGeneralService :The ArrayList of GeneralServiceDTO objects.
	 */
	public void setListGeneralService(ArrayList<GeneralServiceDTO> listGeneralService) {
		this.listGeneralService = listGeneralService;
	}

	@Override
	public void create(GeneralServiceDTO info) {
		listGeneralService.add(info);
		
	}

	@Override
	public void update(int index, GeneralServiceDTO info) {
		listGeneralService.set(index, info);
	}

	@Override
	public GeneralServiceDTO delete(int index) {
		return listGeneralService.remove(index);
	}
	
	

}
