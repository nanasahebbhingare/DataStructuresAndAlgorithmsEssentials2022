package arrays;

import java.util.Arrays;

/**
 * Count Sort - V2
 *
 * @author Bhingare Nana.
 * @since 15/04/2022
 * @version 1
 */
public class CountSortV2 {
	public static void main(String[] args) {
		int inputArray[] = { 1, 4, 5, 1, 2 };
		int length = inputArray.length;
		int output[] = countSort(inputArray, length);
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}

	private static int[] countSort(int[] inputArray, int length) {
		int maxElement = 0;
		for (int i = 0; i < length; i++) {
			maxElement = Math.max(maxElement, inputArray[i]);
		}
		int count[] = new int[maxElement + 1];
		Arrays.fill(count, 0);
		for (int j = 0; j < count.length - 1; j++) {
			count[inputArray[j]]++;
		}
		for (int k = 1; k <= maxElement; k++) {
			count[k] = count[k] + count[k - 1];
		}
		int sortArray[] = new int[maxElement];
		for (int i = 0; i < length; i++) {
			sortArray[count[inputArray[i]] - 1] = inputArray[i];
			count[inputArray[i]]--;
		}
		for (int j = 0; j < length; j++) {
			inputArray[j] = sortArray[j];
		}
		return inputArray;
	}

}
