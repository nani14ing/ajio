package com.ajio.practiceTest;

public class NumberPolindromeTest {

	public static void main(String[] args) {
		
		int num=121;
		int rev=0;
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
		if(num==rev) {
			System.out.println("num is polindrome");
		}
		else {
			System.out.println("num is not polindrome");
		}
	}
}
