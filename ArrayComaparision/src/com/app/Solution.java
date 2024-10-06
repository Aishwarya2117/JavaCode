package com.app;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int mindiff=Integer.MAX_VALUE;
		int d;
		System.out.println("Enter array size");
		int[] A = new int[sc.nextInt()];
		System.out.println("Enter array elements");
        for(int i=0;i<A.length;i++)
        {
        	A[i]=sc.nextInt();
        }
       // System.out.println(A.toString());
        for(int i=0;i<A.length-1;i++)
        {
        	for(int j=i+1;j<A.length;j++)
        	{
        		if(A[i]>A[j])
        	    d=A[i]-A[j];
        		else
        	   d=A[j]-A[i];
        		if(d < mindiff)
        			mindiff=d;
        		
        	}
        	
        }
        System.out.println("number with lowest difference");
        for(int i=0;i<A.length-1;i++)
        {
        	for(int j=i+1;j<A.length;j++)
        	{
        		if(A[i]>A[j])
        	    d=A[i]-A[j];
        		else
        	   d=A[j]-A[i];
        		if(d==mindiff)
        			System.out.println(A[i]+","+A[j]);
        		
        	}
        	
        }
        
        
        
	}

}
