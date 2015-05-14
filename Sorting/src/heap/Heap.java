package heap;

public abstract class Heap {

	int[] heap;
	int size;

	public Heap() {
		heap = new int[100];
		size = 0;
	}

	public Heap(int[] data) {
		heap = new int[100];
		for (int i = 0; i < data.length; i++) {
			heap[i] = data[i];
		}
		size = data.length;
	}

	public abstract void add(int data);

	public abstract void removeRoot();

	protected void swapHeapElements(int index1, int index2) {
		int temp = heap[index1];
		heap[index1] = heap[index2];
		heap[index2] = temp;
	}

	protected int getParentIndex(int currentIndex) {
		int parentIndex = (currentIndex - 1) / 2;
		if (currentIndex < 1 || currentIndex >= size)
			return -1;
		else
			return parentIndex;
	}

	protected int getLeftChildIndex(int currentIndex) {
		int leftChildIndex = (2 * currentIndex) + 1;
		if(currentIndex < 0 || leftChildIndex >= size ) {
			return -1;
		}
		return leftChildIndex;
	}

	protected int getRightChildIndex(int currentIndex) {
		int rightChildIndex = (2 * currentIndex) + 2;
		if(currentIndex < 0 || rightChildIndex >= size ) {
			return -1;
		}
		return rightChildIndex;
	}
}
