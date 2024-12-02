package com.app.tester;

import com.app.core.Faculty;
import com.app.core.Person;
import com.app.core.Student;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p=new Person("Aishwarya","Mhetre");
		System.out.println(p);
		
		p=new Student("Aish","Mhetre",1,"python",2024,50,5000);
		System.out.println(p);
		p=new Faculty("Sona","Shah","java",2);
		System.out.println(p);
	}

}
