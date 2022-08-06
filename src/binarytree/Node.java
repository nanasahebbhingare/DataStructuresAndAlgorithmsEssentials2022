package binarytree;

public class Node<T> {
	public Node<T> left;
	public T data;
	public Node<T> right;

	public Node(T data) {
		this.left = null;
		this.data = data;
		this.right = null;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
}