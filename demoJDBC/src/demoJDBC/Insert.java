package demoJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  =new Scanner(System.in);
		String path = "com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/julyjdbc";
		String username = "root";
		String password = "root";
		Connection con=null;
		PreparedStatement ps = null;
		
		String sql  = "insert into kodnest values (?,?,?)";
		try
		{
			//1 load the driver
			Class.forName(path);
			
			//2 establish connection
			 con=DriverManager.getConnection(url,username,password);
			 
			 //3 create stmnt medium
			 ps = con.prepareStatement(sql);
			 
			 System.out.println("Enter the values of id,name,marks to be inserted for the table");
			 int id = sc.nextInt();
			 String name=sc.next();
			 int marks = sc.nextInt();
			 
			 ps.setInt(1, id);
			 ps.setString(2, name);
			 ps.setInt(3, marks);
			 
			 //4 querying
			 int nora=ps.executeUpdate();//nora=no.of.rows affected
			 
			 //5 display
			 System.out.println(nora + "row(s) affected");
			 
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
        {
        	try
        	{
        		//step 6 closing resource
                con.close();
                ps.close();
              
                sc.close();
                System.out.println("connection closed");
        	}
        	catch(Exception e)
        	{
        		e.printStackTrace();
        	}
        }
	}

}
