package recursion;

/**
 * TilingProblemSolution
 * 
 * @author Bhingare Nana.
 * @since 12/06/2022
 * @version 1
 */
public class TilingProblemSolution {
	public static void main(String[] args) {
		int input = 5;
		System.out.println("Tiling Count :- " + tilingProblem(input));
	}

	private static int tilingProblem(int input) {
		if (input <= 3)
			return 1;
		input += tilingProblem(input - 1) + tilingProblem(input - 4);
		return input;
	}
}