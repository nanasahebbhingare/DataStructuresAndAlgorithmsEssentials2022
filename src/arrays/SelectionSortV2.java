package arrays;

/**
 * Selection Sort - V2
 *
 * @author Bhingare Nana.
 * @since 14/04/2022
 * @version 1
 */
public class SelectionSortV2 {

	public static void main(String[] args) {
		int inputArray[] = { 3, 4, 5, 1, 2 };
		int length = inputArray.length;
		int output[] = selectionSort(inputArray, length);
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}

	private static int[] selectionSort(int[] inputArray, int length) {
		for (int i = 0; i < length; i++) {
			for (int j = i; j < length; j++) {
				if (inputArray[i] > inputArray[j]) {
					int temp = inputArray[i];
					inputArray[i] = inputArray[j];
					inputArray[j] = temp;
				}
			}
		}
		return inputArray;
	}
}
