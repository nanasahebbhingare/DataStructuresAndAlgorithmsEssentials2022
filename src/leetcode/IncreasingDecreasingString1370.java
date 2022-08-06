package leetcode;

public class IncreasingDecreasingString1370 {

	public static void main(String[] args) {
		String str = "rat";
		System.out.println(sortString(str));
	}

	public static String sortString(String s) {
		int charInt[] = new int[26];
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			int pos = s.charAt(i) - 'a';
			charInt[pos]++;
		}
		while (builder.toString().length() < s.length()) {
			for (int i = 0; i < charInt.length; i++) {
				if (charInt[i] != 0) {
					builder.append(String.valueOf((char) (i + 97)));
					charInt[i]--;
				}
			}

			for (int j = charInt.length - 1; j >= 0; j--) {
				if (charInt[j] != 0) {
					builder.append(String.valueOf((char) (j + 97)));
					charInt[j]--;
				}
			}
		}
		return builder.toString();
	}
}
