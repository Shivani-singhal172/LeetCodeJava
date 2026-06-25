package InterviewPrep;

import java.util.Arrays;

public class largestValueInArray {

	public static void main(String [] args) {
		int[]  ar = {10,20,5,17,45,12};
		largestValueInArrayUsingInBuiltMethods(ar);
		findLargest(ar);
	}

	public static int largestValueInArrayUsingInBuiltMethods(int[] a) {

		Arrays.sort(a);
		System.out.println("The largest value is "+a[a.length-1]);
		return a[a.length-1];
	}
	
	
	public static int[] SortArray(int [] a) {
		//Binary sorting
		
		for(int i = 0;i<a.length-1;i++) {
			
			for(int j = 0; j < a.length-i-1;j++) {
				
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		//sorted array is 
		return a;
	}
	
	public static int findLargest(int [] a) {
		SortArray(a);
		System.out.println("The largest value is "+a[a.length-1]);
		return a[a.length-1];
	}

}
