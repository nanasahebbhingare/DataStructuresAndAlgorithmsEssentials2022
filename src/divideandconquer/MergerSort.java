package divideandconquer;

/**
 * MergerSort
 * 
 * @author Bhingare Nana.
 * @since 18/06/2022
 * @version 1
 */
public class MergerSort {
	public static void main(String[] args) {
		int[] inputArray = { 10, 5, 2, 0, 7, 6, 4 };
		mergeSort(inputArray, 0, inputArray.length - 1);
		for (int l = 0; l < inputArray.length; l++) {
			System.out.println(inputArray[l]);
		}
	}

	static void mergeSort(int array[], int start, int end) {
		if (start >= end)
			return;
		int mid = (start + end) / 2;
		mergeSort(array, start, mid);
		mergeSort(array, mid + 1, end);
		merge(array, start, end);
	}

	static void merge(int[] array, int start, int end) {
		int i = start;
		int m = (start + end) / 2;
		int j = m + 1;
		int k = 0;
		int[] temp = new int[array.length];
		while (i <= m && j <= end) {
			if (array[i] < array[j]) {
				temp[k] = array[i];
				i++;
				k++;
			} else {
				temp[k] = array[j];
				j++;
				k++;
			}
		}

		while (i <= m) {
			temp[k] = array[i];
			i++;
			k++;
		}

		while (j <= end) {
			temp[k] = array[j];
			j++;
			k++;
		}
		int index = 0;
		for (int l = start; l <= end; l++) {
			array[l] = temp[index++];
		}
	}
}
