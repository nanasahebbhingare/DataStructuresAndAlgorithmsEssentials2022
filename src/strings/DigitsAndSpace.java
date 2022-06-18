package strings;

import java.util.Scanner;

/**
 * Digits And Space
 *
 * @author Bhingare Nana.
 * @since 16/04/2022
 * @version 1
 */
public class DigitsAndSpace {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputLine = scanner.nextLine();
		getDigitsAndSpace(inputLine);
		scanner.close();
	}

	private static void getDigitsAndSpace(String inputLine) {
		char inoutLineArray[] = inputLine.toCharArray();
		int digitCnt = 0;
		int spaceCnt = 0;
		int charCnt = 0;
		for (char ch : inoutLineArray) {
			if (ch >= '0' && ch <= '9') {
				++digitCnt;
			} else if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				charCnt++;
			} else if (ch == ' ' || ch == '\t') {
				spaceCnt++;
			}
		}
		System.out.println("Digit Cnt " + digitCnt);
		System.out.println("Space Cnt " + spaceCnt);
		System.out.println("Char Cnt " + charCnt);
	}
}
