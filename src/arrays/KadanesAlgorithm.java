package arrays;

/**
 * Print Kadanes Algorithm.
 * 
 * @author Bhingare Nana.
 * @since 09/04/2022
 * @version 1
 */
public class KadanesAlgorithm {
	public static void main(String[] args) {
		int inputArrays[] = { -2, 3, 4, -1, 5, -12, 6, 1, 3, 2 };
		int n = inputArrays.length;
		int largeSum = kadanesAlgorithm(inputArrays, n);
		System.out.println(largeSum);
	}

	private static int kadanesAlgorithm(int[] inputArrays, int n) {
		int currentSum = 0;
		int largeSum = 0;
		for (int i = 0; i < n; i++) {
			currentSum += inputArrays[i];
			if (currentSum > 0) {
				largeSum = Math.max(largeSum, currentSum);
			} else {
				currentSum = 0;
			}
		}
		return largeSum;
	}
}
