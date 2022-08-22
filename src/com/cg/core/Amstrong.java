package com.cg.core;

public class Amstrong {

	public static void main(String[] args) {
		int num=370,number,temp,total=0;
		
		number=num;
		while(number !=0) {
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
