package Leetcodeanswers;

public class longestMatchingString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"clower", "clow", "coight"};

		String longestprefix = longestCommonPrefix(strs);
		System.out.println(longestprefix);

	}
	
	
	 
	
	public static String longestCommonPrefix(String[] strs) {
		// edge cases 
		if(strs.length==0|| strs==null) {
			return "";
		
		}
		// let's assume the longest prefix is first string of array 
		String prefix = strs[0];
		
		// Iterate through aray to compare longest matching string 
		for (int i = 1 ; i<strs.length;i++) {
			while (strs[i].indexOf(prefix)!=0) {
				prefix = prefix.substring(0, prefix.length()-1);
				
				if(prefix.isEmpty()) {
					return "";
				}
			}
		}

      return prefix;
    }
	


}
