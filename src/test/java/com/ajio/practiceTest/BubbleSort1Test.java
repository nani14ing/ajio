package com.ajio.practiceTest;

public class BubbleSort1Test {

	public static void main(String[] args) {
		
		int[] arr= {15,8,58,90,75,350,195};
		for(int j=0; j<arr.length; j++)
		{
		   for(int i=1; i<arr.length-j;i++)
		   {
			if(arr[i-1]>arr[i]) {
				int temp= arr[i-1];
				arr[i-1]=arr[i];
				arr[i]=temp;
			}
		}
	}
	for(int data:arr) {
		System.out.print(data+ " ");
	}
  }
}