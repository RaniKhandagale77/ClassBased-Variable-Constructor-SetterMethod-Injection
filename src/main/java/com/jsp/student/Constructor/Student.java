package com.jsp.student.Constructor;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	int id;
	String name;
	String email;
	String password;
	
	
	
	public Student(@Value(value = "1") int id,
			@Value(value = "Vira")String name, @Value(value = "vira@123gmail.com") String email,
			@Value(value = "Vira@123") String password) {
         this.id=id;
         this.name=name;
         this.email=email;
         this.password=password;

	}
	
	public void printStudentDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(email);
		System.out.println(password);
	}
}
