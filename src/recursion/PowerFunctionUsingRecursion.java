package recursion;

/**
 * PowerFunctionUsingRecursion
 * 
 * @author Bhingare Nana.
 * @since 12/06/2022
 * @version 1
 */
public class PowerFunctionUsingRecursion {
	public static void main(String[] args) {
		int p = 5;
		int n = 3;
		System.out.print("Power Of :- " + powerFunction(p, n));
	}

	private static int powerFunction(int p, int n) {
		// Base Case
		if (n == 0)
			return 1;
		// Recursive Case
		return p * powerFunction(p, n - 1);
	}
}
