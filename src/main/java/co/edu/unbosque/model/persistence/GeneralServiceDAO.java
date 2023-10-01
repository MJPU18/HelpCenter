package co.edu.unbosque.model.persistence;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import co.edu.unbosque.controller.DBConnection;
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
	private DBConnection dbcon;
	
	/**
	 * Create an object of class GeneralServiceDAO.
	 */
	public GeneralServiceDAO() {
		dbcon=new DBConnection();
		listGeneralService=loadData();
		if(listGeneralService==null)listGeneralService=new ArrayList<>();
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
		try {
			dbcon.setPreparedstatement(dbcon.getConnect().prepareStatement(
					"INSERT INTO generalservice (username, userpassword, personname, document, dateofbirth, cityofbirth, salary, sessionscleaned) VALUES(?,?,?,?,?,?,?,?);"));
			dbcon.getPreparedstatement().setString(1, info.getUserName());
			dbcon.getPreparedstatement().setString(2, info.getPassword());
			dbcon.getPreparedstatement().setString(3, info.getName());
			dbcon.getPreparedstatement().setLong(4, info.getDocument());
			dbcon.getPreparedstatement().setDate(5, info.getDateOfBirth());
			dbcon.getPreparedstatement().setString(6, info.getCityOfBirth());
			dbcon.getPreparedstatement().setDouble(7, info.getSalary());
			dbcon.getPreparedstatement().setInt(8, info.getSessionsCleaned());
			dbcon.getPreparedstatement().executeUpdate();
			dbcon.close();
			listGeneralService.add(info);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(int index, GeneralServiceDTO info) {
		long adocument = listGeneralService.get(index).getDocument();
		dbcon.initConnection();
		try {
			dbcon.setPreparedstatement(dbcon.getConnect().prepareStatement(
					"UPDATE generalservice SET username=?, userpassword=?, personname=?, document=?, dateofbirth=?, cityofbirth=?, salary=?, sessionscleaned=? WHERE document=?;"));
			dbcon.getPreparedstatement().setString(1, info.getUserName());
			dbcon.getPreparedstatement().setString(2, info.getPassword());
			dbcon.getPreparedstatement().setString(3, info.getName());
			dbcon.getPreparedstatement().setLong(4, info.getDocument());
			dbcon.getPreparedstatement().setDate(5, info.getDateOfBirth());
			dbcon.getPreparedstatement().setString(6, info.getCityOfBirth());
			dbcon.getPreparedstatement().setDouble(7, info.getSalary());
			dbcon.getPreparedstatement().setInt(8, info.getSessionsCleaned());
			dbcon.getPreparedstatement().setLong(9, adocument);
			dbcon.getPreparedstatement().executeUpdate();
			dbcon.close();
			listGeneralService.set(index, info);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public GeneralServiceDTO delete(int index) {
		long document = listGeneralService.get(index).getDocument();
		dbcon.initConnection();
		try {
			dbcon.setPreparedstatement(
					dbcon.getConnect().prepareStatement("DELETE FROM generalservice WHERE document=?;"));
			dbcon.getPreparedstatement().setLong(1, document);
			dbcon.getPreparedstatement().executeUpdate();
			return listGeneralService.remove(index);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Loads the information from the database.
	 * 
	 * @return The ArrayList of GeneralServiceDTO objects with information from the
	 *         database.
	 */
	public ArrayList<GeneralServiceDTO> loadData() {
		ArrayList<GeneralServiceDTO> data = new ArrayList<>();
		dbcon.initConnection();
		try {
			dbcon.setStatement(dbcon.getConnect().createStatement());
			dbcon.setResultset(dbcon.getStatement().executeQuery("SELECT *FROM generalservice;"));
			while (dbcon.getResultset().next()) {
				String userName = dbcon.getResultset().getString("username");
				String password = dbcon.getResultset().getString("userpassword");
				String name = dbcon.getResultset().getString("personname");
				long document = dbcon.getResultset().getLong("document");
				Date dateOfBirth = dbcon.getResultset().getDate("dateofbirth");
				String cityOfBirth = dbcon.getResultset().getString("cityofbirth");
				double salary=dbcon.getResultset().getDouble("salary");
				int sessionsCleaned=dbcon.getResultset().getInt("sessionscleaned");
				data.add(new GeneralServiceDTO(userName, password, name, document, dateOfBirth, cityOfBirth,
						salary, sessionsCleaned));
			}
			dbcon.close();
			return data;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	

	/**
	 * Check that the specified username and password exist.
	 * @param username User to check
	 * @param password Password to check
	 * @return True if the username and password exist, False if not.
	 */
	public boolean containsUser(String username, String password) {
		for(GeneralServiceDTO service: listGeneralService) {
			if(service.getUserName().equals(username)&&service.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Check that the specified username exists.
	 * @param username Username to check
	 * @return True if the username exist, False if not.
	 */
	public boolean containsUserName(String username) {
		for(GeneralServiceDTO service: listGeneralService) {
			if(service.getUserName().equals(username)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Check that the specified password exists.
	 * @param password Password to check
	 * @return True if the password exist, False if not.
	 */
	public boolean containsPassword(String password) {
		for(GeneralServiceDTO service: listGeneralService) {
			if(service.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

}
