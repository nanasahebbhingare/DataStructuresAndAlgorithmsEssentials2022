package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotationCode {
	public static void main(String[] args) {
		int[] inputArray = new int[5];
		List<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		int d = 4;
		List<Integer> ouput = rorateCodeV2(input, d);
		System.out.println(ouput);
	}

	private static List<Integer> rorateCode(List<Integer> input, int d) {
		d = d % input.size();
		swap(input, 0, d - 1);
		swap(input, d, input.size() - 1);
		swap(input, 0, input.size() - 1);
		return input;
	}

	private static void swap(List<Integer> input, int start, int end) {
		int temp = 0;
		while (start < end) {
			temp = input.get(start);
			input.set(start, input.get(end));
			input.set(end, temp);
			start++;
			end--;
		}
	}

	private static List<Integer> rorateCodeV2(List<Integer> input, int d) {
		for (int i = 0; i < d; i++) {
			swapV2(input);
		}
		return input;
	}

	private static void swapV2(List<Integer> input) {
		int temp = input.get(0);
		for (int i = 0; i < input.size() - 1; i++) {
			input.set(i, input.get(i + 1));
		}
		input.set(input.size() - 1, temp);
	}
}
