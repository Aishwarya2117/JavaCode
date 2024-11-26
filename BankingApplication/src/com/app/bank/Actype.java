package com.app.bank;

public enum Actype {
	SAVING(10000),DMAT(40000),CURRENT(5000),FD(50000),LOAN(25000),NRE(15000);

	//state
	private double minBalance;
	
	//ctor
	Actype(double minBalance) {
		this.minBalance=minBalance;
		// TODO Auto-generated constructor stub
	}
@Override
 public String toString()
 {
	 return name()+":"+minBalance;
 }

//method
public double getMinBalance() {
	return minBalance;
	
}
}
