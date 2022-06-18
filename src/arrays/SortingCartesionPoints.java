package arrays;

import java.util.ArrayList;

import arrays.dto.OutputPairSumDTO;

/**
 * Sorting Cartesion Points
 *
 * @author Bhingare Nana.
 * @since 14/04/2022
 * @version 1
 */
public class SortingCartesionPoints {
	public static void main(String[] args) {
		ArrayList<OutputPairSumDTO> outputPairSumDTOs = new ArrayList<>();
		OutputPairSumDTO dto1 = new OutputPairSumDTO(3, 4);
		OutputPairSumDTO dto2 = new OutputPairSumDTO(2, 3);
		OutputPairSumDTO dto3 = new OutputPairSumDTO(3, 7);
		OutputPairSumDTO dto4 = new OutputPairSumDTO(1, 5);
		OutputPairSumDTO dto5 = new OutputPairSumDTO(3, 4);
		outputPairSumDTOs.add(dto1);
		outputPairSumDTOs.add(dto2);
		outputPairSumDTOs.add(dto3);
		outputPairSumDTOs.add(dto4);
		outputPairSumDTOs.add(dto5);

		ArrayList<OutputPairSumDTO> output = sortingCartesionPoints(outputPairSumDTOs);
		for (int i = 0; i < output.size(); i++) {
			System.out.print(output.get(i) + " ");
		}
	}

	private static ArrayList<OutputPairSumDTO> sortingCartesionPoints(ArrayList<OutputPairSumDTO> outputPairSumDTOs) {
		for (int i = 0; i < outputPairSumDTOs.size(); i++) {
			for (int j = 0; j < outputPairSumDTOs.size() - 1; j++) {
				if (outputPairSumDTOs.get(j).getNumberOutputOne() > outputPairSumDTOs.get(j + 1).getNumberOutputOne()) {
					OutputPairSumDTO temp = outputPairSumDTOs.get(j);
					outputPairSumDTOs.set(j, outputPairSumDTOs.get(j + 1));
					outputPairSumDTOs.set(j + 1, temp);
				} else if (outputPairSumDTOs.get(j).getNumberOutputOne() >= outputPairSumDTOs.get(j + 1).getNumberOutputOne()) {
					if (outputPairSumDTOs.get(j).getNumberOutputSecond() >= outputPairSumDTOs.get(j + 1).getNumberOutputSecond()) {
						OutputPairSumDTO temp = outputPairSumDTOs.get(j);
						outputPairSumDTOs.set(j, outputPairSumDTOs.get(j + 1));
						outputPairSumDTOs.set(j + 1, temp);
					}
				}
			}
		}
		return outputPairSumDTOs;
	}
}
