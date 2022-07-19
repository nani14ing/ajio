package com.ajio.practiceTest;

public class numberPolindrome3Test {

	public static void main(String[] args) {
		for(int i=0;i<100;i++) {
			int rev=rev(i);
			if(rev==i) {
				System.out.println(i +" is polindrome");
			}
		}

	}

	public static int rev(int s) {
		int rev=0;
		while(s!=0){
			int rem=s%10;
			rev=rev*10+rem;
			s=s/10;
		}
		return rev;
	}
}
