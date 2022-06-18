package bitmanuplation;
/**
 * ClearIthBitUsingBitwiseOperator
 * 
 * @author Bhingare Nana.
 * @since 22/05/2022
 * @version 1
 */
public class ClearIthBitUsingBitwiseOperator {
	public static void main(String[] args) {
		int inputNo = 13;
		int pos = 2;
		int iThBit = clearIthBit(inputNo, pos);
		System.out.println("Ith Bit : " + iThBit);
	}

	private static int clearIthBit(int inputNo, int pos) {
		int oneLeftShit = ~(1 << pos);
		int output =(inputNo & oneLeftShit); 
		return output;
	}
}
