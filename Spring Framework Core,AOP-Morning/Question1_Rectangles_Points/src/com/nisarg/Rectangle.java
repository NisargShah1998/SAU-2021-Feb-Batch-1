package com.nisarg;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value="prototype")
public class Rectangle {
	private int width;
	private int height;
	
	@Autowired
	@Qualifier("PointA")
	private Point pointA;
	
	@Autowired
	@Qualifier("PointB")
	private Point pointB;
	
	@Autowired
	@Qualifier("PointC")
	private Point pointC;
	
	@Autowired
	@Qualifier("PointD")
	private Point pointD;
	
	@Autowired
	@Qualifier("PointsList")
	private ArrayList<Point> pointsList;
	
	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public Point getPointD() {
		return pointD;
	}

	public void setPointD(Point pointD) {
		this.pointD = pointD;
	}

	public ArrayList<Point> getPointsList() {
		return pointsList;
	}

	public void setPointsList(ArrayList<Point> pointsList) {
		this.pointsList = pointsList;
	}
	
	//Drawing using individual objects
	public void draw() {
		System.out.println("Drawing Rectangle with Individual Points: ");
		System.out.println("Rectangle Width: " + getWidth());
		System.out.println("Rectangle height: " + getHeight());
		System.out.println("Four Points of Rectangle are: ");
		System.out.println("Point A x: " + getPointA().getX() + " y: " + getPointA().getY());
		System.out.println("Point B x: " + getPointB().getX() + " y: " + getPointB().getY());
		System.out.println("Point C x: " + getPointC().getX() + " y: " + getPointC().getY());
		System.out.println("Point D x: " + getPointD().getX() + " y: " + getPointD().getY()+"\n");
	}
	
	//Drawing using List of Points:
	public void draw1() {
		System.out.println("Drawing Rectangle with List of Points: ");
		System.out.println("Rectangle Width: " + getWidth());
		System.out.println("Rectangle height: " + getHeight());
		char c = 'A';
		for(int i=0;i<getPointsList().size();i++) {
			System.out.println("Point "+c+" x: "+ getPointsList().get(i).getX() + " y: " + getPointsList().get(i).getY());
			c++;
		}
	}
	
}
