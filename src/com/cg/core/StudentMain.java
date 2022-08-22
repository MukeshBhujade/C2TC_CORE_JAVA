package com.cg.core;

public class StudentMain {
//	public void Student() { 
		private int rollno;
		private String name;
		private float per;
	//}
		public void initStudent() {
			rollno=05;
	        name="mukesh";
			 per=80;
		}
		public void printDetails() {
			System.out.print(rollno+"Name of Student"+name+"Percentage"+per);
		}
		
		
	
public static void main (String[]args) {
 StudentMain s1= new StudentMain();
// s1.initStudent();
 s1.printDetails();
	
	
}
}
