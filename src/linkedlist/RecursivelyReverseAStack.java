package linkedlist;

import java.util.Stack;

public class RecursivelyReverseAStack {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println("BEFORE REVERSE: " + stack);
		System.out.print("ATER REVERSE: ");
		reverse(stack);
	}

	private static void reverse(Stack<Integer> stack) {
		// Base Case
		if (stack.isEmpty()) {
			return;
		}
		int tempData = stack.pop();
		reverse(stack);
		System.out.print(" " + tempData);
	}
}
