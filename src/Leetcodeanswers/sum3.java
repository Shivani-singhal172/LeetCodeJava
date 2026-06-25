package Leetcodeanswers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class sum3 {

	public static void main(String [] args) {
		int[] values = {0,0,0,0};
		List<List<Integer>> value = threeSum(values);
		System.out.println(value);
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		//-1,0,1,2,-1,-4
		List<List<Integer>> result = new ArrayList<>();

		int sum= -1;
		for (int m = 0;m<nums.length-2;m++){
			for(int n = 1;n<nums.length-1;n++) {
           System.out.println("The value of m is"+m);
				sum = nums[m]+nums[n]+nums[n+1];
				System.out.println("the values of integers is "+nums[m] +" , "+nums[n]+" , "+nums[n+1]);
				if (sum==0){
					List<Integer> temp = Arrays.asList(nums[m], nums[n],nums[n+1]);

					if(!result.contains(temp)) {
					    result.add(temp);
					}
					
				}
			}
		}
		
		return result;
	}
}
