package linkedlist;

/**
 * Node
 * 
 * @author Bhingare Nanasaheb.
 * @version 1.0
 *
 */
public class Node {
	int data;
	Node next;

	public Node() {
	}

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}
}
