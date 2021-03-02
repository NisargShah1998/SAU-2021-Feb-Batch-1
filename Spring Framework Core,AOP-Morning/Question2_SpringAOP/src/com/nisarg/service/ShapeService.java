package com.nisarg.service;

import com.nisarg.model.Rectangle;
import com.nisarg.model.Triangle;

public class ShapeService {
	private Rectangle rectangle;
	private Triangle triangle;
	
	public Rectangle getRectangle() {
		System.out.println("Getting the Rectangle Object");
		return rectangle;
	}
	
	public void setRectangle(Rectangle rectangle) {
		System.out.println("Setting the Rectangle Object");
		this.rectangle = rectangle;
	}
	
	public Triangle getTriangle() {
		System.out.println("Getting the Triangle Object");
		return triangle;
	}
	
	public void setTriangle(Triangle triangle) {
		System.out.println("Setting the Triangle Object");
		this.triangle = triangle;
	}
	
}
