package com.ajio.practiceTest;

public class FirstMaxTest {

	public static void main(String[] args) {
		int[] arr= {5,50,25,90,80,215,150};
	 
		int big=arr[0];
		int small=arr[0];
		
		for(int i=0; i<arr.length;i++) {
			    if(arr[i]>big) {
		          big=arr[i];
			}	
			    else {
			    	
			    }
			    if(arr[i]<small) {
			    	small=arr[i];  
			    }
			    

		}
		System.out.println(big);
		System.out.println(small);
	
	}
}

