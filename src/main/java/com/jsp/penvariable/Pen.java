package com.jsp.penvariable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Pen {
	
	@Value(value = "Reynolds")
	String name;
	@Value(value = "Black")
	String color;
	@Value(value = "25")
	double price;
	
	
	public Pen() {
		System.out.println("Pen Object Is Created.....");
	}
	
	public void printPenDetails() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
	}
	

}
