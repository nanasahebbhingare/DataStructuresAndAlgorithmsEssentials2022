package arrays;

/**
 * Selection Sort
 *
 * @author Bhingare Nana.
 * @since 14/04/2022
 * @version 1
 */
public class SelectionSort {
	public static void main(String[] args) {
		int inputArray[] = { 3, 4, 5, 1, 2 };
		int length = inputArray.length;
		int output[] = selectionSort(inputArray, length);
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}

	private static int[] selectionSort(int[] inputArray, int length) {
		for (int i = 0; i <= length - 2; i++) {
			int minPos = i;
			for (int j = i; j < length; j++) {
				if (inputArray[j] < inputArray[minPos])
					minPos = j;
			}
			swapElement(inputArray, minPos, i);
		}
		return inputArray;
	}

	private static void swapElement(int inputArray[], int minValuePos, int currentValuePos) {
		int temp = inputArray[minValuePos];
		inputArray[minValuePos] = inputArray[currentValuePos];
		inputArray[currentValuePos] = temp;
	}
}
