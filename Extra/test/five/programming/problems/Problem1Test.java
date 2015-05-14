package five.programming.problems;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem1Test {
	protected Problem1 problem;
	protected int[] input = {1, 2, 3, 4, 5};

	@Before
	public void setUp() {
		problem = new Problem1();
	}

	@Test
	public void testForLoop0() {
		int actual = problem.forLoop(input);
		int expected = 15;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testWhileLoop0() {
		int actual = problem.whileLoop(input);
		int expected = 15;
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testRecursion0() {
		int actual = problem.recursion(input);
		int expected = 15;
		Assert.assertEquals(expected, actual);
	}
}
