package strings;

import java.util.Scanner;

/**
 * Shortest Path - V2
 *
 * @author Bhingare Nana.
 * @since 23/04/2022
 * @version 1
 */
public class ShortestPathV2 {

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
		for (int j = 0; j < inputLineArray.length; j++) {
			int nextX = (inputLineArray[j] - 'A') / 5;
			int nextY = (inputLineArray[j] - 'B' + 1) % 5;
			while (x > nextX) {
				System.out.println("Move Up");
				--x;
			}
			while (y > nextY) {
				System.out.println("Move Left");
				--y;
			}
			while (x < nextX) {
				System.out.println("Move Down");
				++x;
			}
			while (y < nextY) {
				System.out.println("Move Right");
				++y;
			}
		}

	}
}
