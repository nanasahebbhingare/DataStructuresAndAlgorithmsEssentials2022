package leetcode;

import java.util.HashSet;

public class CheckifAllCharactersHaveEqualNumberofOccurrences1941 {
	public static void main(String[] args) {
		System.out.println(areOccurrencesEqual("wzkpzzwzpzkwkpkppzkppkpkwwkzzzwwpwwk"));
	}

	/*
	 * public static boolean areOccurrencesEqual(String s) { boolean fillFlag =
	 * false; int[] intChar = new int[26]; int found = 0; for (int i = 0; i <
	 * s.length(); i++) { int idx = s.charAt(i) - 'a'; intChar[idx]++; } for
	 * (int j = 0; j < intChar.length; j++) { if (intChar[j] != 0 && !fillFlag)
	 * { found = intChar[j]; fillFlag = true; }
	 * 
	 * if (intChar[j] != found && intChar[j]!=0) return false; } return true; }
	 */

	public static boolean areOccurrencesEqual(String s) {
		HashSet<Character> hs = new HashSet<>();
		int halfCnt = s.length() % 2 == 0 ? s.length() / 2 : (s.length() / 2) + 1;
		for (int i = 0; i < s.length(); i++) {
			hs.add(s.charAt(i));
		}
		if (hs.size() == 1)
			return true;
		if (hs.size() != s.length() && hs.size() != halfCnt)
			return false;
		return true;
	}
}
