package com.assignments;

import java.util.Scanner;

public class Q39 {
	
	public void validate(int a) {
		
		if(a<18)
			throw new ArithmeticException("not valid");
		else {
			System.out.println("Welcome to vote");
		}
	}
	
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter your age");
	int a =scanner.nextInt();
	scanner.close();
	Q39 e1=new Q39();
	e1.validate(a);
}
}
