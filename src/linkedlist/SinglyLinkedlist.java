package linkedlist;

import java.util.Scanner;

public class SinglyLinkedlist {
	public static void main(String[] args) {
		Node head = null;
		int nodeCnt = 3;
		head = createSinglyLinkedlist(head, nodeCnt);
		displaySinglyLinkedlist(head);

		// head = addFirstSinglyLinkedlist(head);
		// head = addLastSinglyLinkedlist(head);
		// head = insertSinglyLinkedlist(head, 2);
		// head = deleteFirstSinglyLinkedlist(head);
		// head = deleteLastSinglyLinkedlist(head);
		// head = deleteSinglyLinkedlist(head, 3);
		head = reverseSinglyLinkedlist(head);
		displaySinglyLinkedlist(head);
	}

	public static Node createSinglyLinkedlist(Node start, int nodeCnt) {
		System.out.print("Enter Your Data :- ");
		if (start == null) {
			start = getNode();
			start.next = null;
		}
		Node temp = start;
		for (int pos = 1; pos < 3; pos++) {
			Node newNode = getNode();
			temp.next = newNode;
			temp = newNode;
		}
		temp.next = null;
		return start;
	}

	private static Node getNode() {
		Scanner scanner = new Scanner(System.in);
		Node newNode = new Node();
		int data = scanner.nextInt();
		newNode.setData(data);
		newNode.setNext(null);
		return newNode;
	}

	public static void displaySinglyLinkedlist(Node start) {
		System.out.print("Your Linked List Data Is :-  ");
		while (start != null) {
			System.out.print(start.data);
			start = start.next;
		}
	}

	public static Node addFirstSinglyLinkedlist(Node start) {
		System.out.print("\n Enter Your Data :- ");
		if (start == null) {
			start = getNode();
			start.next = null;
		}
		Node newNode = getNode();
		newNode.next = start;
		start = newNode;
		return start;
	}

	public static Node addLastSinglyLinkedlist(Node start) {
		System.out.print("\nEnter Your Data :- ");
		if (start == null) {
			start = getNode();
			start.next = null;
		}
		Node temp = start;
		while (temp.next != null) {
			temp = temp.next;
		}
		Node newNode = getNode();
		temp.next = newNode;
		temp = newNode;
		temp.next = null;
		return start;
	}

	public static Node insertSinglyLinkedlist(Node start, int pos) {
		System.out.print("\nEnter Your Data :- ");
		Node temp = null;
		Node newNode = null;
		if (start == null) {
			start = getNode();
			start.next = null;
			return start;
		}
		temp = start;
		newNode = getNode();
		if (pos == 1) {
			newNode.next = temp;
			temp = newNode;
		}

		for (int i = 1; i <= pos - 2; i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		return start;
	}

	public static Node deleteFirstSinglyLinkedlist(Node start) {
		Node temp = null;
		if (start == null) {
			System.out.println("List Is Empty..!!");
			return start;
		}
		temp = start;
		start = temp.next;
		free(temp);
		return start;
	}

	public static Node deleteLastSinglyLinkedlist(Node start) {
		Node temp = null, last = null;
		if (start == null) {
			System.out.println("List Is Empty..!!");
			return start;
		}
		last = start;
		while (last.next != null) {
			temp = last;
			last = last.next;
		}
		temp.next = null;
		free(last);
		return start;
	}

	public static Node deleteSinglyLinkedlist(Node start, int pos) {
		Node temp = null, last = null;
		if (start == null) {
			System.out.println("List Is Empty..!!");
			return start;
		}
		if (pos == 1) {
			return deleteFirstSinglyLinkedlist(start);
		}
		last = start;
		for (int i = 1; i <= pos - 1; i++) {
			temp = last;
			last = last.next;
		}
		temp.next = last.next;
		free(last);
		return start;
	}

	public static Node reverseSinglyLinkedlist(Node start) {
		Node prev = null, curr = null;
		if (start == null) {
			return start;
		}
		curr = start;
		while (curr != null) {
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}

	public static void free(Node node) {
		node = null;
	}
}
