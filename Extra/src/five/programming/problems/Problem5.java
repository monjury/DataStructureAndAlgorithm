package five.programming.problems;

/* Write a program that outputs all possibilities to put + or - or nothing 
 * between the numbers 1, 2, ..., 9 (in this order) 
 * such that the result is always 100. 
 * For example: 1 + 2 + 34 - 5 + 67 - 8 + 9 = 100.
 */

// 1 + f(2..9) = 100
// 1 - f(2..9) = 100
// f(12, 3..9) = 100

public class Problem5 {

	enum Operation {
		ADD, SUBSTRACT, NONE
	}

	public String[] combination(int[] arr, int start, int total, int currentTotal) {

		String[] resultList = new String[10];

		return resultList;
	}

	private int getTotal(int index, int arr[], Operation o, StringBuilder sequence) {
		if (index > arr.length - 1) {
			return 0;
		}
		if (index == arr.length - 1) {
			sequence.append(arr[arr.length - 1]);
			return arr[arr.length - 1];
		}
		if (Operation.ADD.equals(o)) {
			sequence.append(arr[index]).append(" + ");
			return arr[index] + getTotal(index + 1, arr, o, sequence);
		}
		else if (Operation.SUBSTRACT.equals(o)) {
			sequence.append(arr[index]).append(" - ");
			return arr[index] - getTotal(index + 1, arr, o, sequence);
		}
		else {
			sequence.append((arr[index] * 10) + arr[index + 1]);
			return ((arr[index] * 10) + arr[index + 1]) - getTotal(index + 2, arr, o, sequence);
		}
	}

}
