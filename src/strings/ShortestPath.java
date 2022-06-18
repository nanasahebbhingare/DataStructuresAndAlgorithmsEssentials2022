package strings;

import java.util.Scanner;

/**
 * Shortest Path
 *
 * @author Bhingare Nana.
 * @since 23/04/2022
 * @version 1
 */
public class ShortestPath {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputLine = scanner.nextLine();
		getShortestPath(inputLine);
		scanner.close();
	}

	private static void getShortestPath(String inputLine) {
		char inputLineArray[] = inputLine.toCharArray();
		int x = 0;
		int y = 0;
		for (int i = 0; i < inputLineArray.length; i++) {
			switch (inputLineArray[i]) {
			case 'N':
			case 'n':
				x++;
				break;
			case 'S':
			case 's':
				x--;
				break;
			case 'E':
			case 'e':
				y++;
				break;
			case 'W':
			case 'w':
				y--;
				break;
			default:
				System.out.println("Please enter valid direction...!!!");
				break;
			}
		}
		System.out.println("X :" + x + " Y :" + y);
		if (x >= 0 && y >= 0) {
			while (x > 0) {
				System.out.print("N");
				--x;
			}
			while (y > 0) {
				System.out.print("E");
				--y;
			}
		}
		System.out.println();
	}
}
