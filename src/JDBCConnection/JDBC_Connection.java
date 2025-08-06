package JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Connection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host = "localhost";
		String port = "3306";
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/Employeeportal","root","Singh123@");
		Statement stat = con.createStatement();
		ResultSet rs = stat.executeQuery("Select * From EmployeeInfo Where age = 34");
		while(rs.next()) {
			//add space in this code
<<<<<<< HEAD
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();	
=======
			WebDriver driver = new ChromeDriver();
			driver.get("www.google.com");
>>>>>>> master
		System.out.print(rs.getString("name")+" ");
		System.out.print(rs.getString("id")+" ");
		System.out.println(rs.getString("dept"));
	
		}


		
		

	}

}
