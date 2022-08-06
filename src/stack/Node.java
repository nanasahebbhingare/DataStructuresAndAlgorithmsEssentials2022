package stack;

/**
 * Node
 * 
 * @author Bhingare Nanasaheb.
 * @version 1.0
 *
 */
public class Node<T> {
	Node<T> prev;
	T data;
	Node<T> next;

	public Node() {
	}

	public Node(T data, Node<T> next) {
		this.data = data;
		this.next = next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
}