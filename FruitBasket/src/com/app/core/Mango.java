package com.app.core;

public class Mango  extends Fruit{
	
	public Mango(String color,float weight) {
		super("Mango",color,weight);
	}
	
	@Override
	public String taste() {
		return "Mango is sweet";
	}
	
	public void pulp() {
		System.out.println("Mango has pulp");
	}

}
