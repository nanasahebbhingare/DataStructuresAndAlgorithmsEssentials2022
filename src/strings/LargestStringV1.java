package strings;

import java.util.Scanner;

/**
 * Largest String V1
 *
 * @author Bhingare Nana.
 * @since 23/04/2022
 * @version 1
 */
public class LargestStringV1 {
	public static void main(String[] args) {
		System.out.println("How Many Line You Wants : ");
		Scanner scanner = null, scannerCnt = null;
		scannerCnt = new Scanner(System.in);
		int n = scannerCnt.nextInt();
		System.out.println("Please Enter Lines : ");
		int maxStrLength = 0;
		String maxStr = null;
		while (n > 0) {
			scanner = new Scanner(System.in);
			String inputLine = scanner.nextLine();
			if (maxStrLength < inputLine.length()) {
				maxStr = inputLine;
				maxStrLength = inputLine.length();
			}
			--n;
		}
		System.out.println("Max String : " + maxStr);
		scannerCnt.close();
		scanner.close();
	}
}
