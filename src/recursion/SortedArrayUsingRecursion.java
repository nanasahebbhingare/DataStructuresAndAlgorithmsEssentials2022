package recursion;

public class SortedArrayUsingRecursion {
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 5, 4 };
		int index = 0;
		System.out.println("Sorted Array Is :- " + sortedArray(array, index));
	}

	public static boolean sortedArray(int array[], int index) {
		if (index == array.length - 1) {
			return Boolean.TRUE;
		}
		return array[index] < array[index + 1] && sortedArray(array, index + 1);
	}
}
