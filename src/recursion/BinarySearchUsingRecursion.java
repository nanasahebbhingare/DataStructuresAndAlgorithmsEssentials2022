package recursion;

public class BinarySearchUsingRecursion {
	public static void main(String[] args) {
		int inputArray[] = { 1, 2, 3, 4, 5 };
		int key = 7;
		int start = 0;
		int end = inputArray.length - 1;
		int foundIndex = binarySearch(inputArray, key, start, end);
		System.out.println(foundIndex);
	}

	private static int binarySearch(int[] inputArray, int key, int start, int end) {
		if (start > end) {
			return -1;
		}
		int mid = (start + end) / 2;
		if (key == inputArray[mid]) {
			return mid;
		}
		if (key < inputArray[mid]) {
			return binarySearch(inputArray, key, start, mid - 1);
		}
		return binarySearch(inputArray, key, mid + 1, end);
	}
}
