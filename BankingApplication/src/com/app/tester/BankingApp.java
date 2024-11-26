package com.app.tester;

import java.util.Scanner;

import com.app.bank.BankAccount;
import static com.app.utils.BankingValidation.*;

public class BankingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try(Scanner sc=new Scanner(System.in)){
        	
        	boolean exit=false;
        	System.out.println("Enter total number of accounts");
        	
        	BankAccount[] account=new BankAccount[sc.nextInt()];
        	int cnt=0;
        	while(!exit) {
        	System.out.println("Options:\n1.create a new account\n2.Diaplay all accounts\n3.exit");
        	System.out.println("choose an option");
        	try {
        	switch(sc.nextInt()) {
        	case 1:
        		if(cnt<account.length) {
        		System.out.println("Enter Account details: AccNo,firstName,lastName,acctype,dob,creationDate,balance");
        	  BankAccount acc=validateInputs(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),account);
        	 account[cnt++]=acc;
        	 System.out.println("A/C is created!!");
        	}
        		else
        			System.out.println("Bank capacity is full!!");
        		
        	
        	break;
        	case 2:
        		    
        		System.out.println("All accounts details");
        	  
        	for(BankAccount a:account) {
        		if(a!=null) {
        			System.out.println(a);
        		}
        	}
        		
        		break;
        	
        	
        	case 3:exit=true;
        	break;
        	
        		
        	   
        		
        	
        	}}
        	catch(Exception e ) {
        		System.out.println(e);
        		//read all the pending tokens from the Scanner's buffer till new line 
        		sc.nextLine();

        	}
        			
        	}
        }
	}

}
