package recursion.subset;

import java.util.ArrayList;

public class SubsetOfStringUsingRecursion {
	public static void main(String[] args) {
		String str = "abc";
		String processStr = "";
		// subsetOfString(processStr, str);
		System.out.println(subsetOfStr(processStr, str));
	}

	private static void subsetOfString(String processStr, String str) {
		if (str.isEmpty()) {
			System.out.println(processStr);
			return;
		}

		char ch = str.charAt(0);
		subsetOfString(processStr + ch, str.substring(1));
		subsetOfString(processStr, str.substring(1));
	}

	private static ArrayList<String> subsetOfStr(String processStr, String str) {
		ArrayList<String> al = new ArrayList<>();
		if (str.isEmpty()) {
			if (processStr.isEmpty()) {
				al.add("null");
			} else {
				al.add(processStr);
			}
			return al;
		}

		char ch = str.charAt(0);
		ArrayList<String> alWith = subsetOfStr(processStr + ch, str.substring(1));
		ArrayList<String> alWithOut = subsetOfStr(processStr, str.substring(1));
		al.addAll(alWith);
		al.addAll(alWithOut);
		return al;
	}
}
