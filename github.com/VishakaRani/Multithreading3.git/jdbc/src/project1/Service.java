package project1;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Service {
	//ResultSet rs;
	Statement st;
	Connection connection;
	
	public Service() throws SQLException{
		this.connection = DBUtill.getConnection();
		this.st = connection.createStatement();
	}
	void addStudent() throws SQLException
	{
		String sql="insert into student(sid,sname,branch,yop)values(101,'vishaka','CSE','2022-07-31')";
		String row =null;
	System.out.println(row + "row" + "affected");
}

void getStudent()
{
	
}

void updateStudent()
{
}

void deleteStudent()
{
}
	}

