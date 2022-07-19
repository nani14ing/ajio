package com.ajio.practiceTest;

public class FibonacciSeriesTest {

	public static void main(String[] args) {
		
		int f1=0;
		int f2=1;
		int f3;
		System.out.print(f1+ " " + f2+ " ");
		for(int i=0;; i++) {
			f3=f2+f1;
			if(f3>100) {
				break;
			}
			System.out.print(f3+ " ");
			f1=f2;
			f2=f3;
		}

	}

}
