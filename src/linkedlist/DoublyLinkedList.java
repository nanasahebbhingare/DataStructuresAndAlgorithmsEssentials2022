package linkedlist;

import java.util.Scanner;

public class DoublyLinkedList {
	public static void main(String[] args) {
		DoublyNode head = null;
		int nodeCnt = 3;
		head = createDLL(head, nodeCnt);
		displayDLL(head);

		// reverseDLL(head);
		// head = insertDLL(head, 3);
		head = deleteDLL(head, 2);
		displayDLL(head);
	}

	public static DoublyNode createDLL(DoublyNode start, int nodeCnt) {
		System.out.print("Enter Your Data :- ");
		DoublyNode newNode = null, last = null;
		if (start == null) {
			start = getNode();
		}
		last = start;
		for (int i = 1; i < nodeCnt; i++) {
			newNode = getNode();
			last.next = newNode;
			newNode.prev = last;
			last = last.next;
		}
		last.next = null;
		return start;
	}

	public static void reverseDLL(DoublyNode start) {
		DoublyNode last = null;
		if (start == null) {
			System.out.println("Empty DLL...!!");
			return;
		}
		last = start;
		while (last.next != null) {
			last = last.next;
		}
		System.out.println("\nReverse DLL :- ");
		while (last != null) {
			System.out.print(" " + last.data);
			last = last.prev;
		}
	}

	public static void displayDLL(DoublyNode start) {
		System.out.print("Your Linked List Data Is :-  ");
		while (start != null) {
			System.out.print(start.data);
			start = start.next;
		}
	}

	public static DoublyNode deleteDLL(DoublyNode start, int pos) {
		DoublyNode last = null, temp = null;
		if (start == null) {
			System.out.println("Empty DLL...!!");
			return start;
		}
		last = start;
		if (pos == 1) {
			start = start.next;
			start.prev = null;
			freeNode(last);
			return start;
		}
		for (int i = 1; i <= pos - 2; i++) {
			last = last.next;
		}
		temp = last.next;
		last.next = temp.next;
		temp.next.prev = last;
		freeNode(temp);
		return start;
	}

	public static DoublyNode insertDLL(DoublyNode start, int pos) {
		DoublyNode newNode = null, last = null;
		if (start == null) {
			start = getNode();
			return start;
		}
		if (pos == 1) {
			newNode = getNode();
			newNode.next = start;
			start.prev = newNode;
			start = newNode;
		}
		last = start;
		for (int i = 1; i <= pos - 2; i++) {
			last = last.next;
		}
		newNode = getNode();
		newNode.next = last.next;
		newNode.prev = last;
		last.next = newNode;
		return start;
	}

	public static void freeNode(DoublyNode doublyNode) {
		doublyNode.prev = null;
		doublyNode.data = 0;
		doublyNode.next = null;
	}

	private static DoublyNode getNode() {
		Scanner scanner = new Scanner(System.in);
		DoublyNode newNode = new DoublyNode();
		int data = scanner.nextInt();
		newNode.setPrev(null);
		newNode.setData(data);
		newNode.setNext(null);
		return newNode;
	}
}