package backtracking;

import java.util.ArrayList;

public class FillArrayListToMinusValueUsingRecursionBacktracking {

	public static void main(String[] args) {
		int n = 5;
		ArrayList<Integer> inputArray = new ArrayList<>();
		fillArray(inputArray, 0, n, 1);
		for (int i = 0; i < inputArray.size(); i++) {
			System.out.print(inputArray.get(i) + " ");
		}
	}

	public static void fillArray(ArrayList<Integer> inputArray, int i, int n, int val) {
		// base case
		if (i == n)
			return;
		inputArray.add(i, val);
		fillArray(inputArray, i + 1, n, val + 1);
		inputArray.set(i, (-1 * inputArray.get(i)));
	}
}