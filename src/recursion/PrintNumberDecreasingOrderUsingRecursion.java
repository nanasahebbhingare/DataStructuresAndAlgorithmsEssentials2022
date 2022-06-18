package recursion;

/**
 * PrintNumberDecreasingOrderUsingRecursion
 * 
 * @author Bhingare Nana.
 * @since 04/06/2022
 * @version 1
 */
public class PrintNumberDecreasingOrderUsingRecursion {

	public static void main(String[] args) {
		int input = 5;
		System.out.print("Decreasing Order : - ");
		decreasingOrder(input);
	}

	private static void decreasingOrder(int input) {
		// Base Case
		if (input == 0)
			return;
		// Recursive Case
		System.out.print(input + " ");
		decreasingOrder(input - 1);
	}

}
