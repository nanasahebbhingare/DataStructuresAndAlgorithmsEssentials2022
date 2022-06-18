package recursion;

/**
 * NumberSpellUsingRecursion
 * 
 * @author Bhingare Nana.
 * @since 12/06/2022
 * @version 1
 */
public class NumberSpellUsingRecursion {

	static String[] spell = { "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE" };

	public static void main(String[] args) {
		int input = 2021;
		numberSpell(input);
	}

	private static void numberSpell(int input) {
		// Base Case
		if (input == 0) {
			return;
		}
		// Recursive Case
		int last_digit = input % 10;
		numberSpell(input / 10);
		System.out.print(spell[last_digit] + " ");
	}

}
