package recursion;

public class ReverseNumberUsingArray {
	public static int sum = 0;

	public static void main(String[] args) {
		int n = 1234;
		System.out.println("Before Reverse :- " + n);
		reverseNumber(n);
		System.out.println("After Reverse :- " + sum);
	}

	public static void reverseNumber(int n) {
		if (n == 0)
			return;
		int rem = n % 10;
		sum = sum * 10 + rem;
		reverseNumber(n / 10);
	}
}
