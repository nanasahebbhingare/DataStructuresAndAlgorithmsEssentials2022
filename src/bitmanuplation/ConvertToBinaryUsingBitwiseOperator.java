package bitmanuplation;

/**
 * ConvertToBinaryUsingBitwiseOperator
 * 
 * @author Bhingare Nana.
 * @since 22/05/2022
 * @version 1
 */
public class ConvertToBinaryUsingBitwiseOperator {
	public static void main(String[] args) {
		int n = 5;
		int binaryNo = convertToBinary(n);
		System.out.println("Binary No : " + binaryNo);
	}

	private static int convertToBinary(int n) {
		int ans = 0;
		int pow = 1;
		while (n > 0) {
			int lastBit = (n & 1);
			ans += pow * lastBit;
			pow *= 10;
			n = n >> 1;
		}
		return ans;
	}
}
