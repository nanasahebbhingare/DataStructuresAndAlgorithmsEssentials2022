package recursion;

public class CountZerosUsingRecursion {
	public static void main(String[] args) {
		int n = 100001;
		int zeroCnt = 0;
		zeroCnt = countZeros(n, zeroCnt);
		System.out.println("Zero Cnt : -" + zeroCnt);
	}

	private static int countZeros(int n, int zeroCnt) {
		// base Case
		if (n == 0) {
			return zeroCnt;
		}
		int digit = n % 10;
		if (digit == 0) {
			return countZeros(n / 10, ++zeroCnt);
		} else {
			return countZeros(n / 10, zeroCnt);
		}
	}
}
