package divideandconquer;

/**
 * QuickSort
 * 
 * @author Bhingare Nana.
 * @since 18/06/2022
 * @version 1
 */
public class QuickSort {
	public static void main(String[] args) {
		int[] inputArray = { 10, 5, 2, 0, 7, 6, 4 };
		quickSort(inputArray, 0, inputArray.length - 1);
		for (int l = 0; l < inputArray.length; l++) {
			System.out.println(inputArray[l]);
		}
	}

	private static void quickSort(int[] inputArray, int start, int end) {
		if (start >= end)
			return;
		int p = partition(inputArray, start, end);
		quickSort(inputArray, start, p - 1);
		quickSort(inputArray, p + 1, end);
	}

	private static int partition(int[] inputArray, int start, int end) {
		int i = start - 1;
		int pivot = inputArray[end];
		for (int j = start; j <= end; j++) {
			if (inputArray[j] < pivot) {
				i++;
				swap(inputArray, i, j);
			}
		}
		swap(inputArray, i + 1, end);
		return i+1;
	}

	private static void swap(int[] inputArray, int startPos, int endPos) {
		int temp = inputArray[startPos];
		inputArray[startPos] = inputArray[endPos];
		inputArray[endPos] = temp;
	}
}
