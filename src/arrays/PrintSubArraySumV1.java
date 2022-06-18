package arrays;

/**
 * Print SubArray Sum V1 ---- Brute Force
 * 
 * @author Bhingare Nana.
 * @since 06/04/2022
 * @version 1
 */
public class PrintSubArraySumV1 {
	public static void main(String[] args) {
		int inputArray[] = { 1, 2, -4, 1, 5 };
		int n = inputArray.length;

		printSubArraySumMax(inputArray, n);
	}

	private static void printSubArraySumMax(int[] inputArray, int n) {
		int largeSum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int subArraySum = 0;
				for (int k = i; k <= j; k++) {
					subArraySum += inputArray[k];
				}
				//Using Library Function
				largeSum = Math.max(largeSum, subArraySum);
			}
		}
		System.out.println("Max :- " + largeSum);
	}
}
