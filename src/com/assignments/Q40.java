package com.assignments;

import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidAccount extends Exception{
	public InvalidAccount(String str) {
		super(str);
	}
}
public class Q40  {
	
	
	public void validate(int a,int balance) throws InvalidAccount {
		if (a>balance) {
			throw new InvalidAccount("insufficient balace you need more "+(a-balance));
		}
		else 
			System.out.println("debited remaining balance is "+(balance -a));
	}
	
public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("enter the Amount");
	int balance = 2000;
	int a =scanner.nextInt();
	scanner.close();
	Q40 e1=new Q40();
	
	try {
	e1.validate(a,balance);
	} catch (InvalidAccount e) {
		
		System.out.println("exception occured");
		System.out.println(e);
		
	}
}
}
