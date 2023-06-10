/**
 * File 		: DAOManager.java
 * Deskripsi		: Pengelola DAO dalam program
 * Nama Pembuat 	: Fahriant Ekrie
 * NIM			: 24060121130071
 */
 
public class DAOManager{
	private PersonDAO personDAO;
	
	public void setPersonDAO(PersonDAO person){
		personDAO = person;
	}
	
	public PersonDAO getPersonDAO(){
		return personDAO;
	}
}
