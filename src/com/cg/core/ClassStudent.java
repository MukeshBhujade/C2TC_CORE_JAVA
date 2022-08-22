package com.cg.core;

public class ClassStudent { 
	private int rollno;
	private String name;
	private float per;
	public void initStudent() {
		rollno=05;
        name="mukesh";
		 per=80;
	}
	public void printDetails() {
		System.out.println("rollno: "+rollno);
		System.out.println("Name of Student: "+name);
		System.out.println("Percentage:"+per);
	}

	public static void main(String[]args) {
		ClassStudent s1= new ClassStudent();
		s1.initStudent();
		s1.printDetails();
	}

}
