package recursion;

/**
 * FactorialUsingRecursion
 * 
 * @author Bhingare Nana.
 * @since 04/06/2022
 * @version 1
 */
public class FactorialUsingRecursion {
	public static void main(String[] args) {
		int n = 5;
		System.out.println("Factonial Of N Is : -" + factorial(n));
	}

	private static int factorial(int n) {
		// Base Case
		if (n == 0)
			return 1;
		// Recursive Case
		int ans = n * factorial(n - 1);
		return ans;
	}
}
