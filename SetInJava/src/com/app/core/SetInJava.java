package com.app.core;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub    
		Set s=new HashSet();
		s.add(10);
		s.add(20);
		s.add(50);
		s.add(100);
		
		System.out.println(s);
		
		SortedSet<Integer>ss= new TreeSet<Integer>();
		ss.add(10);
		ss.add(10);
		ss.add(30);
		ss.add(100);
		ss.add(50);
		System.out.println(ss);
		
		s.addAll(ss);
		System.out.println("Adding set ss to s:"+s);
		System.out.println("check whethe 20 is present in set ss"+ss.contains(20));
		System.out.println("check whethe ss contains s "+ss.containsAll(s));
		System.out.println("check whethe s contains ss "+s.containsAll(ss));
		System.out.println("Before removing 10"+s);
		s.remove(10);
		System.out.println("After removing 10"+s);
		
		
		
		
	}

}
