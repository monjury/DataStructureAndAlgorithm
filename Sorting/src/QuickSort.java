
public class QuickSort {

	public void sort(int[] input) {
		input = quickSort(input, 0, input.length - 1);
		//print(input); 
	}
	
	private int[] quickSort(int[] input, int begin, int end) {
		if(begin < end) {
			int q = partition(input, begin, end);
			quickSort(input, begin, q-1);
			quickSort(input, q+1, end);
		}
		return input;
	}
	
	private int partition(int[] input, int begin, int end){	
		int pivot = input[end];
		int i = begin - 1;
		for(int j = begin; j <= end-1; j++) {
			if(input[j] <= pivot) {
				i++;
				input = swapArrayElements(input, i, j);
			}
		}
		input = swapArrayElements(input, i+1, end);
		print(input); 
		return i+1;
	}

	private int[] swapArrayElements(int[] input, int position1, int position2) {
		int temp = input[position1];
		input[position1] = input[position2];
		input[position2] = temp;
		return input;
	}
	
	private void print(int[] input) {
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " \t ");
		}
		System.out.println();
	}
	
	public static void main(String[] args){
		QuickSort qs = new QuickSort();
		qs.sort(new int[]{2, 8, 7, 1, 3, 5, 6, 4});
		System.out.println();
		qs.sort(new int[]{8, 7, 6, 4});
		
		System.out.println();
		qs.sort(new int[]{'h', 'e', 'l', 'l', 'o'});
	}		
}
