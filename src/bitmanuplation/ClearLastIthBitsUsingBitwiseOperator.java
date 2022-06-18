package bitmanuplation;

/**
 * ClearLastIthBitsUsingBitwiseOperator
 * 
 * @author Bhingare Nana.
 * @since 22/05/2022
 * @version 1
 */
public class ClearLastIthBitsUsingBitwiseOperator {

	public static void main(String[] args) {
		int inputNo = 15;
		int pos = 2;
		int iThBit = clearLastIthBit(inputNo, pos);
		System.out.println("Ith Bit : " + iThBit);
	}

	private static int clearLastIthBit(int inputNo, int pos) {
		int oneLeftShit = (~0) << pos;
		inputNo = inputNo & oneLeftShit;
		return inputNo;
	}

}
