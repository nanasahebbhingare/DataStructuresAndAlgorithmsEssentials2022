package linkedlist;

public class DoublyNode {
	DoublyNode prev;
	int data;
	DoublyNode next;

	public DoublyNode() {
	}

	public DoublyNode(DoublyNode prev, int data, DoublyNode next) {
		this.prev = prev;
		this.data = data;
		this.next = next;
	}

	public DoublyNode getPrev() {
		return prev;
	}

	public void setPrev(DoublyNode prev) {
		this.prev = prev;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DoublyNode getNext() {
		return next;
	}

	public void setNext(DoublyNode next) {
		this.next = next;
	}
}
