package com.app.tester;

import java.util.Scanner;

import com.app.core.Faculty;
import com.app.core.Person;
import com.app.core.Student;

public class EventOrganization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
      boolean exit=false;
      int count=0;
      System.out.println("Enter No.of paricipant in event");
      Person []participants=new Person[sc.nextInt()];
     
      while(!exit) {
    	  System.out.println("1.Register student of event\n2.Faculty Registration\n3.Display all\n4.Display by index no.\n5.exit");
          
    	  System.out.println("Enter ur choice");
    	  switch(sc.nextInt()) {
    	  case 1:
    		  System.out.println("Registaring student");
    		 
    			  
        		  if(count <participants.length) {
        			  System.out.println("Enter student detail:name,surname,id,course,graduateYr,marks,fees");
    			  participants[count++]=new Student(sc.next(),sc.next(),sc.nextInt(),sc.next(),sc.nextInt(),sc.nextFloat(),sc.nextFloat());
    		  }
        		  else 
        			  System.out.println("Event is full");
        		  
    		  
    	  
    		  break;
    	  case 2: System.out.println("Registering faculty");
    	       
    	        if(count<participants.length) {
    	        	 System.out.println("enter faculty details:Fname,Lname,sub,expYr");
    	        	participants[count++]=new Faculty(sc.next(), sc.next(),sc.next(),sc.nextInt());
    	        	
    	        }
    	        else
    	        	System.out.println("Event is full");
      break;
    	  case 3: System.out.println("Displaying all");
    	         for(Person p:participants) {
    	        	 if(p!=null)
    	        		 System.out.println(p);
    	         }
    	         break;
    	  case 4:System.out.println("Displying by index number");
    	         System.out.println("Enter seat No.");
    	         int index=sc.nextInt()-1;
    	         if(index >=0 && index< count) {
    	        	 System.out.println(participants[index]);
    	         }
    	         else
    	        	 System.out.println("Invalid seat number");
    	  break;
    	  case 5: exit=true;
    	  System.out.println("Exiting code!!!");
    	  
    	  break;
   
		
	}

}}}
