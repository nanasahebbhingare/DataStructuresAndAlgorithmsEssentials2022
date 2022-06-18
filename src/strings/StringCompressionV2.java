package strings;

import java.util.Objects;

/**
 * String Compression V2
 *
 * @author Bhingare Nana.
 * @since 23/04/2022
 * @version 1
 */
public class StringCompressionV2 {
	public static void main(String[] args) {
		 String inputArray[] = { "a", "a", "b", "b", "c", "c" };
		//String inputArray[] = { "a", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b", "b" };
		int stringCompressionCnt = stringCompression(inputArray);
		System.out.println("String Compression Cnt :- " + stringCompressionCnt);
	}

	private static int stringCompression(String[] inputArray) {
		int outputArray[] = new int[128];
		String[] finalOutPutArray = new String[outputArray.length];
		int indexCnt = 0;
		for (int i = 0; i < inputArray.length; i++) {
			int asciiValue = inputArray[i].charAt(0);
			outputArray[asciiValue]++;
		}
		for (int i = 0; i < outputArray.length; i++) {
			if (outputArray[i] != 0) {
				char ch = (char) i;
				finalOutPutArray[indexCnt] = String.valueOf(ch);
				if (outputArray[i] > 1) {
					if (outputArray[i] < 10) {
						++indexCnt;
						finalOutPutArray[indexCnt] = String.valueOf(outputArray[i]);
					} else {
						greaterValue(finalOutPutArray, outputArray[i], indexCnt);
					}
				}
				++indexCnt;
			}
		}
		String finalStr = "";
		int finalCnt = 0;
		for (int j = 0; j < finalOutPutArray.length; j++) {
			if (Objects.nonNull(finalOutPutArray[j])) {
				finalStr += finalOutPutArray[j];
				++finalCnt;
			}
		}
		System.out.println(finalStr);
		return finalCnt;
	}

	private static void greaterValue(String[] finalOutPutArray, int charCnt, int indexCnt) {
		int rem = 0;
		while (charCnt >= 10) {
			rem = charCnt % 10;
			charCnt = charCnt / 10;
			++indexCnt;
			finalOutPutArray[indexCnt] = String.valueOf(charCnt);
		}
		++indexCnt;
		finalOutPutArray[indexCnt] = String.valueOf(rem);
	}

}