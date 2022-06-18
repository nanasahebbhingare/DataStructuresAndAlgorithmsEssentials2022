package recursion;

/**
 * CountBinaryStringUsingRecursion
 * 
 * @author Bhingare Nana.
 * @since 04/06/2022
 * @version 1
 */
public class CountBinaryStringUsingRecursion {
	public static void main(String[] args) {
		int input = 3;
		System.out.println("Count Binary String : -" + countBinaryString(input));
	}

	private static int countBinaryString(int input) {
		// Base Case
		if (input <= 0) {
			return 1;
		}
		// Recursive Case
		return input = countBinaryString(input - 1) + countBinaryString(input - 2);
	}
}