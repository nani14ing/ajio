package com.ajio.practiceTest;

public class StringPolindrome2Test {

	public static void main(String[] args) {
		
		String s="level";
		String rev=rev(s);
		String status=(s.equals(rev))?"polindrome":"not a polindrome";
		System.out.println(status);
	}
	
	public static String rev(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		return rev;
	

	}

}
