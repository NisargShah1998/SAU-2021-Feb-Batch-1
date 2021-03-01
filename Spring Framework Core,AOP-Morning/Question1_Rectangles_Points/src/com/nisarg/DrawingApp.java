package com.nisarg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DrawingApp {
	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Rectangle rectangle = (Rectangle)factory.getBean("RectangleObject");
        		
    	//Drawing using individual objects
        rectangle.draw();
        
    	//Drawing using List of Points:
        rectangle.draw1();
	}
}
