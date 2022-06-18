package arrays;

/**
 * Print Arrays Pairs
 *
 * @author Bhingare Nana.
 * @since 07/04/2022
 * @version 1
 */
public class PrintArraysPairs {
	public static int maxValue = 0;

	public static void main(String[] args) {
		int inputArrays[] = { 1, 2, 0, 1 };
		int n = inputArrays.length;
		// printArraysPairs(inputArrays, n);
		printSumOfArraysPairs(inputArrays, n);
	}

	private static void printSumOfArraysPairs(int[] inputArrays, int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				for (int k = i; k <= j; k++) {
					sum += inputArrays[k];
					findMaxValue(sum);
				}
				System.out.println(sum);
				sum = 0;
			}
			System.out.println("Max : -" + maxValue);
			maxValue = 0;
			System.out.println();
		}
	}

	private static void findMaxValue(int inputSum) {
		if (maxValue < inputSum) {
			maxValue = inputSum;
		}
	}

	private static void printArraysPairs(int[] inputArrays, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				for (int k = i; k <= j; k++) {
					if (i == k)
						System.out.print("[");
					System.out.print(" " + inputArrays[k] + " ");
					if (j == k)
						System.out.print("]");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
