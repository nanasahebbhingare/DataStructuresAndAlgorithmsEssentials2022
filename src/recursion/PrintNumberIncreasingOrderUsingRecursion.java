package recursion;

/**
 * PrintNumberIncreasingOrderUsingRecursion
 * 
 * @author Bhingare Nana.
 * @since 04/06/2022
 * @version 1
 */
public class PrintNumberIncreasingOrderUsingRecursion {

	public static void main(String[] args) {
		int input = 5;
		System.out.print("Decreasing Order : - ");
		increasingOrder(input);
	}

	private static void increasingOrder(int input) {
		// Base Case
		if (input == 0)
			return;
		// Recursive Case
		increasingOrder(input - 1);
		System.out.print(input+" ");
	}
}
