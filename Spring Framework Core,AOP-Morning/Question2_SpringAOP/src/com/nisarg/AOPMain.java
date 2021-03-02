package com.nisarg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nisarg.service.ShapeService;

public class AOPMain {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shapeService = (ShapeService) context.getBean("shapeservice");
		
		System.out.println();
		System.out.println("Setting Rectangle Object Name");
		shapeService.getRectangle().setName("NisargRectangle");
		System.out.println();

		//Throwing the Runtime Error
		System.out.println("Setting Triangle Object Name");
		shapeService.getTriangle().setName("NisargTriangle");
		System.out.println();
	}
}
