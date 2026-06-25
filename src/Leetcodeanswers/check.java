package Leetcodeanswers;

public class check {
	public static void main(String[] args ) {
		
		System.out.println("hello");
		reverseString("shivani");
	}
	
	public static void reverseString(String s) {
		String reverse= "";
		char [] ch = s.toCharArray();
		for(int i = s.length()-1;i>=0;i--) {
			reverse = reverse+ch[i]; 
			
		}
		System.out.println(reverse);
	}

}
