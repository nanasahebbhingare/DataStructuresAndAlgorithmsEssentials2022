package linkedlist;

import java.util.Scanner;

public class CircularSinglyLinkedList {
	public static void main(String[] args) {
		Node head = null;
		int nodeCnt = 3;
		head = createCircularSinglyLinkedList(head, nodeCnt);
		displayCircularSinglyLinkedList(head);

		// head = addFirstCircularSinglyLinkedList(head);
		// head = addLastCircularSinglyLinkedList(head);
		// head = insertCircularSinglyLinkedList(head, 2);
		// head = deleteFirstCircularSinglyLinkedList(head);
		head = deleteLastCircularSinglyLinkedList(head);
		displayCircularSinglyLinkedList(head);
	}

	public static Node createCircularSinglyLinkedList(Node start, int nodeCnt) {
		System.out.println("Enter You Data :- ");
		Node newNode = null, last = null;
		if (nodeCnt == 0)
			return start;
		start = getNode();
		last = start;
		for (int i = 2; i <= nodeCnt; i++) {
			newNode = getNode();
			last.next = newNode;
			last = newNode;
		}
		last.next = start;
		return start;
	}

	public static Node addFirstCircularSinglyLinkedList(Node start) {
		System.out.println("Enter You Data :- ");
		Node newNode = null, last = null;
		if (start == null) {
			start = getNode();
			last = start;
			last.next = start;
			return start;
		}
		newNode = getNode();
		last = start;
		do {
			last = last.next;
		} while (last.next != start);
		newNode.next = start;
		start = newNode;
		last.next = start;
		return start;
	}

	public static Node addLastCircularSinglyLinkedList(Node start) {
		System.out.println("Enter You Data :- ");
		Node newNode = null, last = null;
		if (start == null) {
			start = getNode();
			last = start;
			last.next = start;
			return start;
		}
		newNode = getNode();
		last = start;
		do {
			last = last.next;
		} while (last.next != start);
		last.next = newNode;
		last = newNode;
		last.next = start;
		return start;
	}

	public static Node insertCircularSinglyLinkedList(Node start, int pos) {
		System.out.println("Enter You Data :- ");
		Node newNode = null, last = null;
		if (start == null) {
			return start;
		}
		newNode = getNode();
		last = start;
		for (int i = 1; i <= pos - 2; i++) {
			last = last.next;
		}
		newNode.next = last.next;
		last.next = newNode;
		return start;
	}

	public static void displayCircularSinglyLinkedList(Node start) {
		System.out.println("You Data :- ");
		Node last = start;
		if (start == null) {
			System.out.println("Empty List :");
			return;
		}
		do {
			System.out.print(last.data);
			last = last.next;
		} while (last != start);
	}

	public static Node deleteFirstCircularSinglyLinkedList(Node start) {
		Node last = null, temp = null;
		if (start == null) {
			return start;
		}
		last = start;
		temp = start;
		do {
			last = last.next;
		} while (last.next != start);
		start = temp.next;
		free(temp);
		last.next = start;
		return start;
	}

	public static Node deleteLastCircularSinglyLinkedList(Node start) {
		Node last = null, temp = null;
		if (start == null) {
			return start;
		}
		last = start;
		do {
			temp = last;
			last = last.next;
		} while (last.next != start);

		temp.next = start;
		free(last);
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

	public static void free(Node node) {
		node = null;
	}
}
