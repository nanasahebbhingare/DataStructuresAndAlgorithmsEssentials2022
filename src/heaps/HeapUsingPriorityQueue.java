package heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

public class HeapUsingPriorityQueue {
	public static void main(String[] args) {
		int array[] = { 10, 30, 40, 60, 50 };
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new HeapComparator());

		for (Integer arrayData : array) {
			priorityQueue.add(arrayData);
		}

		while (!priorityQueue.isEmpty()) {
			System.out.println(priorityQueue.peek());
			priorityQueue.poll();
		}
	}
}

class HeapComparator implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {
		return o1 < o2 ? 1 : 0;
	}
}
