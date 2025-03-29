import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class jdbc_Demo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, Exception {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
//		1. loading driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
//		2. connetion url
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "MeNooob@18");
		
		PreparedStatement pstat = con.prepareStatement("insert into student values (?, ?)");
		
//		- Static Input
//		pstat.setInt(1, 104);
//		pstat.setString(2, "xyz");
		
//		- Dynamic Input
		System.out.print("ID : ");
		int id = sc.nextInt();
		System.out.print("Name : ");
		String name = sc.nextLine();
		
		pstat.setInt(1, id);
		pstat.setString(2, name);
		pstat.executeUpdate();

//		3. crEate statement obj
		Statement stat = con.createStatement();
		
//		4. result set
		ResultSet rs = stat.executeQuery("select * from student");
		
		
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+ " " + rs.getString(2));
		}
	}

}
