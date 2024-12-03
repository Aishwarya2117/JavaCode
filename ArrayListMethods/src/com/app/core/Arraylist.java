package com.app.core;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("-----Methods of ArrayList-----");
		ArrayList a=new ArrayList();
		System.out.println("Add method of arryalist");
		a.add(10);
		a.add(20);
		// can add duplicate in arraylist
		a.add(20);
		a.add(30);
		System.out.println(a);
		
		//add at index
		a.add(4,40);
		//a.add(10, 50);  get IndexOutOfBoundException
		a.add(5,50);
		System.out.println(a);
		//size of arraylist
	  System.out.println("Size of arraylist:"+a.size());
		ArrayList b=new ArrayList();
		System.out.println("Adding collection");
		b.addAll(a);
		System.out.println(b);
		System.out.println("Size of Arraylist b:"+b.size());
		//checks whethere element is present in list or not --true if present else false
		System.out.println("Checking  whethere ele is present in list :"+a.contains(10));
		//getting/retriving element from index
		System.out.println("Getting element from index :"+a.get(0));
		System.out.println(a.contains(b));//give false bcoz it take object as ip
		//indexOf mathod returns the first occurance index of particular value ,return -1 if element not found
		System.out.println("Index of first occurance of given value is :"+a.indexOf(50));//it returns the index of first occuranace of element
		System.out.println(a.indexOf(100)); // -1 bcoz element not present in list
		System.out.println("To get last index of element"+a.lastIndexOf(20));//return last occurance index number of element
	    System.out.println("Before setiing value at position:"+a);
		//set(index,value) is used to replace value at particular index
	    a.set(4, 60);
		 System.out.println("After setiing value at position:"+a);
		 //remove(index) if used to remove element from that index number
		 System.out.println("Before removing element from particular index:"+a);
		 System.out.println("Removing element from particular index number:"+a.remove(1));
		 System.out.println("After removing element from particular index:"+a);
		
	
	}

}
