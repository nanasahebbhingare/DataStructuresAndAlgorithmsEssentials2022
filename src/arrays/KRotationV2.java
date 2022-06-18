package arrays;

/**
 * KRotation - V2
 *
 * @author Bhingare Nana.
 * @since 13/04/2022
 * @version 1
 */
public class KRotationV2 {
	public static void main(String[] args) {
		int inputArray[] = { 1, 2, 3, 7, 9 };
		int k = 4;
		int output[] = kRotation(inputArray, k);
		for (int i = 0; i < output.length; i++) {
			System.out.print(" " + output[i] + " ");
		}
	}

	private static int[] kRotation(int[] inputArray, int k) {
		int length = inputArray.length;
		int temp = 0;
		int i = 0;
		while (k > 0) {
			temp = inputArray[length - 1];
			for (i = length - 1; i > 0; --i) {
				inputArray[i] = inputArray[i - 1];
			}
			inputArray[i] = temp;
			--k;
		}
		return inputArray;
	}
}
