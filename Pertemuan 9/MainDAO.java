/**
 * File 		: MainDAO.java
 * Deskripsi 		: Main Program untuk akses DAO
 * Nama Pembuat 	: Fahriant Ekrie
 * NIM			: 24060121130071
 */
 
 public class MainDAO{
	 public static void main(String args[]){
		 Person person = new Person("Indra");
		 DAOManager m = new DAOManager();
		 m.setPersonDAO(new MySQLPersonDAO());
		 try{
			 m.getPersonDAO().savePerson(person);
		 }catch(Exception e){
			 e.printStackTrace();
		 }
	 }
 }
