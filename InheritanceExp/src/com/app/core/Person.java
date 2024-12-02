package com.app.core;

public class Person {
	
private String Fname;
 private String Lname;
 
 public Person(String fName,String lName) {
	 
	 this.Fname=fName;
	 this.Lname=lName;
 }

@Override
public String toString() {
	return "Person : Fname=" + Fname + ", Lname=" + Lname ;
}

public String getFname() {
	return Fname;
}

public void setFname(String fname) {
	Fname = fname;
}

public String getLname() {
	return Lname;
}

public void setLname(String lname) {
	Lname = lname;
}
 

}
