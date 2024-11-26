package com.app.utils;

import java.time.LocalDate;

import com.app.bank.Actype;
import com.app.bank.BankAccount;
import com.app.customException.BankingException;

public class BankingValidation {
	
	public static BankAccount validateInputs(int acctNo, String fName, String lastName, String acType, String dob,
			String creationDate, double balance,BankAccount[] accounts)throws BankingException {
		 checkDup(acctNo, accounts);
		Actype type= validateAndParseAcType(acType);
		 LocalDate birthDate=parsedate(dob);
		 LocalDate crDate=parsedate(creationDate);
		 validateBalance(type, balance);
		return new BankAccount(acctNo, fName, lastName, type, birthDate, crDate, balance);
		
	}
	
	
	
	public static void checkDup(int acc,BankAccount[]account)throws BankingException
	{
		BankAccount ac=new BankAccount(acc);
		for(BankAccount a:account) {
		if(a !=null && a.equals(ac))
		{
			throw new BankingException("Duplicate account Number!!");
		}
		}
		
	}
	// validate Actype
	public static Actype validateAndParseAcType(String acType) {
		 return Actype.valueOf(acType.toUpperCase());
		 //valueOf checks whethere element is present in enum or not
	}
 
	//parse Date
	
	public static LocalDate parsedate(String data) {
		return LocalDate.parse(data);
	}
	//valide balance
	public static void validateBalance(Actype type,double balance)throws BankingException {
		if(balance < type.getMinBalance()) {
			throw new BankingException("Insufficient Balance!!!");
		}
		
	}
}
