package stack;

public class StackUsingLinekedList {
	public final static Node<Integer> BOTTOM = null;
	public static Node<Integer> top;

	public static void main(String[] args) {
		init();
		push(1);
		push(2);
		System.out.println("POP DATA : " + pop());
		System.out.println("PEEK DATA : " + peek());
	}

	public static void init() {
		top = BOTTOM;
	}

	public static Boolean isEmpty() {
		if (top == BOTTOM) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	public static void push(Integer data) {
		Node<Integer> temp = new Node<>();
		temp.data = data;
		temp.next = null;
		temp.prev = null;

		if (top == BOTTOM) {
			top = temp;
		} else {
			top.next = temp;
			temp.prev = top;
			top = top.next;
		}
	}

	public static Integer pop() {
		if (isEmpty()) {
			System.out.println("STACK EMPTY...!!");
			return 0;
		}
		Node<Integer> temp = top;
		Integer data = top.data;
		top = temp.prev;
		if (top != null) {
			top.next = null;
		}
		freeNode(temp);
		return data;
	}

	public static Integer peek() {
		Integer item = 0;
		if (!isEmpty()) {
			item = top.data;
		}
		return item;
	}

	private static void freeNode(Node<Integer> temp) {
		temp.prev = null;
		temp.data = null;
		temp.next = null;
	}
}
