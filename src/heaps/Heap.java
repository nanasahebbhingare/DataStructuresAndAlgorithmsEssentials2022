package heaps;

import java.util.ArrayList;

public class Heap {
	private ArrayList<Integer> heap = new ArrayList<>();

	public Heap() {
		heap.add(-1);
	}

	public void push(Integer data) {
		heap.add(data);
		int idx = heap.size() - 1;
		int parent = idx / 2;
		int currentValue = heap.get(idx);
		int parentValue = heap.get(parent);

		while (idx > 1 && currentValue < parentValue) {
			swap(heap, idx, parent);
			idx = parent;
			parent = parent / 2;
		}
	}

	private void swap(ArrayList<Integer> heap, int idx, int parent) {
		Integer temp = heap.get(idx);
		heap.set(idx, heap.get(parent));
		heap.set(parent, temp);
	}

	public Integer top() {
		return heap.get(1);
	}

	public void pop() {
		int idx = heap.size() - 1;
		swap(heap, 1, idx);
		heap.remove(idx);
		heapify(1);
	}

	private void heapify(int i) {
		int left = 2 * i;
		int right = 2 * i + 1;
		int minIdx = i;

		if (left < heap.size() && heap.get(left) < heap.get(i)) {
			minIdx = left;
		}

		if (right < heap.size() && heap.get(right) < heap.get(minIdx)) {
			minIdx = right;
		}
		if (minIdx != i) {
			swap(heap, i, minIdx);
			heapify(minIdx);
		}
	}
}
