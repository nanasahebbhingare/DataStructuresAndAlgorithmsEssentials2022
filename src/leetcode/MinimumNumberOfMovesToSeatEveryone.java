package leetcode;

import java.util.Arrays;

public class MinimumNumberOfMovesToSeatEveryone {
	public static void main(String[] args) {
		int[] seats = { 3, 1, 5 };
		int[] students = { 2, 7, 4 };
		System.out.println(minMovesToSeat(seats, students));
	}

	public static int minMovesToSeat(int[] seats, int[] students) {
		int moveSum = 0;
		Arrays.sort(seats);
		Arrays.sort(students);
		for (int i = 0; i < students.length; i++) {
			moveSum += Math.abs(seats[i] - students[i]);
		}
		return moveSum;
	}
}