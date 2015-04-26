package nlogn;

public class MergeSort {

	public int[] sortInitiator(int[] input) {
		mergeSort(input, 0, input.length - 1);
		return input;
	}

	private void mergeSort(int[] input, int begin, int end) {
		if (begin < end) {
			int mid = (begin + end) / 2;
			mergeSort(input, begin, mid);
			mergeSort(input, mid + 1, end);
			merge(input, begin, mid, end);
		}
	}

	private void merge(int[] input, int begin, int mid, int end) {
		int[] temp = new int[end - begin + 1];
		int left = begin;
		int right = mid + 1;
		int k = 0;
		while (left <= mid && right <= end) {
			if (input[left] < input[right]) {
				temp[k] = input[left];
				left++;
			} else {
				temp[k] = input[right];
				right++;
			}
			k++;
		}
		if (left <= mid) {
			while (left <= mid) {
				temp[k] = input[left];
				left++;
				k++;
			}

		} else {
			while (right <= end) {
				temp[k] = input[right];
				right++;
				k++;
			}
		}
		for (int i = 0; i < temp.length; i++) {
			input[begin + i] = temp[i];
		}
	}
}
