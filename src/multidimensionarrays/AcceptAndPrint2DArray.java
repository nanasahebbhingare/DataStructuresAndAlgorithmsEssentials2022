package multidimensionarrays;

import java.util.Scanner;

/**
 * AcceptAndPrint2DArray
 * 
 * @author Bhingare Nana.
 * @since 08/05/2022
 * @version 1
 */
public class AcceptAndPrint2DArray {
	public static void main(String[] args) {
		int row = 0, column = 0;
		int inputArray[][] = new int[10][10];
		System.out.println("Enter Row And Column :");
		Scanner scanner = new Scanner(System.in);
		row = scanner.nextInt();
		column = scanner.nextInt();
		accept2DArray(inputArray, row, column);
		print2DArray(inputArray, row, column);
		scanner.close();
	}

	private static void print2DArray(int[][] inputArray, int row, int column) {
		System.out.println("2D Array Element: ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(" " + inputArray[i][j]);
			}
			System.out.println();
		}
	}

	private static void accept2DArray(int[][] inputArray, int row, int column) {
		System.out.println("Enter 2D Array Element: ");
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				inputArray[i][j] = scanner.nextInt();
			}
		}
		scanner.close();
	}
}