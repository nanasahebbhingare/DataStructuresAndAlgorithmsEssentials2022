package queue;

public class QueueUsingLinkedList {

	public final static Node START = null;
	public static Node front = null;
	public static Node rear = null;

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
		if (front == START) {
			return Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	public static void addQ(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		if (rear == null) {
			front = temp;
			rear = temp;
		} else {
			rear.next = temp;
			rear = rear.next;
		}

	}

	public static int deltQ() {
		Node temp = null;
		int data = 0;
		if (!isEmpty()) {
			data = front.data;
			if (front.next == START) {
				free(front);
				rear = null;
				return data;
			}
			temp = front;
			front = front.next;
			free(temp);
		}
		return data;
	}

	public static int peek() {
		int data = 0;
		if (!isEmpty()) {
			data = front.data;
		}
		return data;
	}

	public static void free(Node node) {
		node = null;
	}
}
