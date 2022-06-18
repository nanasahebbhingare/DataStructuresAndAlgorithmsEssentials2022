package recursion;

/**
 * FibonaccilUsingRecursion
 * 
 * @author Bhingare Nana.
 * @since 04/06/2022
 * @version 1
 */
class FibonacciUsingRecursion {

	public static void main(String[] args) {
		int n = 5;
		System.out.println("Fibonacci Of N Is : -" + fibonacci(n));
	}

	private static int fibonacci(int n) {
		// Base Case
		if (n == 0 || n == 1)
			return n;
		// Recursive Case
		int f1 = fibonacci(n - 1);
		int f2 = fibonacci(n - 2);
		int ans = f1 + f2; 
		return ans;
	}
}