package dao;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBCon {

	public static Connection getConnection() 
		{
		  Connection con = null;
		  try 
		  {
		  Class.forName("com.mysql.jdbc.Driver");
		  con = DriverManager.getConnection("jdbc:mysql://localhost/EmployeeDetails?user=root&password=gabbu0105");
		  } 
		  catch (Exception e) 
		  {
		  System.out.println("Error in connection" + e);
		  }
		  return con;
		}
}
