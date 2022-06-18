package arrays;

/**
 * Insertion Sort
 *
 * @author Bhingare Nana.
 * @since 14/04/2022
 * @version 1
 */
public class InsertionSort {
	public static void main(String[] args) {
		int inputArray[] = { 3, 4, 5, 1, 2 };
		int length = inputArray.length;
		int output[] = insertionSort(inputArray, length);
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}

	private static int[] insertionSort(int[] inputArray, int length) {
		for (int i = 1; i < length; i++) {
			int current = inputArray[i];
			int prev = i - 1;
			while (prev >= 0 && inputArray[prev] > current) {
				inputArray[prev + 1] = inputArray[prev];
				--prev;
			}
			inputArray[prev + 1] = current;
		}
		return inputArray;
	}
}
