package com.app;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		        Scanner in = new Scanner(System.in);
		        while(in.hasNext()){
		            String IP = in.next();
		            System.out.println(IP.matches(new MyRegex().pattern));
		        }

		    
		
	}

}
class MyRegex
{
  static final String pattern="^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
}
