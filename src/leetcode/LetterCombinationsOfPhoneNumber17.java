package leetcode;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber17 {
	public static void main(String[] args) {
		String digits = "23";
		System.out.println(letterCombinations(digits));
	}

	public static List<String> letterCombinations(String digits) {
		List<String> finalOutPut = new ArrayList<String>();
		String outPut = new String();
		int idx = 0;
		String[] mapping = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		if (digits.length() == 0) {
			return finalOutPut;
		}
		solve(digits, outPut, idx, finalOutPut, mapping);
		return finalOutPut;
	}

	private static void solve(String digits, String outPut, int idx, List<String> finalOutPut, String[] mapping) {
		// base case
		if (idx >= digits.length()) {
			finalOutPut.add(outPut);
			return;
		}
		int number = digits.charAt(idx) - '0';
		String mapValue = mapping[number];

		for (int i = 0; i < mapValue.length(); i++) {
			outPut += mapValue.charAt(i);
			solve(digits, outPut, idx + 1, finalOutPut, mapping);
			outPut = outPut.substring(0, outPut.length() - 1);
		}
	}
}
