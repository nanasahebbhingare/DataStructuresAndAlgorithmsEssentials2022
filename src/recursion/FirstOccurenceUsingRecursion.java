package recursion;

/**
 * FirstOccurenceUsingRecursion
 * 
 * @author Bhingare Nana.
 * @since 04/06/2022
 * @version 1
 */
public class FirstOccurenceUsingRecursion {
	public static void main(String[] args) {
		int[] input = { 1, 2, 3, 5, 4 };
		int i = 0;
		int key = 2;
		System.out.print("First Occurence :- " + firstOccurence(input, i, key));

	}

	private static int firstOccurence(int[] input, int i, int key) {
		int pos = 0;
		// Base Case
		if (i < input.length) {
			if (input[i] == key) {
				return i;
			}
			// Recursive Case
			pos = firstOccurence(input, i + 1, key);
		}
		return pos > 0 ? pos : -1;
	}
}
