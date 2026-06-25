package InterviewPrep;

import java.util.Arrays;

public class largestValueInArray {
	
	public static void main(String [] args) {
		int[]  ar = {10,20,5,17,45,12};
		largestValueInArray(ar);
	}
	
	public static void largestValueInArray(int[] a) {
		
		Arrays.sort(a);
		System.out.println("The largest value is "+a[a.length-1]);
//		for(int i = 0;i<a.length-1;i++) {
//			System.out.println("The value of a[i]"+a[i] +" and a[i+1] " +a[i+1]);
//			//sorting array
//			if(a[i]>a[i+1]) {
//				
//				
//				int b=a[i];
//				a[i]=a[i+1];
//				a[i+1]=b;
//			}
//			System.out.println(a[i]);
//		}
//		
//		//Sorted array
		
	}

}
