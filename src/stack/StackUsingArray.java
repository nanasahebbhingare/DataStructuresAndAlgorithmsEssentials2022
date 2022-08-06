package stack;


public class StackUsingArray{
	public final static int SIZE = 5;
	public final static int BOTTOM = -1;
	public static int top = 0;
	public static int stack[] = new int[SIZE];

	public static void main(String[] args) {
		init();
		push(1);
		push(2);
		System.out.println("PUSH DATA : ");
		display();
		System.out.println("POP DATA : " + pop());
		System.out.println("AFTER POP DATA : ");
		display();
		System.out.println("PEEK DATA : " + peek());
	}

	public static void init() {
		top = BOTTOM;
	}

	public static void push(int data) {
		if (!isFull()) {
			top++;
			stack[top] = data;
		}
	}

	public static Boolean isEmpty() {
		if (top == BOTTOM) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	public static Boolean isFull() {
		if (top == SIZE - 1) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	public static int pop() {
		int popData = 0;
		if (!isEmpty()) {
			popData = stack[top];
			--top;
		}
		return popData;
	}

	public static int peek() {
		int data = 0;
		if (!isEmpty()) {
			data = stack[top];
		}
		return data;
	}

	public static void display() {
		for (int i = 0; i < top + 1; i++) {
			System.out.print(stack[i]);
		}
		System.out.println();
	}
}