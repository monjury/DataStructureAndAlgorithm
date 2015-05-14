package five.programming.problems;

import java.math.BigInteger;

/*
 * Write a function that computes the list of the first 100 Fibonacci numbers. 
 * By definition, the first two numbers in the Fibonacci sequence are 0 and 1, 
 * and each subsequent number is the sum of the previous two. 
 * As an example, here are the first 10 Fibonnaci numbers: 
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, and 34.
 * 
 */
public class Problem3 {

	public BigInteger[] getFibonacciList(int size) {
		BigInteger[] result = new BigInteger[size];
		fibonacci(size - 1, result);
		return result;
	}

	private BigInteger fibonacci(int n, BigInteger[] result) {
		if (n == 0) {
			result[n] = new BigInteger("0");
		}
		else if (n == 1) {
			result[n] = new BigInteger("1");
		}
		else {
			result[n] = fibonacci(n - 1, result).add(fibonacci(n - 2, result));
			System.out.println(result[n]);
		}
		return result[n];
	}
}
