package com.nisarg;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean(name="RectangleObject")
	public Rectangle getRectangle() {
		return new Rectangle(10,20);
	}
	
	//All Individual Points
	@Bean(name="PointA")
	public Point getPointA() {
		return new Point(10,20);
	}
	
	@Bean(name="PointB")
	public Point getPointB() {
		return new Point(20,20);
	}
	
	@Bean(name="PointC")
	public Point getPointC() {
		return new Point(20,40);
	}
	
	@Bean(name="PointD")
	public Point getPointD() {
		return new Point(10,40);
	}
	
	//List of Points
	@Bean(name="PointsList")
	public ArrayList<Point> getAllPoints(){
		ArrayList<Point> pointList = new ArrayList<Point>();
		
		pointList.add(new Point(0,0));
		pointList.add(new Point(10,0));
		pointList.add(new Point(10,20));
		pointList.add(new Point(0,20));
		return pointList;
	}
	
}
