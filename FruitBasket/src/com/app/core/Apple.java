package com.app.core;

public class Apple extends Fruit {

	public Apple(String color, float weight) {
		super("Apple", color, weight);
		}
	
	@Override
	public String taste() {
		return "Apple is sweet and sour";
	}
	public void jam() {
		System.out.println("Apple has jam!!!");
	}
	

}
