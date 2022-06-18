package strings;

/**
 * String Compression
 *
 * @author Bhingare Nana.
 * @since 23/04/2022
 * @version 1
 */
public class StringCompression {

	public static void main(String[] args) {
		// String inputArray[] = { "a", "a", "b", "b", "c", "c" };
		String inputArray[] = { "a", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b" };
		int stringCompressionCnt = stringCompression(inputArray);
		System.out.println("String Compression Cnt :- " + stringCompressionCnt);
	}

	private static int stringCompression(String[] inputLine) {
		String outputStr = new String();
		int strCnt = 1;
		for (int i = 0; i < inputLine.length; i++) {
			for (int j = i + 1; j < inputLine.length; j++) {
				if (outputStr.contains(inputLine[i]))
					break;
				if (inputLine[i] == inputLine[j])
					++strCnt;
			}
			if (!outputStr.contains(inputLine[i])) {
				if (strCnt != 1) {
					outputStr += inputLine[i] + strCnt;
				} else {
					outputStr += inputLine[i];
				}
				strCnt = 1;
			}
		}
		System.out.println(outputStr);
		return outputStr.length();
	}
}
