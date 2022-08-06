package leetcode;

public class DecryptStringFromAlphabetToIntegerMapping1309 {
	public static void main(String[] args) {
		String s = "book";
		int n = (s.length() - 1) / 2;
		System.out.println(n);
		System.out.println(halvesAreAlike(s));
	}

	public static String freqAlphabets(String s) {
		String str = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = '\0';
			if (s.charAt(i) == '#') {
				String input = String.valueOf(s.charAt(i - 2)) + String.valueOf(s.charAt(i - 1));
				ch = (char) (96 + Integer.parseInt(input));
				i = i - 2;
			} else {
				ch = (char) (96 + Character.getNumericValue(s.charAt(i)));
			}
			str += ch;
		}
		String finalStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			finalStr += str.charAt(i);
		}
		return finalStr;
	}
	
	 public static boolean halvesAreAlike(String s) {
         int n = (s.length()-1)/2;
         int i = 0;
         int j = n + 1;
         int firstPartCnt = 0;
         int secondPartCnt = 0;
        String vowels="aeiouAEIOU";
        while(i<=n && j<=s.length())
        {
            if(vowels.contains(String.valueOf(s.charAt(i))))
               {
                   firstPartCnt+=1;
               }
               if(vowels.contains(String.valueOf(s.charAt(j))))
               {
                   secondPartCnt+=1;
               }
               i++;
               j++;
        }
          if(firstPartCnt==secondPartCnt)
                  {
                      return true;
                  }
         return false;
    }
    
}
