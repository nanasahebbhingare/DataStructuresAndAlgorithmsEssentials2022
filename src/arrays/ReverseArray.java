package arrays;

/**
 * Reverse Array
 *
 * @author Bhingare Nana.
 * @since 06/04/2022
 * @version 1
 */
public class ReverseArray {
	public static void main(String[] args) {
		int inputArray[] = { 1, 2, 3, 4, 5, 6 };
		int n = inputArray.length;
		// Print input array in reverse order
		// printReverseArray(inputArray, n);
		// reverse element an array in same array.
		int outputArray[] = reverseElementInSameArray(inputArray, n);
		for (int i = 0; i < outputArray.length; i++) {
			if (i >= n - 1) {
				System.out.print(outputArray[i]);
			} else {
				System.out.print(outputArray[i] + "-->");
			}
			;
		}
	}

	private static int[] reverseElementInSameArray(int[] inputArray, int n) {
		int start = 0;
		int end = n - 1;
		while (start < end) {
			int temp = inputArray[start];
			inputArray[start] = inputArray[end];
			inputArray[end] = temp;
			++start;
			--end;
		}
		return inputArray;
	}

	private static void printReverseArray(int[] inputArray, int n) {
		for (int i = n - 1; i >= 0; --i) {
			if (i <= 0) {
				System.out.print(inputArray[i]);
			} else {
				System.out.print(inputArray[i] + "-->");
			}
		}
	}
}
