package binarysearchtree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchOperations {
	public static Integer[] input = { 8, 3, 10, 1, 6, 14, 4, 7, 13 };
	public static Integer index = -1;
	public static Queue<Integer> queue = new LinkedList<>();

	public static void main(String[] args) {
		System.out.println("Ur data : - " + Arrays.asList(input));
		Node<Integer> root = null;
		for (Integer inputData : input) {
			root = creationBST(root, inputData);
		}
		System.out.println("Print In-Order data : - ");
		printInorderBST(root);
		// System.out.println("\nSearch Found : - " + searchBST(root, 4));
		/*
		 * System.out.println("\nAfter Removal Data : "); root =
		 * removeElmBST(root, 8); printInorderBST(root);
		 */
		/*
		 * System.out.println("\nRange Data :- "); printRangeInBST(root, 5, 12);
		 */
		System.out.println("\nPaths :- ");
		printPathsBST(root, queue);
	}

	private static Node<Integer> creationBST(Node<Integer> root, Integer input) {
		if (root == null) {
			return new Node<Integer>(input);
		}
		if (input < root.data) {
			root.left = creationBST(root.left, input);
		} else {
			root.right = creationBST(root.right, input);
		}
		return root;
	}

	private static void printInorderBST(Node<Integer> root) {
		if (root == null) {
			return;
		}
		printInorderBST(root.left);
		System.out.print(" " + root.data);
		printInorderBST(root.right);
	}

	private static Boolean searchBST(Node<Integer> root, Integer key) {
		// BaseCase
		if (root == null) {
			return Boolean.FALSE;
		}
		if (root.data == key) {
			return Boolean.TRUE;
		}
		if (key < root.data) {
			return searchBST(root.left, key);
		} else {
			return searchBST(root.right, key);
		}
	}

	private static Node<Integer> removeElmBST(Node<Integer> root, Integer key) {
		if (root == null) {
			return null;
		}
		if (key < root.data) {
			root.left = removeElmBST(root.left, key);
		} else if (key > root.data) {
			root.right = removeElmBST(root.right, key);
		} else {
			// When current node match with the key.
			// No Children
			if (root.left == null && root.right == null) {
				freeNode(root);
				root = null;
			} else if (root.left == null) {
				Node<Integer> temp = root;
				root = root.right;
				freeNode(temp);
			} else if (root.right == null) {
				Node<Integer> temp = root;
				root = root.left;
				freeNode(temp);
			} else {
				Node<Integer> temp = findMin(root.right);
				root.data = temp.data;
				root.right = removeElmBST(root.right, temp.data);
			}
		}
		return root;
	}

	private static Node<Integer> findMin(Node<Integer> root) {
		while (root.left != null) {
			root = root.left;
		}
		return root;
	}

	private static void freeNode(Node<Integer> root) {
		root.left = null;
		root.data = null;
		root.right = null;
	}

	private static void printRangeInBST(Node<Integer> root, Integer key1, Integer key2) {
		// BaseCase
		if (root == null) {
			return;
		}
		if (root.data >= key1 && root.data <= key2) {
			printRangeInBST(root.left, key1, key2);
			System.out.print(" " + root.data);
			printRangeInBST(root.right, key1, key2);
		} else if (root.data > key2) {
			printRangeInBST(root.left, key1, key2);
		} else {
			printRangeInBST(root.right, key1, key2);
		}
	}

	private static void printPathsBST(Node<Integer> root, Queue<Integer> queue) {
		// BaseCase
		if (root == null) {
			return;
		}
		if (root.left == null & root.right == null) {
			for (Integer inputData : queue) {
				System.out.print(inputData + "->");
			}
			System.out.println(root.data);
			return;
		}
		queue.add(root.data);
		printPathsBST(root.left, queue);
		printPathsBST(root.right, queue);
		// backtracking
		queue.remove();
	}
}
