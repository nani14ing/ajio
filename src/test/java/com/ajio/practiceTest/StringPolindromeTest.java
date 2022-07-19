package com.ajio.practiceTest;

public class StringPolindromeTest {

	public static void main(String[] args) {
		
		String s="level";
		String rev=rev(s);
		if(s.equals(rev)) {
			System.out.println("given string is polindrome");
		}
		else {
			System.out.println("given string is not a polindrome");
		}
	}
	
	public static String rev(String s) {
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		return rev;
	}

}
