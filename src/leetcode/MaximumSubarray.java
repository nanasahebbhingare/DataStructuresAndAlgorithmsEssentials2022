package leetcode;

public class MaximumSubarray {
	public static void main(String[] args) {
		int nums[] = {-2,1};
		System.out.println(maxSubArray(nums));
	}

	public static int maxSubArray(int[] nums) {
		int max = 0;
		int n = nums.length;
		if (nums.length <= 1)
			return nums[0];
		for (int i = 0; i < n; i++) {
			int sum = nums[i];
			for (int j = i + 1; j < n; j++) {
				sum += nums[j];
				max = Math.max(max, sum);
			}
			max = Math.max(max, sum);
		}
		return max;

	}
}
