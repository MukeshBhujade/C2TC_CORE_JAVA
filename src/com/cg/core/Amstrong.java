package com.cg.core;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {
		int number,temp,total=0;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the value on Number:");
	int num=obj.nextInt();
	
		number=num;
		while(number!=0) {
			temp=number%10;
		total=total+temp;
		number/=10;
	}
if(total==num)
	System.out.println(num  +  "........is an Armstrong number");
else
	System.out.println(num +    ".......is not an Armstrong number");
		
		
		// TODO Auto-generated method stub

	}

}
