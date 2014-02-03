
public class QuickSort {

	public void sort(int[] input) {
		
		// 1. Find Pivot
		// 2. Swap elements to right and left of pivot 
		// 3. recurse same for right and left array section as long as their size > 2
		
		input = process(input, 0, input.length - 1);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " \t ");
		}
		System.out.println();
	}
	
	private int[] process(int[] input, int start, int end) {
		if(start < end) {			
			int pivot = partition(input, start, end);
			partition(input, start, pivot-1);
			partition(input, pivot+1, end);
		}
		return input;
	}
	
	private int partition(int[] input, int start, int end){	
		int pivot = start;
		start++;
		while(start < end) {
			if(input[start] < input[pivot]) {
				int temp = input[start];
				input[start] = input[pivot];
				input[pivot] = temp;
				pivot = start;
			}
			start++;
		}
		return pivot;
	}
	
	public static void main(String[] args){
		QuickSort qs = new QuickSort();
		qs.sort(new int[]{7,6,5,4});
		
	}
		
}
