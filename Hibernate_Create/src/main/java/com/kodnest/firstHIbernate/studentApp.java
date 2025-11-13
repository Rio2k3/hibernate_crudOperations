package com.kodnest.firstHIbernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class studentApp {
//create operation from hibernate
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student1 s = new student1(11,125,"derick",20);
		
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
		
		//step 5 perform operation
		//storing operation in db
		session.persist(s); //saving of obj
		
		//step 6 commit transaction
		transaction.commit();
		
		//step 7 close session
		session.close();
		
		//step 8 close session factory
		factory.close();
	}

}
