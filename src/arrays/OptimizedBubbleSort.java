package arrays;

/**
 * Optimized Bubble Sort
 *
 * @author Bhingare Nana.
 * @since 13/04/2022
 * @version 1
 */
public class OptimizedBubbleSort {
	public static void main(String[] args) {
		// int inputArray[] = { 3, 4, 5, 1, 2 };
		int inputArray[] = { 1, 2, 3, 4, 5 };
		int length = inputArray.length;
		int output[] = bubbleSort(inputArray, length);
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}

	private static int[] bubbleSort(int[] inputArray, int length) {
		for (int i = 0; i < length - 2; i++) {
			boolean flag = Boolean.FALSE;
			for (int j = 0; j < (length - 1) - i; j++) {
				if (inputArray[j] > inputArray[j + 1]) {
					flag = Boolean.TRUE;
					int temp = inputArray[j];
					inputArray[j] = inputArray[j + 1];
					inputArray[j + 1] = temp;
				}
			}
			if (!flag)
				return inputArray;
		}
		return inputArray;
	}
}
