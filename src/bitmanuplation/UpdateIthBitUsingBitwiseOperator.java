package bitmanuplation;

/**
 * UpdateIthBitUsingBitwiseOperator
 * 
 * @author Bhingare Nana.
 * @since 22/05/2022
 * @version 1
 */
public class UpdateIthBitUsingBitwiseOperator {
	public static void main(String[] args) {
		int inputNo = 5;
		int pos = 1;
		int updateValue = 1;
		int iThBit = updateIthBit(inputNo, pos, updateValue);
		System.out.println("Ith Bit : " + iThBit);
	}

	private static int updateIthBit(int inputNo, int pos, int updateValue) {
		// Clear position
		int oneLeftShit = ~(1 << pos);
		int output = (inputNo & oneLeftShit);

		int mask = updateValue << pos;
		// Update Bit
		output = output & mask;
		return output;
	}
}
