package com.cg.core;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) { 
		Scanner obj=new Scanner(System.in);
		int i;
		int fact=1;
		System.out.println("Enter the Value of number:");
		int number=obj.nextInt();
		for(i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+number+"is:"+fact);
		// TODO Auto-generated method stub

	}

}
