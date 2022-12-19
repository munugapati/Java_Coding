package com.example.demo;

public class SecondLargestDemo {

	public static void main(String[] args) {
		int[] a = {6,8,2,4,3,1,5,7,9}; 
		
		//int largest = Integer.MIN_VALUE;
		//int second_largest = Integer.MIN_VALUE;
		
		int smallest = Integer.MAX_VALUE;
		int second_smallest = Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]<smallest) {
				
				//second_largest =  largest;
				//largest = a[i];
				second_smallest = smallest;
				smallest = a[i];
				
			}else if(a[i]<second_smallest && a[i] != smallest) {
				
				second_smallest = a[i];
				
			}
			
		}
		
		System.out.println("The second smallest number is: " + second_smallest);
	}

}
