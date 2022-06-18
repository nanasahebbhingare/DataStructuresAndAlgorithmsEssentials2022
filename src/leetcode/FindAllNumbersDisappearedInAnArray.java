package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllNumbersDisappearedInAnArray {
	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		System.out.println(findDisappearedNumbers(nums));
	}

	/*
	 * public static List<Integer> findDisappearedNumbers(int[] nums) {
	 * List<Integer> output = new ArrayList<>(); Map<Integer, Integer> outMap =
	 * new HashMap<>(); for (int i = 0; i < nums.length; i++) {
	 * outMap.put(nums[i], 1); } for (int i = 1; i < nums.length; i++) { if
	 * (!outMap.containsKey(i)) { output.add(i); } } return output; }
	 */

	public static List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> output = new ArrayList<>();
		int[] arr = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			arr[nums[i] - 1] = 1;
		}
		for (int i = 0; i < nums.length; i++) {
			if (arr[i] == 0) {
				output.add(i + 1);
			}
		}
		return output;
	}
}
