package com.ajio.practiceTest;

public class PrimeNumber {

	public static void main(String[] args) {
	
		int a=13;
		boolean flag=false;
		for(int i=2; i<a; i++) {
			if(a%i==0) {
				flag=true;
				break;
			}
		}
          if(flag!=true) {
        	  System.out.println("given number is prime");
          }
          else {
        	  System.out.println("given number is not prime");
          }
	}

}
