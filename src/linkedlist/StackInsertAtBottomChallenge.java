package linkedlist;

import java.util.Stack;

public class StackInsertAtBottomChallenge {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		System.out.println("BEFORE INSERT: " + stack);
		insertAtBottom(stack, 5);
		System.out.println("ATER INSERT: " + stack);
	}

	private static void insertAtBottom(Stack<Integer> stack, int item) {
		if (stack.empty()) {
			stack.push(item);
			return;
		}
		int tempData = stack.pop();
		insertAtBottom(stack, item);
		stack.push(tempData);
	}
}
