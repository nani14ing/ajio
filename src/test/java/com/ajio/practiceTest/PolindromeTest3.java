package com.ajio.practiceTest;

public class PolindromeTest3 {

	public static void main(String[] args) {
		String s="I know malayalam language";
		String[] arr=s.split(" ");
		
		
		for(int i=0; i<arr.length; i++) {
			String rev=rev(arr[i]);
			if(rev.equals(arr[i])) {
				System.out.println(arr[i]+ " is a polindrome");
			}
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
