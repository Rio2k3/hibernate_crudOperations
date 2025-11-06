package com.kodnest.jdbcTransactions;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class moneyTransfer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt1=null;
		PreparedStatement pstmt2=null;
		Scanner scan = new Scanner(System.in);
		String sql1="update gcgcbank set accbalance=accBalance-? where accno=?";
		String sql2="update gcgcbank set accbalance=accBalance+? where accno=?";
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/kodbank","root","root");
		pstmt1=con.prepareStatement(sql1);
		pstmt2=con.prepareStatement(sql2);
		System.out.println("enter from accno, toAccno and amount to transfer");
		int fan=scan.nextInt();
		int tan=scan.nextInt();
		int amount= scan.nextInt();
		pstmt1.setInt(1,amount);
		pstmt1.setInt(2, fan);
		pstmt2.setInt(1, amount);
		pstmt2.setInt(2, tan);
		
		con.setAutoCommit(false);  // to make the statement wait for two sql query to execute and make the change in db
		int nora=pstmt1.executeUpdate();
		System.out.println(nora+" ");
		nora =pstmt2.executeUpdate();
		System.out.println(nora +" ");
		con.commit();  // here after executing all queries making changes
		
		con.close();
		pstmt1.close();
		pstmt2.close();
		scan.close();
	}
		catch(Exception e)
		{
			try
			{
				con.rollback();  //in case if any error happens it should roll back to the previous state
			}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
			
		}
	}

}
