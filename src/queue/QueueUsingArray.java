package queue;

public class QueueUsingArray {
	public final static int SIZE = 5;
	public final static int START = -1;
	public static int Q[] = new int[SIZE];
	public static int front = 0;
	public static int rear = 0;

	public static void main(String[] args) {
		addQ(1);
		addQ(2);
		addQ(3);
		System.out.println("Delete Element : " + deltQ());
		System.out.println("Peek Element : " + peek());
	}

	public static void init() {
		front = START;
		rear = START;
	}

	public static Boolean isEmpty() {
		if (front == rear) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	public static Boolean isFull() {
		if (rear == SIZE - 1) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	public static void addQ(int data) {
		if (!isFull()) {
			rear++;
			Q[rear] = data;
		}
	}

	public static int deltQ() {
		int data = 0;
		if (!isEmpty()) {
			front++;
			data = Q[front];
		}
		return data;
	}

	public static int peek() {
		int data = 0;
		if (!isEmpty()) {
			data = Q[front + 1];
		}
		return data;
	}
}
