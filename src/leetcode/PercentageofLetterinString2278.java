package leetcode;

public class PercentageofLetterinString2278 {
	public static void main(String[] args) {
		String s = "sgawtb";
		char letter = 's';
		 int charInt[] = new int[26];
	        for(int i=0;i<s.length();i++)
	        {
	            charInt[s.charAt(i)-97]++; 
	        }
	         
	       double letterCnt = (double)charInt[letter-97];
	       double lengthDouble = (double)s.length();
	        
	       System.out.println((int)Math.floor((letterCnt/lengthDouble)*100));
	}
}
