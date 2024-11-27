package com.app.bank;

import java.time.LocalDate;

public class BankAccount {
	 
	private int accNo;
	 private String fName;
	 private String lName;
	 private Actype acType;
	 private LocalDate dob;
	 private LocalDate creationDate;
	 private double balance;
	 
	 
	@Override
	public String toString() {
		return "BankAccount [accNo=" + accNo + ", fName=" + fName + ", lName=" + lName + ", acType=" + acType + ", dob="
				+ dob + ", creationDate=" + creationDate + ", balance=" + balance + "]";
	}
	
	
	public BankAccount(int accNo, String fName, String lName, Actype acType, LocalDate dob, LocalDate creationDate,
			double balance) {
		super();
		this.accNo = accNo;
		this.fName = fName;
		this.lName = lName;
		this.acType = acType;
		this.dob = dob;
		this.creationDate = creationDate;
		this.balance = balance;
	}
	public BankAccount(int accNo)
	{
		this.accNo=accNo;
	}
	
	
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public Actype getAcType() {
		return acType;
	}
	public void setAcType(Actype acType) {
		this.acType = acType;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	 
	 	 public boolean equals(Object o) {
		 System.out.println("In acco{unts equals");
		 
		 if(o instanceof BankAccount) {
			 return this.accNo==((BankAccount)o).accNo;
		 }
		return false;
		 
	 }
	 
	 public  double deposite(double amount){
		  this.balance +=amount;
		  return balance;
		 
	 }
	 
	 public double withDrwa(double amount)throws BankingException{
		 
		 validateBalance(this.acType,balance-amount);
		 
			this.balance-=amount;
			return balance;
			
     }

	 public void transferFunds(BankAccount dest,double amount) throws BankingException{
		 
		 this.withDrwa(amount);
		 dest.deposite(amount);
	 }
	 

}
