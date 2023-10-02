package co.edu.unbosque.model.persistence;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import co.edu.unbosque.controller.DBConnection;
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
	private DBConnection dbcon;

	/**
	 * Create an object of class PersonDAO
	 */
	public PersonDAO() {
		dbcon = new DBConnection();
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
		dbcon.initConnection();
		try {
			dbcon.setPreparedstatement(dbcon.getConnect().prepareStatement(
					"INSERT INTO persons (username, userpassword, personname, document, dateofbirth, cityofbirth) VALUES(?,?,?,?,?,?);"));
			dbcon.getPreparedstatement().setString(1, info.getUserName());
			dbcon.getPreparedstatement().setString(2, info.getPassword());
			dbcon.getPreparedstatement().setString(3, info.getName());
			dbcon.getPreparedstatement().setLong(4, info.getDocument());
			dbcon.getPreparedstatement().setDate(5, Date.valueOf(info.getDateOfBirth()));
			dbcon.getPreparedstatement().setString(6, info.getCityOfBirth());
			dbcon.getPreparedstatement().executeUpdate();
			dbcon.close();
			listPeople.add(info);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(int index, PersonDTO info) {
		long adocument = listPeople.get(index).getDocument();
		dbcon.initConnection();
		try {
			dbcon.setPreparedstatement(dbcon.getConnect().prepareStatement(
					"UPDATE persons SET username=?, userpassword=?, personname=?, document=?, dateofbirth=?, cityofbirth=?  WHERE document=?;"));
			dbcon.getPreparedstatement().setString(1, info.getUserName());
			dbcon.getPreparedstatement().setString(2, info.getPassword());
			dbcon.getPreparedstatement().setString(3, info.getName());
			dbcon.getPreparedstatement().setLong(4, info.getDocument());
			dbcon.getPreparedstatement().setDate(5, Date.valueOf(info.getDateOfBirth()));
			dbcon.getPreparedstatement().setString(6, info.getCityOfBirth());
			dbcon.getPreparedstatement().setLong(7, adocument);
			dbcon.getPreparedstatement().executeUpdate();
			dbcon.close();
			listPeople.set(index, info);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public PersonDTO delete(int index) {
		long document = listPeople.get(index).getDocument();
		dbcon.initConnection();
		try {
			dbcon.setPreparedstatement(dbcon.getConnect().prepareStatement("DELETE FROM persons WHERE document=?;"));
			dbcon.getPreparedstatement().setLong(1, document);
			dbcon.getPreparedstatement().executeUpdate();
			return listPeople.remove(index);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Loads the information from the database.
	 * 
	 * @return The ArrayList of ParticipantDTO objects with information from the
	 *         database.
	 */
	public ArrayList<PersonDTO> loadData() {
		ArrayList<PersonDTO> data = new ArrayList<>();
		dbcon.initConnection();
		try {
			dbcon.setStatement(dbcon.getConnect().createStatement());
			dbcon.setResultset(dbcon.getStatement().executeQuery("SELECT *FROM persons;"));
			while (dbcon.getResultset().next()) {
				String userName = dbcon.getResultset().getString("username");
				String password = dbcon.getResultset().getString("userpassword");
				String name = dbcon.getResultset().getString("personname");
				long document = dbcon.getResultset().getLong("document");
				LocalDate dateOfBirth = LocalDate.of(dbcon.getResultset().getDate("dateofbirth").getDay(),
						Month.of(dbcon.getResultset().getDate("dateofbirth").getMonth()),
						dbcon.getResultset().getDate("dateofbirth").getYear());
				String cityOfBirth = dbcon.getResultset().getString("cityofbirth");
				data.add(new PersonDTO(userName, password, name, document, dateOfBirth, cityOfBirth));
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
	 * 
	 * @param username User to check
	 * @param password Password to check
	 * @return True if the username and password exist, False if not.
	 */
	public boolean containsUser(String username, String password) {
		for (PersonDTO person : listPeople) {
			if (person.getUserName().equals(username) && person.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Check that the specified username exists.
	 * 
	 * @param username Username to check
	 * @return True if the username exist, False if not.
	 */
	public boolean containsUserName(String username) {
		for (PersonDTO person : listPeople) {
			if (person.getUserName().equals(username)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Check that the specified password exists.
	 * 
	 * @param password Password to check
	 * @return True if the password exist, False if not.
	 */
	public boolean containsPassword(String password) {
		for (PersonDTO person : listPeople) {
			if (person.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

}
