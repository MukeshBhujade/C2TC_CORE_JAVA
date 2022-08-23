package com.cg.core;

import java.util.Scanner;

public class PalindromeProgram {

	public static void main(String[] args) {
		int r,sum=0,temp;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=obj.nextInt();
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(temp==sum)
			System.out.println("palindrome number");
		else
			System.out.println("not palindrome");
		// TODO Auto-generated method stub

	}

}
