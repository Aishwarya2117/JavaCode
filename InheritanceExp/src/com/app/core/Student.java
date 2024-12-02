package com.app.core;

public class Student extends Person{
	
 
private int sId;
  private String course;
  private int graduateYr;
  private float marks;
  private float fees;
  
  
  public Student(String fName, String lName, int sId, String course, int graduateYr, float marks, float fees) {
		super(fName, lName);
		this.sId = sId;
		this.course = course;
		this.graduateYr = graduateYr;
		this.marks = marks;
		this.fees = fees;
	}


public int getsId() {
	return sId;
}


public void setsId(int sId) {
	this.sId = sId;
}


public String getCourse() {
	return course;
}


public void setCourse(String course) {
	this.course = course;
}


public int getGraduateYr() {
	return graduateYr;
}


public void setGraduateYr(int graduateYr) {
	this.graduateYr = graduateYr;
}


public float getMarks() {
	return marks;
}


public void setMarks(float marks) {
	this.marks = marks;
}


public float getFees() {
	return fees;
}


public void setFees(float fees) {
	this.fees = fees;
}


@Override
public String toString() {
	return "Student:"+super.toString()+","+"sId=" + sId + ", course=" + course + ", graduateYr=" + graduateYr + ", marks=" + marks + ", fees="
			+ fees ;
}
  
	    


}
