package leetcode;

public class ReverseInteger7 {
	public static void main(String[] args) {
		int x = 9669;
		System.out.println(maximum69Number(x));
	}

	public static int reverse(int x) {
		try {
			StringBuilder sb = new StringBuilder(Integer.toString(x));
			if (x > 0) {
				return Integer.parseInt(sb.reverse().toString());
			} else {
				return Integer.parseInt(sb.reverse().toString().replace("-", "")) * -1;
			}
		} catch (Exception e) {
			return 0;
		}
	}

	public static int maximum69Number(int num) {
		StringBuilder numStr = new StringBuilder(Integer.toString(num));
		int maxValue = Integer.MIN_VALUE;
		for (int i = 0; i < numStr.length(); i++) {
			StringBuilder newStr = new StringBuilder(numStr);
			if (newStr.charAt(i) == '9') {
				newStr.setCharAt(i, '6');
				maxValue = Math.max(maxValue, Integer.parseInt(newStr.toString()));
			} else {
				newStr.setCharAt(i, '9');
				maxValue = Math.max(maxValue, Integer.parseInt(newStr.toString()));
			}
		}
		return maxValue;
	}
}
