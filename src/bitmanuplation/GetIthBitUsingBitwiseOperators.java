package bitmanuplation;

/**
 * CheckOddEvenUsingBitwiseOperator
 * 
 * @author Bhingare Nana.
 * @since 22/05/2022
 * @version 1
 */
public class GetIthBitUsingBitwiseOperators {
	public static void main(String[] args) {
		int inputNo = 5;
		int pos = 2;
		int iThBit = getIthBit(inputNo, pos);
		System.out.println("Ith Bit : " + iThBit);
	}

	private static int getIthBit(int inputNo, int pos) {
		int oneLeftShit = 1 << pos;
		return (inputNo & oneLeftShit) == 0 ? 0 : 1;
	}
}
