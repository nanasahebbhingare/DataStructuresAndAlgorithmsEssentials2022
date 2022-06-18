package arrays;

/**
 * Print LowerBondInArrays
 * 
 * @author Bhingare Nana.
 * @since 09/04/2022
 * @version 1
 */
public class LowerBondInArrays {
	public static void main(String[] args) {
		int inputArray[] = { -1, -1, 2, 3, 5 };
		// int inputArray[] = { 1, 2, 3, 4, 6 };
		// int inputArray[] = { 5, 6, 7 };
		int val = 4;
		int lBond = lowerBond(inputArray, val);
		System.out.println(lBond);
	}

	private static int lowerBond(int[] inputArray, int val) {
		int start = 0;
		int last = inputArray.length - 1;
		int ans = -1;
		int mid = 0;
		while (start <= last) {
			mid = (start + last) / 2;
			if (inputArray[mid] > val) {
				last = mid - 1;
			} else {
				ans = inputArray[mid];
				start = mid + 1;
			}
		}
		return ans;
	}
}
