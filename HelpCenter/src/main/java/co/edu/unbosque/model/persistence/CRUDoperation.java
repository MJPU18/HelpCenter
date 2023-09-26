package co.edu.unbosque.model.persistence;
/**
 * This interface defines the CRUD operations to manage the data records.
 * @param <T> The type of data being manipulated and stored
 * @author Juan Pablo Urrego
 * @author Javier Meza Montero
 * @author Juan Esteban Quintero
 * @author Joann Alejandro Zamudio
 * @author Jeisson Nicolas Uyaban
 *  
 */
public interface CRUDoperation<T> {
	
	/**
	 * Stores the information in the DAO
	 * @param info :Data or object to be stored
	 */
	public void create(T info);
	
	/**
	 * Update a data or object in the DAO
	 * @param index :Index to identify the data or object to be updated
	 * @param info :The new object or data
	 */
	public void update(int index, T info);
	
	/**
	 * Removes an object or data from the DAO
	 * @param index :Index to identify the object to be removed.
	 * @return The deleted data or object
	 */
	public T delete(int index);
	
}
