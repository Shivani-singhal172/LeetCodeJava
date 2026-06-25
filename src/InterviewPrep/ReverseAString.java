package InterviewPrep;

public class ReverseAString {
	
	public static void main(String [] args) {
		String s = "Shivani";
		reversestring(s);
	}
	
	public static void reversestring(String s) {
		
		for(int i =s.length()-1 ; i>=0;i--) {
			System.out.print(s.charAt(i));
			System.out.print("*");
		}
	}

}
