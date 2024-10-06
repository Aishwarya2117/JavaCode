package com.app;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       String A=sc.next();
       String B=sc.next();
       boolean ret=isAnagram(A,B);
       System.out.println(ret?"Anagram":"Not Anagram");
       
	}

	private static boolean isAnagram(String a, String b) {
		// TODO Auto-generated method stub
		  a=a.toLowerCase();
		  b=b.toLowerCase();
		   boolean f = false;
		  char[] c = a.toCharArray();
		  Arrays.sort(c);
		  char[] d = b.toCharArray();
		  Arrays.sort(d);
		  String one = new String (c);
	      String two= new String (d);
	      if (one.equals(two)) {
	    	  f=true;
	      }
	      return f;
	   

	}

}
