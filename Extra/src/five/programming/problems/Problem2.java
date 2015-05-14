package five.programming.problems;

// Write a function that combines two lists by taking alternating elements. 
// For example: given the two lists [a, b, c] and [1, 2, 3], the function should return [a, 1, b, 2, c, 3].

public class Problem2 {

	public int[] merge(int[] aList, int[] bList) {
		int totalLength = aList.length + bList.length;
		int[] result = new int[totalLength];
		int i = 0;
		int resultIndex = 0;
		while (i < aList.length && i < bList.length) {
			result[resultIndex++] = aList[i];
			result[resultIndex++] = bList[i];
			i++;
		}
		while (i < aList.length) {
			result[resultIndex++] = aList[i];
			i++;
		}
		while (i < bList.length) {
			result[resultIndex++] = bList[i];
			i++;
		}
		return result;
	}
}
