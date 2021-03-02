package com.nisarg.model;

public class Rectangle {
	private String name;

	public String getName() {
		System.out.println("Getting Rectangle name");
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting Rectangle name " + name);
		this.name = name;
	}
}
