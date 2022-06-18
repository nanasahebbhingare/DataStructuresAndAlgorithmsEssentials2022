package recursion;

/**
 * FirstOccurenceUsingRecursion
 * 
 * @author Bhingare Nana.
 * @since 04/06/2022
 * @version 1
 */
public class LastOccurenceUsingRecursion {
	public static void main(String[] args) {
		int[] input = { 1, 7, 3, 7, 4 };
		int i = 0;
		int key = 7;
		int lastOccurence = 0;
		System.out.print("Last Occurence :- " + firstOccurence(input, i, key, lastOccurence));
	}

	private static int firstOccurence(int[] input, int i, int key, int lastOccurence) {
		// Base Case
		if (i < input.length) {
			if (input[i] == key) {
				lastOccurence = i;
			}
			// Recursive Case
			lastOccurence = firstOccurence(input, i + 1, key, lastOccurence);
		}
		return lastOccurence;
	}
}