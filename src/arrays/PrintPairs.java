package arrays;

/**
 * Print Pairs
 *
 * @author Bhingare Nana.
 * @since 06/04/2022
 * @version 1
 */
public class PrintPairs {
	public static void main(String[] args) {
		int inputArray[] = { 1, 2, 3, 4 };
		int n = inputArray.length;
		printPairs(inputArray, n);
	}

	private static void printPairs(int[] inputArray, int n) {
		for (int i = 0; i < n - 1; i++) {
			System.out.print("Pair:- " + (i + 1));
			for (int j = i + 1; j < n; j++) {
				System.out.print(" [" + inputArray[i] + " , " + inputArray[j] + "]");
			}
			System.out.println();
		}

	}
}
