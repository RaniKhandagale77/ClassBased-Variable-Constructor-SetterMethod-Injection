package com.jsp.student.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.configuration.MyConfig;

public class StudentDriver {

	
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
		Student student=(Student)applicationContext.getBean("student");
		student.printStudentDetails();
	}
}
