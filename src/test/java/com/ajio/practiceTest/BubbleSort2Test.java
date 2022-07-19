package com.ajio.practiceTest;

public class BubbleSort2Test {

	public static void main(String[] args) {
		
		int[] arr= {15,62,25,90,45,85,245,500};
		
		for(int j=0; j<arr.length;j++) {
			for(int i=0; i<arr.length-1; i++) {
				if(arr[i]<arr[i+1]) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
		}
	for(int data:arr) {
		System.out.print(data+" ");
	}

}
}