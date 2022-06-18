package arrays;

/**
 * KRotation - V1
 *
 * @author Bhingare Nana.
 * @since 06/04/2022
 * @version 1
 */
public class KRotation {
	public static void main(String[] args) {
		int inputArray[] = { 1, 3, 5, 7, 9 };
		int k = 4;
		int output[] = kRotation(inputArray, k);
		for (int i = 0; i < output.length; i++) {
			System.out.print(" " + output[i]);
		}
	}

	private static int[] kRotation(int[] inputArray, int k) {
		int arrayLength = inputArray.length;
		k = k % arrayLength;

		reverseArray(inputArray, 0, arrayLength - k - 1);
		reverseArray(inputArray, arrayLength - k, arrayLength - 1);
		reverseArray(inputArray, 0, arrayLength - 1);
		return inputArray;
	}

	private static void reverseArray(int[] inputArray, int start, int last) {
		while (start < last) {
			int temp = inputArray[start];
			inputArray[start] = inputArray[last];
			inputArray[last] = temp;
			start++;
			last--;
		}
	}
}
