package com.cg.core;

import java.util.Scanner;

public class RectangleArea {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the Lenth of Area=");
		double lenth=obj.nextDouble();
		System.out.println("Enter the width of Area=");
		double width=obj.nextDouble();
		double area=lenth*width;
		System.out.println("Area of Rectangle="+area);
		// TODO Auto-generated method stub

	}

}
