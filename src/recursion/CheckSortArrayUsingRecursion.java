package recursion;

/**
 * CheckSortArrayUsingRecursion
 * 
 * @author Bhingare Nana.
 * @since 04/06/2022
 * @version 1
 */
public class CheckSortArrayUsingRecursion {
	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 5, 4 };
		int pos = 0;
		System.out.println("Factonial Of N Is : -" + checkSorted(input, pos));
	}

	private static Boolean checkSorted(int[] input, int pos) {
		// Base Case
		if (pos >= input.length - 1)
			return Boolean.TRUE;
		// Recursive Case
		if (input[pos] < input[pos + 1])
			return checkSorted(input, pos + 1);
		return Boolean.FALSE;
	}
}
