package com.jsp.car.Setter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {

	private String name;
	private String color;
	private double price;
	
	
	public String getName() {
		return name;
	}
@Value(value = "BMW")
	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	
	@Value(value = "Black")
	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	
	@Value(value = "8900000")
	public void setPrice(double price) {
		this.price = price;
	}

	public Car() {
		System.out.println("Car object is Created..");
	}
	
	public void printCarDetails() {
		System.out.println(name);
		System.out.println(color);
		System.out.println(price);
	}
}
