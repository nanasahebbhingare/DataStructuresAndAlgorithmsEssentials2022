package binarytree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import binarysearchtree.Node;

public class BinaryTreeOperations {
	// public static Integer[] input = { 1, 2, 4, -1, -1, 5, 7, -1, -1, -1, 3,
	// -1, 6, -1, -1 };
	public static Integer[] input = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
	public static Integer[] inputSub = { 2, 4, 5, -1, -1, -1, -1 };
	public static Integer index = -1;
	public static Queue<Node<Integer>> queue = new LinkedList<>();

	public static void main(String[] args) {

		System.out.println("Ur data : - " + Arrays.asList(input));
		Node<Integer> root = buildTree(input);
		Node<Integer> subRoot = buildTree(inputSub);
		// System.out.println("Total No of Nodes : - " + nodeCounts(root));
		// System.out.println("Sum of Nodes : - " + sumOfnodes(root));
		// System.out.println("Height Of Tree : - " + heightOfTree(root));
		// System.out.println("Diameter Of Tree : - " + diameterOfTree(root));
		System.out.println("Sub Of Tree : - " + isSubTree(root, subRoot));
	}

	private static Node<Integer> buildTree(Integer[] input) {
		++index;
		if (input[index] == -1) {
			return null;
		}
		Node<Integer> root = new Node<Integer>(input[index]);
		root.left = buildTree(input);
		root.right = buildTree(input);
		return root;
	}

	private static Integer nodeCounts(Node<Integer> root) {
		if (root == null) {
			return 0;
		}
		return 1 + (nodeCounts(root.left) + nodeCounts(root.right));
	}

	private static Integer sumOfnodes(Node<Integer> root) {
		Integer data = 0;
		if (root == null) {
			return 0;
		}
		data = root.data;
		return data + (sumOfnodes(root.left) + sumOfnodes(root.right));
	}

	private static Integer heightOfTree(Node<Integer> root) {
		if (root == null) {
			return 0;
		}
		Integer leftHeight = heightOfTree(root.left);
		Integer rightHeight = heightOfTree(root.right);
		return 1 + Math.max(leftHeight, rightHeight);
	}

	public static Integer diameterOfTree(Node<Integer> root) {
		if (root == null) {
			return 0;
		}

		Integer d1 = diameterOfTree(root.left);
		Integer d2 = diameterOfTree(root.right);
		Integer d3 = 1 + heightOfTree(root.left) + heightOfTree(root.right);
		return Math.max(d1, Math.max(d2, d3));
	}

	public static Boolean isSubTree(Node<Integer> root, Node<Integer> subRoot) {
		if (subRoot == null)
			return true;
		if (root == null)
			return false;
		if (root.data == subRoot.data) {
			if (isIdentical(root, subRoot)) {
				return true;
			}
		}

		return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
	}

	private static boolean isIdentical(Node<Integer> root, Node<Integer> subRoot) {
		if (root == null && subRoot == null)
			return true;
		if (root == null || subRoot == null)
			return false;

		if (root.data == subRoot.data) {
			return isIdentical(root.left, subRoot.left) && isIdentical(root.right, subRoot.right);
		}
		return false;
	}
}