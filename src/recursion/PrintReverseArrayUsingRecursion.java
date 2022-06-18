package recursion;

/**
 * PrintReverseArrayUsingRecursion
 * 
 * @author Bhingare Nana.
 * @since 05/06/2022
 * @version 1
 */
public class PrintReverseArrayUsingRecursion {

	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 5, 4 };
		int length = input.length - 1;
		System.out.print("Reverse Array :- ");
		reverseArray(input, length);
	}

	private static void reverseArray(int[] input, int length) {
		// Base Case
		if (length == -1)
			return;
		// Recursive Case
		System.out.print(input[length]+" ");
		reverseArray(input, length - 1);
	}

}
