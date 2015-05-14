package heap;

public class MinHeap extends Heap {

	public MinHeap() {
		super();
	}
	
	public MinHeap(int[] data) {
		super(data);
	}
	
	@Override
	public void add(int data) {
		heap[size] = data;
		int currentIndex = size;
		int parentIndex = getParentIndex(currentIndex);
		while ((parentIndex >= 0) && (heap[currentIndex] < heap[parentIndex])) {
			swapHeapElements(currentIndex, parentIndex);
			currentIndex = parentIndex;
			parentIndex = getParentIndex(currentIndex);
		}
		size++;
	}

	@Override
	public void removeRoot() {
		// TODO Auto-generated method stub
		
	}
}
