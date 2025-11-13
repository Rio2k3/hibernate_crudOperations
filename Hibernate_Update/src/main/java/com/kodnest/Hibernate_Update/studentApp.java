package com.kodnest.Hibernate_Update;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class studentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
	SessionFactory factory=	configuration.buildSessionFactory();
	
	Session session = factory.openSession();
	
	Transaction transaction = session.beginTransaction();
	
	System.out.println("Enter in which id u want to update");
	int id = sc.nextInt();
	
	
	student s = session.get(student.class, id);
	if(s!=null)
	{
		s.setName("gopi");
		s.setMarks(99);
		session.update(s);
		System.out.println(id+ "th id row is updated successfull from db");
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
