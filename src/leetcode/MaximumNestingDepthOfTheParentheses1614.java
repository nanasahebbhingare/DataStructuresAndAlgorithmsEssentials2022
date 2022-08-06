package leetcode;

import java.util.Stack;

public class MaximumNestingDepthOfTheParentheses1614 {
	public static void main(String[] args) {
		String s = "(1+(2*3)+((8)/4))+1";
		
		System.out.println("aaab".indexOf("ab"));
		//System.out.println(maxDepth(s));
	}

	public static int maxDepth(String s) {
		int depthCnt = 0;
		int maxDepthCnt = 0;
		Stack<Character> stack = new Stack<>();
		if (s.length() <= 1 || "".equals(s) || "(".equals(s) || ")".equals(s)) {
			return 0;
		}
		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case '(':
				stack.add(s.charAt(i));
				depthCnt++; 
				break;
			case ')':
				stack.pop();
				maxDepthCnt = Math.max(maxDepthCnt, depthCnt);
				depthCnt--;
				break;
			default:
				break;
			}
		}

		return maxDepthCnt;
	}
}
