package project1;
//public class SQL{
import java.sql.*;
public class DBUtill {
	private static final String DB_DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
	private static final String DB_USERNAME="root";
	private static final String DB_PASSWORD="admin";
	private static final String DB_URL="JDBC:MYSQL://localhost:3306/ait_db";
	
	private static Connection con=null;
	static
	{
		try
		{
			Class.forName(DB_DRIVER_CLASS);
			con=DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
			}
		catch(ClassNotFoundException| SQLException e)
		{
			e.printStackTrace();
		}
	}
	public static Connection getConnection()
	{
		return con;
		}
		
		}
	
