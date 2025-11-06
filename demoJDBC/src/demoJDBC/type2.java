package demoJDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
public class type2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Scanner scan =  new Scanner(System.in);
		String path = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/julyjdbc";
		String username = "root";
		String password = "root";
		
		String sql = "select * from kodnest where id=?";//? is placeholder
		try {
			//step 1 load driver
			
			Class.forName(path);
			
			//step2  establish conection
			con  = DriverManager.getConnection(url, username, password);
			
			//step 3 create statement medium
		 ps=con.prepareStatement(sql);
		 System.out.println("ENTER THE ID TO FETCH DATA ");
		 int id  = scan.nextInt();
		 ps.setInt(1, id);
		 //(set in first placeholder,)
		 
		 //step 4 querying
		rs= ps.executeQuery();
		 //returns result set type value so wee are storring in rs of type REsultset type
		
		//step 5 display 
		if(rs.next())
		{
			System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | " +rs.getInt(3));
		}
		else
		{
			System.out.println("INCORRECT VALUE OF ID PLS ENTER VALID NUMBER");
		}
	
		}
		catch (Exception e)
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
                rs.close();
                scan.close();
                System.out.println("connection closed");
        	}
        	catch(Exception e)
        	{
        		e.printStackTrace();
        	}
        }
	}

}
