package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subset78 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };
		List<List<Integer>> outputList = subset(nums);
		System.out.println(outputList);
	}

	private static List<List<Integer>> subset(int[] nums) {
		List<List<Integer>> finalOutPut = new ArrayList<List<Integer>>();
		List<Integer> outPutList = new ArrayList<>();
		int idx = 0;
		solve(nums, outPutList, idx, finalOutPut);
		return finalOutPut;
	}

	private static void solve(int[] nums, List<Integer> outPutList, int idx, List<List<Integer>> finalOutPut) {
		System.out.println("outPutList: " + outPutList + " IDX: " + idx);
		if (idx >= nums.length) {
			System.out.println(outPutList);
			finalOutPut.add(outPutList);
			return;
		}

		// Exclude
		solve(nums, outPutList, idx + 1, finalOutPut);
		int element = nums[idx];
		System.out.println("Element: " + element);
		List<Integer> partialOutput = new ArrayList<>(outPutList);
		partialOutput.add(element);
		// Include
		solve(nums, partialOutput, idx + 1, finalOutPut);
	}
}
