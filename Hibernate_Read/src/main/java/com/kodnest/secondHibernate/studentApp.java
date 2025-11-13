package com.kodnest.secondHibernate;
//reading operation using hibernate
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class studentApp {
//read operation using hibernate 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// reading from db so no need of obj creaationstudent1 s = new student1(11,125,"derick",20);
		
		//step 1 loading configuration
		//treating config of xml file as obj
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		
		//step 2 build session factory
		//gives us the session factory 
		SessionFactory factory = configuration.buildSessionFactory();
		
		//step 3 open session
		//gets one session
		Session session = factory.openSession();	
		
		//step 4 begin the transaction
		
		Transaction transaction= session.beginTransaction();
		System.out.println("ENTer the student id to fetch");
		int id = sc.nextInt();
		
		// below hibernate retrives from db and gives as obj
		student1 s  = session.get(student1.class,id);
		if(s!=null) {
		System.out.println("DATA FETCHED FROM DB");
		System.out.println(s);
		}
		else
		{
			System.out.println("Invalid id");
		}
		//step 5 perform operation
		//storing operation in db
		//session.persist(s); //saving of obj
		
		//step 6 commit transaction
		transaction.commit();
		
		//step 7 close session
		session.close();
		
		//step 8 close session factory
		factory.close();
		sc.close();
	}

}
