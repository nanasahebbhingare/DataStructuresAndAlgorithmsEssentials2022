package arrays;

/**
 * Binary Search
 *
 * @author Bhingare Nana.
 * @since 05/04/2022
 * @version 1
 */
public class BinarySearch {
	public static void main(String[] args) {
		int inputArray[] = { 1, 2, 3, 4, 5, 6, 7 };
		int size = inputArray.length;
		int key = 7;
		int index = getBinarySearchElement(inputArray, size, key);
		if (index != -1) {
			System.out.println(index + " Found at index");
		} else {
			System.out.println(index + " Element not found at index");
		}
	}

	// Brute force
	//
	public static int getBinarySearchElement(int[] inputArray, int size, int key) {
		int start = 0;
		int last = size - 1;
		int mid = -1;
		while (start <= last) {
			mid = (start + last) / 2;
			if (key == inputArray[mid]) {
				return mid;
			}
			if (key > inputArray[mid]) {
				start = mid + 1;
			} else {
				last = mid - 1;
			}

		}
		return -1;
	}
}