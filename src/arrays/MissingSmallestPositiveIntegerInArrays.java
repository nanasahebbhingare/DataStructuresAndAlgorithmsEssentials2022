package arrays;

/**
 * Print MissingSmallestPositiveIntegerInArrays ---- Brute Force
 * 
 * @author Bhingare Nana.
 * @since 09/04/2022
 * @version 1
 */
public class MissingSmallestPositiveIntegerInArrays {
	public static void main(String[] args) {
		// int inputArrays[] = { 1, 3, 6, 4, 1, 2 };
		// int inputArrays[] = { -1, -3 };
		int inputArrays[] = { 1, 2, 3 };
		int n = inputArrays.length;
		int missingNo = missingSmallestPositiveIntegerInArray(inputArrays, n);
		System.out.println(missingNo);
	}

	private static int missingSmallestPositiveIntegerInArray(int[] inputArrays, int n) {
		int prefix[] = new int[n + 1];
		for (int i = 0; i < n; i++) {
			if (inputArrays[i] >= 0)
				prefix[inputArrays[i]] = 1;
		}
		for (int i = 1; i < prefix.length; i++) {
			if (prefix[i] == 0) {
				return i;
			}
		}
		return prefix.length;
	}
}
