package backtracking;

import java.util.ArrayList;
import java.util.List;

public class FindingSubsetsCodeUsingRecursion {
	public static void main(String[] args) {
		List<Character> inputArray = new ArrayList<Character>();
		inputArray.add('a');
		inputArray.add('b');
		inputArray.add('c');
		List<Character> outputArray = new ArrayList<Character>();
		List<List<Character>> ansArray = new ArrayList<>();
		// findSubsets(inputArray, outputArray, 0, 0);
		findSubsetsV2(inputArray, outputArray, 0, ansArray);
		System.out.println(ansArray);
	}

	private static void findSubsets(char[] inputArray, char[] outputArray, int i, int j) {
		if (inputArray[i] == '\0') {
			outputArray[j] = '\0';
			if (outputArray[0] == '\0')
				System.out.print("null");
			System.out.println(outputArray);
			return;
		}
		outputArray[j] = inputArray[i];
		findSubsets(inputArray, outputArray, i + 1, j + 1);
		findSubsets(inputArray, outputArray, i + 1, j);
	}

	private static void findSubsetsV2(List<Character> inputArray, List<Character> outputArray, int i,
			List<List<Character>> ansArray) {
		if (i >= inputArray.size()) {
			ansArray.add(outputArray);
			return;
		}
		// exclude
		findSubsetsV2(inputArray, outputArray, i + 1, ansArray);
		Character element = inputArray.get(i);
		List<Character> outputArrayCP = new ArrayList<>(outputArray);
		outputArrayCP.add(element);
		// incluede
		findSubsetsV2(inputArray, outputArrayCP, i + 1, ansArray);
	}
}
