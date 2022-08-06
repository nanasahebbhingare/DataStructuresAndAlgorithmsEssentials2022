package leetcode;

public class CounttheNumberofConsistentStrings1684 {
	public static void main(String[] args) {
		String allowed = "ab";
		String words[] = { "ad", "bd", "aaab", "baa", "badab" };
		System.out.println(countConsistentStrings(allowed, words));
	}

	public static int countConsistentStrings(String allowed, String[] words) {
		int consistentCnt = 0;
		for (int i = 0; i < words.length; i++) {
			String replaceStr = words[i];;
			for (char ch : allowed.toCharArray()) {
				
				replaceStr = replaceStr.replace(ch, '1');
			}
			System.out.println(replaceStr.indexOf('1'));
			if (replaceStr.indexOf('1') == words[i].length()) {
				consistentCnt++;
			}
		}

		return consistentCnt;
	}
}
