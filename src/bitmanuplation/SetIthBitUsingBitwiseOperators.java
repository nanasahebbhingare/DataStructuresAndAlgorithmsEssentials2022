package bitmanuplation;
/**
 * SetIthBitUsingBitwiseOperators
 * 
 * @author Bhingare Nana.
 * @since 22/05/2022
 * @version 1
 */
public class SetIthBitUsingBitwiseOperators {
	public static void main(String[] args) {
		int inputNo = 5;
		int pos = 1;
		int iThBit = setIthBit(inputNo, pos);
		System.out.println("Ith Bit : " + iThBit);
	}

	private static int setIthBit(int inputNo, int pos) {
		int oneLeftShit = 1 << pos;
		return (inputNo | oneLeftShit);
	}
}
