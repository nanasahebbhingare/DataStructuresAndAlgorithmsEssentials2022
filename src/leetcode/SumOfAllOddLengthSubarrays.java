package leetcode;

public class SumOfAllOddLengthSubarrays {
	public static void main(String[] args) {
		int arr[] = { 1, 4, 2, 5, 3 };
		System.out.println(sumOddLengthSubarrays(arr));
	}

	public static int sumOddLengthSubarrays(int[] arr) {
		int sum = 0;
		for (int i = 1; i <= arr.length; i += 2) {
			for (int j = 0; j <= arr.length - i; j++) {
				for (int k =j; k <(i+j); k++) {
					sum += arr[k];
				}
			}

		}
		return sum;
	}
}
