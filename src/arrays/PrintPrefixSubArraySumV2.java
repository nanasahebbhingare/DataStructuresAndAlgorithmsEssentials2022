package arrays;
/**
 * Print SubArray Sum V2 ---- Brute Force
 * 
 * @author Bhingare Nana.
 * @since 09/04/2022
 * @version 1
 */
public class PrintPrefixSubArraySumV2 {
	public static void main(String[] args) {
		int inputArrays[] = { 1, 2, 3, 4, 5 };
		int n = inputArrays.length;
		int largeSum = printPrefixSubArraySumV2(inputArrays, n);
		System.out.println(largeSum);
	}

	private static int printPrefixSubArraySumV2(int[] inputArrays, int n) {
		int prefixSum[] = new int[n];
		int largeSum = 0;
		prefixSum[0] = inputArrays[0];
		for (int i = 1; i < n; i++) {
			prefixSum[i] = prefixSum[i - 1] + inputArrays[i];
		}

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				int sum = i > 0 ? prefixSum[j] - prefixSum[i - 1] : prefixSum[j];
				largeSum = Math.max(largeSum, sum);
			}
		}
		return largeSum;
	}
}