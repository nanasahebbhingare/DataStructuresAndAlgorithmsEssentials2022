package bitmanuplation;

/**
 * TwoPowerUsingBitwiseOperator
 * 
 * @author Bhingare Nana.
 * @since 22/05/2022
 * @version 1
 */
public class TwoPowerUsingBitwiseOperator {

	public static void main(String[] args) {
		int n = 16;
		checkTwoPower(n);
	}

	private static void checkTwoPower(int n) {
		if ((n & (n - 1)) == 0) {
			System.out.println(n + " Is Power Of Two...!!");
		} else {
			System.out.println(n + " Is Not Power Of Two...!!");
		}

	}
}
