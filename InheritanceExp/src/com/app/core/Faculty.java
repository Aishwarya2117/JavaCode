package com.app.core;

public class Faculty extends Person {
	private String sub;
	private int expYr;
	
	public Faculty(String Fname,String Lname,String sub,int expYr) {
		super(Fname,Lname);
		this.sub=sub;
		this.expYr=expYr;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public int getExpYr() {
		return expYr;
	}

	public void setExpYr(int expYr) {
		this.expYr = expYr;
	}

	@Override
	public String toString() {
		return "Faculty:"+super.toString()+","+"sub=" + sub + ", expYr=" + expYr ;
	}
	

}
