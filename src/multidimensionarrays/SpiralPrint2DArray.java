package multidimensionarrays;

import java.util.Scanner;

/**
 * SpiralPrint2DArray
 * 
 * @author Bhingare Nana.
 * @since 08/05/2022
 * @version 1
 */
public class SpiralPrint2DArray {
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
		int startRow = 0;
		int endRow = row - 1;
		int startColumn = 0;
		int endColumn = column - 1;

		while (startColumn <= endColumn && startRow <= endRow) {
			for (int upperColumn = startColumn; upperColumn <= endColumn; upperColumn++) {
				System.out.print(inputArray[startRow][upperColumn] + " ");
			}

			for (int rightRow = startRow + 1; rightRow <= endRow; rightRow++) {
				if (startRow == endRow)
					break;
				System.out.print(inputArray[rightRow][endColumn] + " ");
			}

			for (int lowerColumn = endColumn - 1; lowerColumn >= startColumn; --lowerColumn) {
				System.out.print(inputArray[endRow][lowerColumn] + " ");
			}
			for (int leftRow = endRow - 1; leftRow >= startRow + 1; --leftRow) {
				if (startColumn == endColumn)
					break;
				System.out.print(inputArray[leftRow][startColumn] + " ");
			}
			++startRow;
			--endRow;
			++startColumn;
			--endColumn;
		}
		System.out.println();
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
