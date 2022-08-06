package backtracking;

public class FillArrayToMinusValueUsingRecursionBacktracking {
	public static void main(String[] args) {
		int n = 5;
		int[] inputArray = new int[n];
		fillArray(inputArray, 0, n, 1);
		for (int i = 0; i < inputArray.length; i++) {
			System.out.print(inputArray[i] + " ");
		}
	}

	public static void fillArray(int[] inputArray, int i, int n, int val) {
		// base case
		if (i == n)
			return;
		inputArray[i] = val;
		fillArray(inputArray, i + 1, n, val + 1);
		inputArray[i] = -1 * inputArray[i];
	}
}