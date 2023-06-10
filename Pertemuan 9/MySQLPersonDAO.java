import java.sql.*;

/**
 * File : MySQLPersonDAO.java
 * Deskripsi : Implementasi PersonDAO untuk MySQL
 */
 
 public class MySQLPersonDAO implements PersonDAO{
	 public void savePerson (Person person) throws Exception{
		 String name = person.getName();
			// Membuat koneksi, nama db, user, password menyesuaikan
		Class.forName("com.mysql.jdbc.Driver");
		 Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost/pbo","root","ifundipjaya");
			// kerjakan mysql query
		String query = "INSERT INTO person(name) VALUES('"+name+"')";
		System.out.println(query);
		Statement s = con.createStatement();
		s.executeUpdate(query);
			// tutup koneksi database
		con.close();
		 
	 }
 }