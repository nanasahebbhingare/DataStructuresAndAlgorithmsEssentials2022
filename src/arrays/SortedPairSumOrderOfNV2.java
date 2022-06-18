package arrays;

import arrays.dto.OutputPairSumDTO;

/**
 * Sorted Pair Sum Order Of N V2
 *
 * @author Bhingare Nana.
 * @since 06/04/2022
 * @version 1
 */
public class SortedPairSumOrderOfNV2 {
	public static void main(String[] args) {
		// int inputArray[] = { -1000, -1, 0, 1 };
		int inputArray[] = { 2, 3, 4 };
		// int inputArray[] = { 10, 22, 28, 29,30,40 };
		int n = 6;
		OutputPairSumDTO output = sortedPairSum(inputArray, n);
		System.out.println("-------------- Pair Sum ----------------");
		System.out.print(output);
	}

	private static OutputPairSumDTO sortedPairSum(int[] inputArray, int n) {
		int start = 0;
		int last = inputArray.length - 1;
		int sumSub = 0;
		int diff = Integer.MAX_VALUE;
		int tempStart = 0;
		int tempLast = 0;
		while (start < last) {
			sumSub = inputArray[start] + inputArray[last] - n;
			int absValue = Math.abs(sumSub);
			if (absValue < diff) {
				tempStart = start;
				tempLast = last;
				diff = Math.abs(sumSub);
			}
			if ((inputArray[start] + inputArray[last]) == n) {
				break;
			}
			if ((inputArray[start] + inputArray[last]) > n) {
				last--;
			} else {
				start++;
			}
		}
		return new OutputPairSumDTO(inputArray[tempStart], inputArray[tempLast]);
	}
}
