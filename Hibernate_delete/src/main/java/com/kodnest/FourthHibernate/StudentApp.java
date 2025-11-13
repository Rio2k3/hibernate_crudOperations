package com.kodnest.FourthHibernate;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//delete a row from database using hibernate
import org.hibernate.cfg.Configuration;
//delete operation by hibernate
public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
	SessionFactory factory=	configuration.buildSessionFactory();
	
	Session session = factory.openSession();
	
	Transaction transaction = session.beginTransaction();
	
	System.out.println("Enter the id to be deleted");
	Scanner sc = new Scanner(System.in);
	
	int id = sc.nextInt();
	
	student s = session.get(student.class, id);
	if(s!=null)
	{
		
		session.remove(s);
		System.out.println(id+ "th id row is deleted successfull from db");
	}
	else
	{
		System.out.println("You entered invalid id");
	}
	 
	transaction.commit();
	session.close();
	factory.close();
	sc.close();
	}

}
