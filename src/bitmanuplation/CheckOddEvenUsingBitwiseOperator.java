package bitmanuplation;

/**
 * CheckOddEvenUsingBitwiseOperator
 * 
 * @author Bhingare Nana.
 * @since 22/05/2022
 * @version 1
 */
public class CheckOddEvenUsingBitwiseOperator {
	public static void main(String[] args) {
		int no = 5;
		if ((no & 1) == 0) {
			System.out.println(no + " Is Even....!!!!");
		} else {
			System.out.println(no + " Is Odd....!!!!");
		}
	}
}