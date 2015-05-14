package five.programming.problems;

/*
 * Write a function that given a list of non negative integers, 
 * arranges them such that they form the largest possible number. 
 * For example, given [50, 2, 1, 9], the largest formed number is 95021.
 */
public class Problem4 {

	public int[] rearrange(int[] input) {
		sort(input, 0, input.length - 1);
		return input;
	}

	// Using Merge Sort
	private void sort(int[] input, int begin, int end) {
		if (begin < end) {
			int mid = (begin + end) / 2;
			sort(input, begin, mid);
			sort(input, mid + 1, end);
			merge(input, begin, mid, end);
		}
	}

	private void merge(int[] input, int begin, int mid, int end) {
		int[] temp = new int[end - begin + 1];
		int left = begin;
		int right = mid + 1;
		int k = 0;
		while (left <= mid && right <= end) {
			if (compare(input[left], input[right]) > 0) {
				temp[k] = input[left];
				left++;
			}
			else {
				temp[k] = input[right];
				right++;
			}
			k++;
		}
		while (left <= mid) {
			temp[k] = input[left];
			left++;
			k++;
		}
		while (right <= end) {
			temp[k] = input[right];
			right++;
			k++;
		}
		copySortedSection(temp, input, begin);
	}

	private void copySortedSection(int[] temp, int[] input, int begin) {
		for (int i = 0; i < temp.length; i++) {
			input[begin + i] = temp[i];
		}
	}

	public int compare(int first, int second) {
		int[] x = toArray(first);
		int[] y = toArray(second);
		int index = 0;
		while(index < x.length && index < y.length && x[index] == y[index]) {
			index++;
		}
		if (index == x.length) {
			return 1;
		}
		if (index == y.length) {
			return -1;
		}
		if (x[index] > y[index])
			return 1;
		else if  (x[index] == y[index])
			return 0;
		else
			return -1;
	}
	
	private int[] toArray(int n) {
		int len = getNumberOfDigits(n);
		int[] arr = new int[len];
		int i = 0;
		while (n / 10 > 0) {
			arr[len - i - 1] = n % 10;
			n /= 10;
			i++;
		}
		return arr;
	}

	private int getNumberOfDigits(int n) {
		int len = 0;
		while (n / 10 > 0) {
			n /= 10;
			len++;
		}
		return len;
	}
}
