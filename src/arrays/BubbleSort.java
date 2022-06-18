package arrays;

/**
 * Bubble Sort
 *
 * @author Bhingare Nana.
 * @since 13/04/2022
 * @version 1
 */
public class BubbleSort {
	public static void main(String[] args) {
		int inputArray[] = { 3, 4, 5, 1, 2 };
		int length = inputArray.length;
		int output[] = bubbleSort(inputArray, length);
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}

	private static int[] bubbleSort(int[] inputArray, int length) {
		for (int i = 0; i <= length - 2; i++) {
			for (int j = 0; j < (length - 1) - i; j++) {
				if (inputArray[j] > inputArray[j + 1]) {
					int temp = inputArray[j];
					inputArray[j] = inputArray[j + 1];
					inputArray[j + 1] = temp;
				}
			}
		}
		return inputArray;
	}
}
