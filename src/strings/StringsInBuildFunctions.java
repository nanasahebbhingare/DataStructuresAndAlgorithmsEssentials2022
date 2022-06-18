package strings;

import java.util.Scanner;

public class StringsInBuildFunctions {
	public static void main(String[] args) {

		// Use Of isEmpty() function
		String inputStr = new String();
		System.out.println(inputStr.isEmpty());// true
		String inputStr1 = null;
		// System.out.println(inputStr1.isEmpty());// NPE
		String inputStr2 = "";
		System.out.println(inputStr2.isEmpty());// true

		String inputStr3 = new String("Nana");
		System.out.println(inputStr3.isEmpty());// false
		String inputStr4 = "Nana";
		System.out.println(inputStr4.isEmpty());// false

		System.out.println("contentEquals : " + ("nana".contentEquals("nana")));

		System.out.println("join : " + (String.join("-", "nana", "bhingare")));

		Scanner scanner = new Scanner(System.in);
		StringBuilder stringBuilder = new StringBuilder();
		while (scanner.hasNext()) {
			String input = scanner.nextLine();
			stringBuilder.append(input + "\n");
			if (input.contains(".")) {
				break;
			}
		}
		System.out.println(stringBuilder);
		scanner.close();
	}
}