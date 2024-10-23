package com.app.core;

import java.util.ArrayList;
import java.util.Scanner;

public class BasicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
   ArrayList<Integer> list=new ArrayList<>();
   ArrayList<Integer> list2=new ArrayList<>();
   list2.add(10);
   list2.add(30);
   list2.add(40);
   list2.add(20);
   list2.add(10);
   
   
  System.out.println("Displaying list2:"+list2);
  list2.add(2,70);
  list2.add(2,80);
  
  System.out.println(list2);
     
  //adding  number with loop
   for(int i=1;i<6;i++)
   
	   list.add(i*10);
	   System.out.println(list);
	   System.out.println("Size:"+list.size());
//	   System.out.println("Enter a number to check   ");
//	   System.out.println(list.contains(sc.nextInt())?"Present":"Absent" );
	   System.out.println(list.containsAll(list2));
   
      // list2.remove(2);
list.retainAll(list2);
System.out.println(list);
list.remove(0);
System.out.println("Displaying after 0th index value removed");
       System.out.println(list);
       for(int i=0;i<list.size();i++)
       {
    	   if(list.get(i)>20)
    		   System.out.println("Replaced value:"+list.set(i,list.get(i)*2));
    		 
       }
       System.out.println(list); 
   //displaying array using for each
//   for(int i:list)
//   {
//	   System.out.println(i);
//   }
   
//  Collections.sort(list);
//  System.out.println(list);
//  
   
		
		
	}

}
