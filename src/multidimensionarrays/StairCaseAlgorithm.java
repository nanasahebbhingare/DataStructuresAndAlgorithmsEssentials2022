package multidimensionarrays;

import arrays.dto.OutputPairSumDTO;

/**
 * StairCaseAlgorithm
 * 
 * @author Bhingare Nana.
 * @since 08/05/2022
 * @version 1
 */
public class StairCaseAlgorithm {
	public static void main(String[] args) {
		int inputArrays[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
		int row = 4;
		int column = 4;
		int key = 50;
		OutputPairSumDTO outputPairSumDTO = stairCaseSearch(inputArrays, row, column, key);
		System.out.println("Final Output :" + outputPairSumDTO);
	}

	private static OutputPairSumDTO stairCaseSearch(int[][] inputArrays, int row, int column, int key) {
		OutputPairSumDTO outputPairSumDTO = new OutputPairSumDTO(-1, -1);
		if (key < inputArrays[0][0] || key > inputArrays[row - 1][column - 1]) {
			return outputPairSumDTO;
		}
		int i = 0;
		int j = column - 1;
		while (i <= (row - 1) && j >= 0) {
			if (inputArrays[i][j] == key) {
				outputPairSumDTO.setNumberOutputOne(i);
				outputPairSumDTO.setNumberOutputSecond(j);
				return outputPairSumDTO;
			} else if (inputArrays[i][j] > key) {
				--j;
			} else {
				++i;
			}
		}
		return outputPairSumDTO;
	}
}
