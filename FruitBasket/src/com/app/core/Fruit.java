package com.app.core;

public class Fruit {
	
	private String Name;
	private String color;
	private float weight;
	
	
	public Fruit(String name, String color, float weight) {
		super();
		Name = name;
		this.color = color;
		this.weight = weight;
	}
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "Fruit [Name=" + Name + ", color=" + color + ", weight=" + weight + "]";
	}
	
	
	public String taste() {
		System.out.println("No specific taste");
		return Name;
		
	}
	

}
