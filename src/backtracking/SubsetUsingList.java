package backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubsetUsingList {
	public static void main(String[] args) {
		int nums[] = { 1, 2, 3 };
		System.out.println(subsets(nums));

	}

	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		result.add(new ArrayList<>());
		for (int num : nums) {
			int n = result.size();
			for (int j = 0; j < n; j++) {
				ArrayList<Integer> temp = new ArrayList<>(result.get(j));
				temp.add(num);
				result.add(temp);
			}
		}
		return result;
	}
}
