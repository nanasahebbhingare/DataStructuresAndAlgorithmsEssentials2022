package binarytree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

import binarysearchtree.Node;

public class PreorderTree {
	public static Scanner scanner = new Scanner(System.in);
	public static Integer[] input = { 1, 2, 4, -1, -1, 5, 7, -1, -1, -1, 3, -1, 6, -1, -1 };
	public static Integer index = -1;
	public static Queue<Node<Integer>> queue = new LinkedList<>();

	public static void main(String[] args) {
		System.out.println("Ur data : - " + Arrays.asList(input));
		// Node<Integer> root = buildTree();
		Node<Integer> root = levelorderBuild();
		/*
		 * System.out.print("Pre-Order Data :- "); printPreorderTree(root);
		 * System.out.print("\nIn-Order Data :- "); printInorderTree(root);
		 * System.out.print("\nPost-Order Data :- "); printPostorderTree(root);
		 */
		/*
		 * System.out.print("\nLevel-Order Data :- ");
		 * printLevelorderTree(root);
		 */

		// System.out.print("\nHeight Of Tree :- " + heightOfTree(root));
		// System.out.print("\nKth Level :- " + kThLevel(root, 2));
		// System.out.print("\nDaimeter Of Tree :- " + diameterOfTree(root));
		HeightDiameter output = diameterOfTreeOptimize(root);
		System.out.print("\nDaimeter Of Tree :- " + output.diameter + " Height :- " + output.height);

	}

	/*
	 * public static Node<Integer> buildTree() { Integer data = new Integer(-1);
	 * Node<Integer> node = null; data = scanner.nextInt();
	 * 
	 * if (data == -1) { return null; } node = new Node<Integer>(data);
	 * node.left = buildTree(); node.right = buildTree(); return node; }
	 */

	public static Node<Integer> buildTree() {
		Integer data = null;
		Node<Integer> node = null;
		data = input[++index];
		if (data == -1) {
			return null;
		}
		node = new Node<Integer>(data);
		node.left = buildTree();
		node.right = buildTree();
		return node;
	}

	public static void printPreorderTree(Node<Integer> root) {
		if (root == null)
			return;
		System.out.print(" " + root.data);
		printPreorderTree(root.left);
		printPreorderTree(root.right);
	}

	public static void printInorderTree(Node<Integer> root) {
		if (root == null)
			return;
		printInorderTree(root.left);
		System.out.print(" " + root.data);
		printInorderTree(root.right);
	}

	public static void printPostorderTree(Node<Integer> root) {
		if (root == null)
			return;
		printPostorderTree(root.left);
		printPostorderTree(root.right);
		System.out.print(" " + root.data);
	}

	public static Node<Integer> levelorderBuild() {
		Integer data = scanner.nextInt();
		// Root created
		Node<Integer> root = new Node<Integer>(data);
		queue.add(root);

		while (!queue.isEmpty()) {
			Node<Integer> current = queue.peek();
			queue.poll();

			Integer leftData = scanner.nextInt();
			Integer rightData = scanner.nextInt();

			if (leftData != -1) {
				current.left = new Node<Integer>(leftData);
				queue.add(current.left);
			}

			if (rightData != -1) {
				current.right = new Node<Integer>(rightData);
				queue.add(current.right);
			}
		}
		return root;
	}

	public static void printLevelorderTree(Node<Integer> root) {
		queue.add(root);
		queue.add(null);
		while (!queue.isEmpty()) {
			Node<Integer> temp = queue.peek();
			if (temp == null) {
				System.out.println();
				queue.poll();
				if (!queue.isEmpty()) {
					queue.add(null);
				}
			} else {
				queue.poll();
				System.out.print(temp.data);
				if (temp.left != null) {
					queue.add(temp.left);
				}
				if (temp.right != null) {
					queue.add(temp.right);
				}
			}
		}
		return;
	}
	
	
	public static List<Integer> kThLevel(Node<Integer> root, Integer k) {
		List<Integer> kthLevelDataList = new ArrayList<Integer>();
		Integer levelcnt = 0;
		queue.add(root);
		queue.add(null);
		while (!queue.isEmpty()) {
			Node<Integer> current = queue.peek();
			if (current == null) {
				queue.poll();
				levelcnt++;
				if (levelcnt == k) {
					return kthLevelDataList;
				}
				kthLevelDataList = new ArrayList<Integer>();
				if (!queue.isEmpty()) {
					queue.add(null);
				}
			} else {
				kthLevelDataList.add(current.data);
				queue.poll();
				if (current.left != null) {
					queue.add(current.left);
				}
				if (current.right != null) {
					queue.add(current.right);
				}
			}
		}
		return kthLevelDataList;
	}

	public static Integer heightOfTree(Node<Integer> root) {
		if (root == null) {
			return 0;
		}
		Integer h1 = heightOfTree(root.left);
		Integer h2 = heightOfTree(root.right);
		return 1 + Math.max(h1, h2);
	}

	public static Integer diameterOfTree(Node<Integer> root) {
		if (root == null) {
			return 0;
		}
		Integer h1 = heightOfTree(root.left);
		Integer h2 = heightOfTree(root.right);
		Integer d1 = h1 + h2;
		Integer d2 = diameterOfTree(root.left);
		Integer d3 = diameterOfTree(root.right);
		return Math.max(d1, Math.max(d2, d3));
	}

	public static HeightDiameter diameterOfTreeOptimize(Node<Integer> root) {
		HeightDiameter hd = new HeightDiameter();
		if (root == null) {
			hd.height = hd.diameter = 0;
			return hd;
		}

		HeightDiameter leftHD = diameterOfTreeOptimize(root.left);
		HeightDiameter rightHD = diameterOfTreeOptimize(root.right);

		hd.height = 1 + Math.max(leftHD.height, rightHD.height);
		Integer d1 = leftHD.height + rightHD.height;
		Integer d2 = leftHD.diameter;
		Integer d3 = rightHD.diameter;
		hd.diameter = Math.max(d1, Math.max(d2, d3));
		return hd;
	}
}