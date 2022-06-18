package arrays;

/**
 * Linear Search
 *
 * @author Bhingare Nana.
 * @since 05/04/2022
 * @version 1
 */
public class LinearSearch {
	public static void main(String[] args) {
		int inputArray[] = { 1, 2, 3, 4, 5, 6, 7 };
		int size = inputArray.length;
		int key = 10;
		int index = getLinearSearchElement(inputArray, size, key);
		if (index != -1) {
			System.out.println(key + " Found at index");
		} else {
			System.out.println(key + " Element not found at index");
		}
	}

	// Brute force solution.
	// I check key value in whole array.
	public static int getLinearSearchElement(int[] inputArray, int size, int key) {
		for (int i = 0; i < size; i++) {
			if (inputArray[i] == key) {
				return i;
			}
		}
		return -1;
	}
}