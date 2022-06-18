package leetcode;

public class SingleNumber136 {
	public static void main(String[] args) {
		int[] nums = {4,1,2,1,2};
		System.out.println(singleNumber(nums));
	}

	public static int singleNumber(int[] nums) {
		 int mem = 0;
			for (int i = 0; i < nums.length; i++) {
				mem ^=nums[i];
			}
			return mem;
	}
}
