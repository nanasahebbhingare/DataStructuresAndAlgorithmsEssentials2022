package arrays;

/**
 * Print UpperBondInArrays
 * 
 * @author Bhingare Nana.
 * @since 09/04/2022
 * @version 1
 */
public class UpperBondInArrays {
	public static void main(String[] args) {
		int inputArray[] = { -1, 1, 2, 3, 5 };
		int val = 4;
		int uBond = upperBond(inputArray, val);
		System.out.println(uBond);
	}

	private static int upperBond(int[] inputArray, int val) {
		int start = 0;
		int last = inputArray.length - 1;
		int mid = 0, ans = -1;
		while (start <= last) {
			mid = (start + last) / 2;
			if (inputArray[mid] > val) {
				ans = inputArray[mid];
				last = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return ans;
	}
}
