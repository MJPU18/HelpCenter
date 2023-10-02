package co.edu.unbosque.model.persistence;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

import co.edu.unbosque.controller.DBConnection;
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
	private DBConnection dbcon;

	/**
	 * Create an object of class ParticipantDAO
	 */
	public ParticipantDAO() {
		dbcon = new DBConnection();
		listParticipants = loadData();
		if (listParticipants == null)
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
		dbcon.initConnection();
		try {
			dbcon.setPreparedstatement(dbcon.getConnect().prepareStatement(
					"INSERT INTO participants (username, userpassword, personname, document, dateofbirth, cityofbirth, participatedsessions, nickname) VALUES(?,?,?,?,?,?,?,?);"));
			dbcon.getPreparedstatement().setString(1, info.getUserName());
			dbcon.getPreparedstatement().setString(2, info.getPassword());
			dbcon.getPreparedstatement().setString(3, info.getName());
			dbcon.getPreparedstatement().setLong(4, info.getDocument());
			dbcon.getPreparedstatement().setDate(5, Date.valueOf(info.getDateOfBirth()));
			dbcon.getPreparedstatement().setString(6, info.getCityOfBirth());
			dbcon.getPreparedstatement().setInt(7, info.getParticipatedSessions());
			dbcon.getPreparedstatement().setString(8, info.getNickName());
			dbcon.getPreparedstatement().executeUpdate();
			dbcon.close();
			listParticipants.add(info);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(int index, ParticipantDTO info) {
		long adocument = listParticipants.get(index).getDocument();
		dbcon.initConnection();
		try {
			dbcon.setPreparedstatement(dbcon.getConnect().prepareStatement(
					"UPDATE participants SET username=?, userpassword=?, personname=?, document=?, dateofbirth=?, cityofbirth=?, participatedsessions=?, nickname=? WHERE document=?;"));
			dbcon.getPreparedstatement().setString(1, info.getUserName());
			dbcon.getPreparedstatement().setString(2, info.getPassword());
			dbcon.getPreparedstatement().setString(3, info.getName());
			dbcon.getPreparedstatement().setLong(4, info.getDocument());
			dbcon.getPreparedstatement().setDate(5, Date.valueOf(info.getDateOfBirth()));
			dbcon.getPreparedstatement().setString(6, info.getCityOfBirth());
			dbcon.getPreparedstatement().setInt(7, info.getParticipatedSessions());
			dbcon.getPreparedstatement().setString(8, info.getNickName());
			dbcon.getPreparedstatement().setLong(9, adocument);
			dbcon.getPreparedstatement().executeUpdate();
			dbcon.close();
			listParticipants.set(index, info);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public ParticipantDTO delete(int index) {
		long document = listParticipants.get(index).getDocument();
		dbcon.initConnection();
		try {
			dbcon.setPreparedstatement(
					dbcon.getConnect().prepareStatement("DELETE FROM participants WHERE document=?;"));
			dbcon.getPreparedstatement().setLong(1, document);
			dbcon.getPreparedstatement().executeUpdate();
			return listParticipants.remove(index);
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
	public ArrayList<ParticipantDTO> loadData() {
		ArrayList<ParticipantDTO> data = new ArrayList<>();
		dbcon.initConnection();
		try {
			dbcon.setStatement(dbcon.getConnect().createStatement());
			dbcon.setResultset(dbcon.getStatement().executeQuery("SELECT *FROM participants;"));
			while (dbcon.getResultset().next()) {
				String userName = dbcon.getResultset().getString("username");
				String password = dbcon.getResultset().getString("userpassword");
				String name = dbcon.getResultset().getString("personname");
				long document = dbcon.getResultset().getLong("document");
				LocalDate dateOfBirth = LocalDate.of(dbcon.getResultset().getDate("dateofbirth").getDay(),
						Month.of(dbcon.getResultset().getDate("dateofbirth").getMonth()),
						dbcon.getResultset().getDate("dateofbirth").getYear());
				String cityOfBirth = dbcon.getResultset().getString("cityofbirth");
				int participatedSessions = dbcon.getResultset().getInt("participatedsessions");
				String nickName = dbcon.getResultset().getString("nickname");
				data.add(new ParticipantDTO(userName, password, name, document, dateOfBirth, cityOfBirth,
						participatedSessions, nickName));
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
		for(ParticipantDTO partcipant:listParticipants) {
			if(partcipant.getUserName().equals(username)&&partcipant.getPassword().equals(password)) {
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
		for(ParticipantDTO partcipant:listParticipants) {
			if(partcipant.getUserName().equals(username)) {
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
		for(ParticipantDTO partcipant:listParticipants) {
			if(partcipant.getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}


}
