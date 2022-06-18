package arrays;

import arrays.dto.OutputPairSumDTO;

/**
 * Sorted Pair Sum Order Of N
 *
 * @author Bhingare Nana.
 * @since 06/04/2022
 * @version 1
 */
public class SortedPairSumOrderOfN {
	public static void main(String[] args) {
		//int inputArray[] = { -1000, -1, 0, 1 };
		 //int inputArray[] = { -1, 0 };
		int inputArray[] = { 0 , 0, 3,4 };
		int n = 0;
		OutputPairSumDTO output = sortedPairSum(inputArray, n);
		System.out.println("-------------- Pair Sum ----------------");
		System.out.print(output);
	}

	private static OutputPairSumDTO sortedPairSum(int[] inputArray, int n) {
		OutputPairSumDTO outPutDto = new OutputPairSumDTO(0, 0);
		int start = 0;
		int last = inputArray.length - 1;
		int sum = 0, largeNum = 0;
		while (start < last) {
			sum = inputArray[start] + inputArray[last];
			if (sum > 0 && sum <= n) {
				largeNum = Math.max(largeNum, sum);
				outPutDto.setNumberOutputOne(start + 1);
				outPutDto.setNumberOutputSecond(last + 1);
				if (largeNum <= n) {
					start++;
				}
				if (largeNum == n) {
					break;
				}

			} else {
				if (sum <= 0) {
					outPutDto.setNumberOutputOne(start + 1);
					outPutDto.setNumberOutputSecond(last + 1);
					start++;
				} else {
					last--;
				}
			}
		}
		return outPutDto;
	}
}
