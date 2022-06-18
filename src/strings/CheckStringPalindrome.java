package strings;

import java.util.Scanner;

/**
 * Largest String V1
 *
 * @author Bhingare Nana.
 * @since 23/04/2022
 * @version 1
 */
public class CheckStringPalindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputLine = scanner.nextLine();
		if (checkStringPalindrome(inputLine)) {
			System.out.println("Palindrome..........!!!");
		} else {
			System.out.println("Not Palindrome..........!!!");
		}
		scanner.close();
	}

	private static boolean checkStringPalindrome(String inputLine) {
		int i = 0, j = inputLine.length()-1;
		while (i < j) {
			if (inputLine.charAt(i) != inputLine.charAt(j)) {
				return Boolean.FALSE;
			}
			++i;
			--j;
		}
		return Boolean.TRUE;
	}
}