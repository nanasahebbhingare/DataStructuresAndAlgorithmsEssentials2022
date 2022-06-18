package arrays;

/**
 * Sorted Pair Sum Order Of N ^ 2
 *
 * @author Bhingare Nana.
 * @since 06/04/2022
 * @version 1
 */
public class SortedPairSumOrderOfNsqu2 {
	public static void main(String[] args) {
		int inputArray[] = { 10, 22, 28, 29, 30, 40 };
		int n = 54;
		int output[] = sortedPairSum(inputArray, n);
		System.out.println("-------------- Pair Sum ----------------");
		for (int i = 0; i < output.length; i++) {
			System.out.print(" " + output[i]);
		}
	}

	private static int[] sortedPairSum(int[] inputArray, int n) {
		int output[] = new int[2];
		int largeNum = 0;
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				int sum = inputArray[i] + inputArray[j];
				largeNum = Math.max(largeNum, sum);
				if (largeNum <= n) {
					output[0] = inputArray[i];
					output[1] = inputArray[j];
				}
			}
		}
		return output;
	}
}
