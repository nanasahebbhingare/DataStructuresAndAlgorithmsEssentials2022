package arrays;

import java.util.Arrays;

/**
 * Count Sort
 *
 * @author Bhingare Nana.
 * @since 15/04/2022
 * @version 1
 */
public class CountSort {
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
		int sortArray[] = new int[length];
		for (int i = 0; i < count.length - 1; i++) {
			count[inputArray[i]]++;
		}
		int index = 0;
		for (int i = 0; i <= maxElement; i++) {
			while (count[i] > 0) {
				sortArray[index] = i;
				--count[i];
				++index;
			}
		}
		return sortArray;
	}
}
