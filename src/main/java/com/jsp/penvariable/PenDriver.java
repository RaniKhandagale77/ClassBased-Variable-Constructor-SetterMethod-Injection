package com.jsp.penvariable;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jsp.configuration.MyConfig;

public class PenDriver {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
		Pen pen=(Pen)applicationContext.getBean("pen");
		pen.printPenDetails();
	}

}
