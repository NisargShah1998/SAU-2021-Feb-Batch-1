package com.nisarg.model;

public class Triangle {
	private String name;

	public String getName() {
		System.out.println("Getting Triangle name");
		return name;
	}

	public void setName(String name){
		this.name = name;
		System.out.println("Setting Triangle name "+ name);
		throw new RuntimeException();
	}
}
