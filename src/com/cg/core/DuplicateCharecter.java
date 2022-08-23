package com.cg.core;

public class DuplicateCharecter {

	public static void main(String[] args) {
		String str="beutiful beach";
		char[]carray=str.toCharArray();
		System.out.println("The string is:"+str);
		System.out.println("Duplicate in above string are:");
		for(int i=0; i<str.length();i++ ) {
			for (int j=i+1;j<str.length();j++) {
			if (carray[i]==carray[j]) {
				System.out.println(carray[j]+" ");
					break;
				}
				
			}
		}
		// TODO Auto-generated method stub

	}

}
