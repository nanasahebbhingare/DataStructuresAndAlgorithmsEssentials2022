package bitmanuplation;

/**
 * CountBitsUsingBitwiseOperator
 * 
 * @author Bhingare Nana.
 * @since 22/05/2022
 * @version 1
 */
public class CountBitsUsingBitwiseOperator {

	public static void main(String[] args) {
		int n = 15;
		int cnt = countBits(n);
		System.out.println("Bit Counts : " + cnt);
	}

	private static int countBits(int n) {
		int lastBit = 0;
		int cnt = 0;
		while (n > 0) {
			lastBit = (n & 1);
			cnt += lastBit;
			n = n >> 1;
		}
		return cnt;
	}
}