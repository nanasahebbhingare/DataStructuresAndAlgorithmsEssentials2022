package leetcode;

import java.util.HashMap;

public class RemovePalindromicSubsequences1332 {
	public static void main(String[] args) {
		String s = "1210";
		System.out.println(digitCount(s));
	}

	public static int removePalindromeSub(String s) {
		if (s.isEmpty())
			return 1;
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else {
				return 2;
			}

		}
		return 1;
	}

	public static boolean digitCount(String num) {
		int length = num.length();
		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < length; i++) {
			if (hm.containsKey(num.charAt(i))) {
				hm.put(num.charAt(i), hm.get(num.charAt(i)) + 1);
			} else {
				hm.put(num.charAt(i), 1);
			}
		}

		for (int i = 0; i < length; i++) {
			int strToInt = Character.getNumericValue(num.charAt(i));
			if (strToInt != hm.get(num.charAt(i)))
				return false;
		}
		return true;
	}
}
