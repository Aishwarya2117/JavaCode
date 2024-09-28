package com.app;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two strings");
        String A=sc.next().toLowerCase();
        String B=sc.next().toLowerCase();
        /* Enter your code here. Print output to STDOUT. */
        int lengthA=A.length();
        int lengthB=B.length();
        int result=lengthA+lengthB;
        System.out.println(result);
        
        if(A.compareTo(B)>0)
        System.out.println("Yes");
        else
        System.out.println("No");
        A=(A.substring(0,1).toUpperCase()+A.substring(1));
        B=(B.substring(0,1).toUpperCase()+B.substring(1));
        System.out.println(A+" "+B);
        
    }

	}


