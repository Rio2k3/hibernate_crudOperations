
package demoJDBC;
import java.sql.Connection;
import java.sql.DriverManager; //jdbc api//jpa
import java.sql.ResultSet;
import java.sql.Statement;

public class demo1 {

    public static void main(String[] args) {
    	Connection con=null;
    	Statement stmt = null;
    	ResultSet rs= null;
        // TODO Auto-generated method stub
        try {
            //STEP 1: LOADING DRIVER
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded");
            
            //STEP 2: ESTABLISH CONNECTION
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/julyjdbc","root","root");
            System.out.println("Connection established");
            
            //step3 medium statement
           stmt =  con.createStatement();
           System.out.println("medium created");
           
           //step 4 Querying
           String sql = "select * from kodnest";
          rs = stmt.executeQuery(sql);  //refers to column heading
           System.out.println("query executed and res is in java");
           
           //step 5 display result
           System.out.println("ID | NAME | MARKS");
           while(rs.next())
           {
        	   System.out.println(rs.getInt(1)+" | "+rs.getString(2)+" | "+rs.getInt(3) );
           }
           
           
          
        } catch(Exception e) {
            e.printStackTrace();
        }
        finally
        {
        	try
        	{
        		//step 6 closing resource
                con.close();
                stmt.close();
                rs.close();
                System.out.println("connection closed");
        	}
        	catch(Exception e)
        	{
        		e.printStackTrace();
        	}
        }
    }
}
