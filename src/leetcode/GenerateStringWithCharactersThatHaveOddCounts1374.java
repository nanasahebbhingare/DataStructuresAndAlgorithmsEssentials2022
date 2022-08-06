package leetcode;

public class GenerateStringWithCharactersThatHaveOddCounts1374 {
	public static void main(String[] args) {
		System.out.println(generateTheString(6));
	}

	public static String generateTheString(int n) {
        // Final string to return 
        StringBuilder myStr = new StringBuilder(n);
        
        if(n%2 == 0)
        {
            //When n is Even 
            
             // append a odd number of times 
             for(int i =0; i<n-1; i++)
             {
                 myStr.append('a'); 
             }
            //Append b once i.e odd
            myStr.append('b'); 
        }
        else
        {
            // Odd 
            for(int i =0; i<n; i++)
             {
                 myStr.append('a'); 
             }
        }
        
        return myStr.toString(); 
	}
}
