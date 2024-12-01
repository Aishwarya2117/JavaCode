package com.app;

import java.util.Arrays;

public class primitiveAndReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int x=10;
	int y=x;
	System.out.println("Before changing values x is "+ x +" and value of y is "+y);
    y=40;
    System.out.println("After changing values x is "+ x +" and value of y is "+y);
    int []a= {10,20,30,40,20};
    int []d=a;
    System.out.println("Before changing values a is "+ Arrays.toString(a) +" and value of y is "+Arrays.toString(d));
    d[1]=1000;
    System.out.println("After changing values a is "+ Arrays.toString(a) +" and value of y is "+Arrays.toString(d));
    
			
		
		

	}

}
