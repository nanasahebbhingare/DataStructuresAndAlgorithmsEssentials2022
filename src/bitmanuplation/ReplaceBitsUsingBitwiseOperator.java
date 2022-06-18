package bitmanuplation;

/**
 * ClearRangeBitsUsingBitwiseOperator
 * 
 * @author Bhingare Nana.
 * @since 22/05/2022
 * @version 1
 */
public class ReplaceBitsUsingBitwiseOperator {
	public static void main(String[] args) {
		int n = 15;
		int m = 2;
		int iPos = 1;
		int jPos = 3;
		int iThBit = replaceBit(n, iPos, jPos, m);
		System.out.println("Ith Bit : " + iThBit);
	}

	private static int replaceBit(int n, int iPos, int jPos, int m) {
		int oneLeftShit = (~0) << jPos + 1;
		int secdLeftShit = (1 << iPos) - 1;
		int clearMask = oneLeftShit | secdLeftShit;
		n = n & clearMask;

		int mask = m << iPos;
		n = n | mask;
		return n;
	}
}