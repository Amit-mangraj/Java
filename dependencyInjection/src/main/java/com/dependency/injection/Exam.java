package com.dependency.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a object of student 
		//Student stu = new Student();    //to consume the student dependency
		
		//IOC spring is going to create and manage our objects inside the application context(IOC Container)
		//stu.setStudentName("Amit Kumar Mangraraj");
		//stu.displayName();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		      Student amit  = context.getBean("student",Student.class);
		      amit.displayName();
		      
				/*
				 * Student sandy = context.getBean("studentB", Student.class);
				 * sandy.displayName();
				 */
		      Student  stub = context.getBean("studentb",Student.class);
		      stub.displayName();
	}

}
