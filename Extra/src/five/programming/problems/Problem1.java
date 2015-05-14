package five.programming.problems;

// Write three functions that compute the sum of the numbers in a given list using a for-loop, a while-loop, and recursion.
public class Problem1 {

	public int forLoop(int[] input) {
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum += input[i];
		}
		return sum;
	}

	public int whileLoop(int[] input) {
		int sum = 0;
		int i = 0;
		while (i < input.length) {
			sum += input[i];
			i++;
		}
		return sum;
	}

	public int recursion(int[] input) {
		return recursionAdd(input, input.length - 1, 0);
	}

	public int recursionAdd(int[] input, int index, int sum) {
		if (index < 0) {
			return sum;
		}
		return input[index] + recursionAdd(input, index - 1, sum);
	}
}
