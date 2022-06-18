package arrays;

/**
 * Insertion Sort V2
 *
 * @author Bhingare Nana.
 * @since 14/04/2022
 * @version 1
 */
public class InsertionSortV2 {
	public static void main(String[] args) {
		int inputArray[] = { 3, 4, 5, 1, 2 };
		int length = inputArray.length;
		int output[] = insertionSort(inputArray, length);
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}

	private static int[] insertionSort(int[] inputArray, int length) {
		int i = 0, j = 0;
		for (i = 1; i < length; i++) {
			int temp = inputArray[i];
			for (j = i - 1; j >= 0; --j) {
				if (inputArray[j] > temp) {
					inputArray[j + 1] = inputArray[j];
				} else {
					break;
				}
			}
			inputArray[j + 1] = temp;
		}
		return inputArray;
	}
}