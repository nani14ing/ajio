package com.ajio.practiceTest;

public class PrimeNumberInBetweenTest {

	public static void main(String[] args) {
		for(int i=0; i<100;i++) {
			boolean status=isPrime(i);
			if(status!=true) {
				System.out.println(i+ " is prime");
			}
			
		}

	}
	public static boolean isPrime(int a) {
		boolean flag=false;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				flag=true;
				break;
			}
		}
		return flag;
	}

}
