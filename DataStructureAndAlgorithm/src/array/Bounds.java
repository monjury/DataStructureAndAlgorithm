package array;

public class Bounds {
	
	/*		
		Given an int array array, find upper and lower bound of a key 

		findBounds(int[] array, int key) =>(int low, int high)
		* low is the lowest index at which the key occurs in the array
		* high is the highest index at which the key occurs in the array

		Time constraint - O(log n)

		findBounds(array, 4) =>(1, 5)
	 */
	
	public int[] findBounds(int[] input, int key) {
		int left = findLeftBound(input, key, 0, input.length-1);
		int right = findRightBound(input, key, 0, input.length-1);
		return new int[]{left, right};
	}

	private int findLeftBound(int[] input, int key, int left, int right) {
		if(left > right) {
			return -1;
		}
		if(left == right) {
			if(input[left] == key) {
				return left;
			}
			else {
				return -1;
			}
		}
		else {
			int mid = (left + right)/2;
			if(key == input[mid]) {
				return findLeftBound(input, key, left, mid);
			}
			else if(key < input[mid]) {
				return findLeftBound(input, key, left, mid - 1);
			}
			else {
				return findLeftBound(input, key, mid + 1, right);
			}
		}
	}
	
	private int findRightBound(int[] input, int key, int left, int right) {
		if(left > right) {
			return -1;
		}
		if(left == right) {
			if(input[right] == key) {
				return right;
			}
			else {
				return -1;
			}
		}
		else {
			int mid = ((left + right)/2) + 1;
			if(key == input[mid]) {
				return findRightBound(input, key, mid, right);
			}
			else if(key < input[mid]) {
				return findRightBound(input, key, left, mid - 1);
			}
			else {
				return findRightBound(input, key, mid + 1, right);
			}
		}
	}
}
