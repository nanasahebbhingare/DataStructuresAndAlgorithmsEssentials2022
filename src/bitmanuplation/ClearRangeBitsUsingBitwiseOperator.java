package bitmanuplation;

/**
 * ClearRangeBitsUsingBitwiseOperator
 * 
 * @author Bhingare Nana.
 * @since 22/05/2022
 * @version 1
 */
public class ClearRangeBitsUsingBitwiseOperator {

	public static void main(String[] args) {
		int inputNo = 15;
		int iPos = 2;
		int jPos = 2;
		int iThBit = clearRangeBit(inputNo, iPos, jPos);
		System.out.println("Ith Bit : " + iThBit);
	}

	private static int clearRangeBit(int inputNo, int iPos, int jPos) {
		int oneLeftShit = (-1) << jPos + 1;
		int secdLeftShit = (1 << iPos) - 1;
		int mask = oneLeftShit | secdLeftShit;
		inputNo = inputNo & mask;
		return inputNo;
	}

}