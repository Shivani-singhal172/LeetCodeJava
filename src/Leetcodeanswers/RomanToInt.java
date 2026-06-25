package Leetcodeanswers;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

	
	public static void main(String [] args) {
		System.out.println(romanToInt("MCMXCIV"));
	}
	
	public static int romanToInt(String s) {
		
		int sum=0;
		Map map = new HashMap();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		for(int i = 0; i<s.length();i++) {
			char c = s.charAt(i);
			System.out.println("The char value is "+c);
			if(map.containsKey(c)) {
				int value = (int) map.get(c);
				 System.out.println("The map returned value is"+value);
				sum = sum + value;
				System.out.println("The sum returned is"+sum);
			}
		}
		
		return sum;
	}
}
