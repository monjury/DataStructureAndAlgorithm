package heap;

public class MaxHeap extends Heap {

	public MaxHeap() {
		super();
	}

	public MaxHeap(int[] data) {
		super(data);
	}

	@Override
	public void add(int data) {
		heap[size] = data;
		int currentIndex = size;
		size++;
		int parentIndex = getParentIndex(currentIndex);
		while ((parentIndex >= 0) && (heap[currentIndex] > heap[parentIndex])) {
			swapHeapElements(currentIndex, parentIndex);
			currentIndex = parentIndex;
			parentIndex = getParentIndex(currentIndex);
		}
	}

	@Override
	public void removeRoot() {
		heap[0] = heap[size - 1];
		heap[size - 1] = 0;
		size--;
		int currentIndex = 0;
		int leftChildIndex = getLeftChildIndex(currentIndex);
		int rightChildIndex = getRightChildIndex(currentIndex);
		while ((leftChildIndex >= 0 && rightChildIndex >= 0) && (heap[currentIndex] < heap[leftChildIndex] || heap[currentIndex] < heap[rightChildIndex])) {
			if (heap[leftChildIndex] > heap[rightChildIndex]) {
				swapHeapElements(currentIndex, leftChildIndex);
				currentIndex = leftChildIndex;
			}
			else {
				swapHeapElements(currentIndex, rightChildIndex);
				currentIndex = rightChildIndex;
			}
			leftChildIndex = getLeftChildIndex(currentIndex);
			rightChildIndex = getRightChildIndex(currentIndex);
		}
	}
}
