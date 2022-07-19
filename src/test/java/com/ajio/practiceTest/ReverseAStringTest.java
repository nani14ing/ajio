package com.ajio.practiceTest;

public class ReverseAStringTest {

	public static void main(String[] args) {
		
		String s="Welcome to TYSS";
		String[] arr=s.split(" ");
		for(int i=0; i<arr.length; i++) { // o/p------emocleW ot SSYT 
			System.out.print(rev(arr[i]));
			System.out.print(" ");
		}
	}

 public static String rev(String s) {
	 String rev="";
	 for(int i=s.length()-1; i>=0; i--) {
		 rev=rev+s.charAt(i);
	 }
	 return rev;
 }
 }
 
