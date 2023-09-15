package com.hibernateWithMaven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Client {
	
	public static void main(String[] args) {
	System.out.println("1");
		Configuration config = new Configuration();
		System.out.println("2");
		config.configure();
		System.out.println("3");
		config.addAnnotatedClass(Employee.class);
		System.out.println("4");
		
		SessionFactory factory = config.buildSessionFactory();
		System.out.println("5");
		
		Session session = factory.openSession();
		System.out.println("6");
		Transaction tx = session.beginTransaction();

		Employee emp = new Employee(2,"kaustav","engineer");
		System.out.println("7");
		session.save(emp);
		System.out.println("8");
		tx.commit();
	}
	

}
