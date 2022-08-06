package recursion.subset;

public class PermutationsOfStringUsingRecursion {
	public static void main(String[] args) {
		String input = "abc";
		String output = "";
		permutationOfString(output, input);
	}

	private static void permutationOfString(String output, String input) {
		if (input.isEmpty()) {
			System.out.println(output);
			return;
		}

		char ch = input.charAt(0);
		for (int i = 0; i <=output.length(); i++) {
			String s = output.substring(0, i);
			String f = output.substring(i, output.length());
			permutationOfString(f + ch + s, input.substring(1));
		}
	}
}
