package recursion.subset;

public class RemoveOccuranceCharacterInStringUsingRecursion {
	public static void main(String[] args) {
		String str = "abccab";
		//char ch = 'a';
		String removeStr = "cc";
		System.out.println("After String :- " + str);
		//String outPut = removeOccuranceCharacterInString(str, ch);
		String outPut = removeOccuranceStringInString(str, removeStr);
		System.out.println("Before String :- " + outPut);
	}

	private static String removeOccuranceCharacterInString(String str, char ch) {
		StringBuilder builder=new StringBuilder(str);
		if(!builder.toString().contains(String.valueOf(ch)))
			return str;
		String inputStr = builder.deleteCharAt(builder.toString().indexOf(ch)).toString();
		return removeOccuranceCharacterInString(inputStr, ch);
	}
	
	
	private static String removeOccuranceStringInString(String str, String removeStr) {
		StringBuilder builder=new StringBuilder(str);
		if(!builder.toString().contains(removeStr))
			return str;
		String inputStr = builder.toString().replaceAll(removeStr,"").trim();
		return removeOccuranceStringInString(inputStr, removeStr);
	}
}
