package co.edu.unbosque.connection.model.persistence;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;

import co.edu.unbosque.connection.controller.DBConnectionForTest;
import co.edu.unbosque.controller.DBConnection;
import co.edu.unbosque.model.PsychologistDTO;
import co.edu.unbosque.model.persistence.CRUDoperation;

/**
 * This class is the same representation of a psychologist person, but focused
 * directly on recording evidence.*
 */

public class PsychologistDAOForTest implements CRUDoperation<PsychologistDTO> {

	private ArrayList<PsychologistDTO> listPsychologists;
	private DBConnectionForTest dbcon;

	/**
	 * Create an object of class PsychologistsDAO
	 */
	public PsychologistDAOForTest() {
		dbcon = new DBConnectionForTest();
		listPsychologists = loadData();
		if (listPsychologists == null)
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
		dbcon.initConnection();
		try {
			dbcon.setPreparedstatement(dbcon.getConnect().prepareStatement(
					"INSERT INTO psychologist (username, userpassword, personname, document, dateofbirth, cityofbirth, yearofgraduation, daysinservice, suportedsessions, salary) VALUES(?,?,?,?,?,?,?,?,?,?);"));
			dbcon.getPreparedstatement().setString(1, info.getUserName());
			dbcon.getPreparedstatement().setString(2, info.getPassword());
			dbcon.getPreparedstatement().setString(3, info.getName());
			dbcon.getPreparedstatement().setLong(4, info.getDocument());
			dbcon.getPreparedstatement().setDate(5, Date.valueOf(info.getDateOfBirth()));
			dbcon.getPreparedstatement().setString(6, info.getCityOfBirth());
			dbcon.getPreparedstatement().setInt(7, info.getYearOfGraduation().getValue());
			dbcon.getPreparedstatement().setInt(8, info.getDaysInService());
			dbcon.getPreparedstatement().setInt(9, info.getSuportedSessions());
			dbcon.getPreparedstatement().setDouble(10, info.getSalary());
			dbcon.getPreparedstatement().executeUpdate();
			dbcon.close();
			listPsychologists.add(info);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(int index, PsychologistDTO info) {
		long adocument = listPsychologists.get(index).getDocument();
		dbcon.initConnection();
		try {
			dbcon.setPreparedstatement(dbcon.getConnect().prepareStatement(
					"UPDATE psychologist SET username=?, userpassword=?, personname=?, document=?, dateofbirth=?, cityofbirth=?, yearofgraduation=?, daysinservice=?, suportedsessions=?, salary=? WHERE document=?;"));
			dbcon.getPreparedstatement().setString(1, info.getUserName());
			dbcon.getPreparedstatement().setString(2, info.getPassword());
			dbcon.getPreparedstatement().setString(3, info.getName());
			dbcon.getPreparedstatement().setLong(4, info.getDocument());
			dbcon.getPreparedstatement().setDate(5, Date.valueOf(info.getDateOfBirth()));
			dbcon.getPreparedstatement().setString(6, info.getCityOfBirth());
			dbcon.getPreparedstatement().setInt(7, info.getYearOfGraduation().getValue());
			dbcon.getPreparedstatement().setInt(8, info.getDaysInService());
			dbcon.getPreparedstatement().setInt(9, info.getSuportedSessions());
			dbcon.getPreparedstatement().setDouble(10, info.getSalary());
			dbcon.getPreparedstatement().setLong(11, adocument);
			dbcon.getPreparedstatement().executeUpdate();
			dbcon.close();
			listPsychologists.set(index, info);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public PsychologistDTO delete(int index) {
		long document = listPsychologists.get(index).getDocument();
		dbcon.initConnection();
		try {
			dbcon.setPreparedstatement(
					dbcon.getConnect().prepareStatement("DELETE FROM psychologist WHERE document=?;"));
			dbcon.getPreparedstatement().setLong(1, document);
			dbcon.getPreparedstatement().executeUpdate();
			dbcon.close();
			return listPsychologists.remove(index);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Loads the information from the database.
	 * 
	 * @return The ArrayList of PsychologistDTO objects with information from the
	 *         database.
	 */
	public ArrayList<PsychologistDTO> loadData() {
		ArrayList<PsychologistDTO> data = new ArrayList<>();
		dbcon.initConnection();
		try {
			dbcon.setStatement(dbcon.getConnect().createStatement());
			dbcon.setResultset(dbcon.getStatement().executeQuery("SELECT *FROM psychologist;"));
			while (dbcon.getResultset().next()) {
				String userName = dbcon.getResultset().getString("username");
				String password = dbcon.getResultset().getString("userpassword");
				String name = dbcon.getResultset().getString("personname");
				long document = dbcon.getResultset().getLong("document");
				LocalDate dateOfBirth = dbcon.getResultset().getDate("dateofbirth").toLocalDate();
				String cityOfBirth = dbcon.getResultset().getString("cityofbirth");
				int yearOfGraduation = dbcon.getResultset().getInt("yearofgraduation");
				int daysInService = dbcon.getResultset().getInt("daysinservice");
				int suportedSessions = dbcon.getResultset().getInt("suportedsessions");
				double salary = dbcon.getResultset().getDouble("salary");
				data.add(new PsychologistDTO(userName, password, name, document, dateOfBirth, cityOfBirth,
						Year.of(yearOfGraduation), daysInService, suportedSessions, salary));
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
		for (PsychologistDTO psyco : listPsychologists) {
			if (psyco.getUserName().equals(username) && psyco.getPassword().equals(password)) {
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
		for (PsychologistDTO psyco : listPsychologists) {
			if (psyco.getUserName().equals(username)) {
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
		for (PsychologistDTO psyco : listPsychologists) {
			if (psyco.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

}
