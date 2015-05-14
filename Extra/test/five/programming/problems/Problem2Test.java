package five.programming.problems;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Problem2Test {
	protected Problem2 problem;

	@Before
	public void setUp() {
		problem = new Problem2();
	}

	@Test
	public void testMerge0() {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 'A', 'B', 'C', 'D', 'E' };
		int[] expected = { 1, 'A', 2, 'B', 3, 'C', 4, 'D', 5, 'E' };

		int[] actual = problem.merge(a, b);
		int i = 0;
		for (int e : expected) {
			Assert.assertEquals(e, actual[i++]);
		}
	}

	@Test
	public void testMerge1() {
		int[] a = {};
		int[] b = { 'A', 'B', 'C', 'D', 'E' };
		int[] expected = { 'A', 'B', 'C', 'D', 'E' };
		int[] actual = problem.merge(a, b);
		int i = 0;
		for (int e : expected) {
			Assert.assertEquals(e, actual[i++]);
		}
	}

	@Test
	public void testMerge2() {
		int[] a = { 1, 2 };
		int[] b = { 'A', 'B', 'C', 'D', 'E' };
		int[] expected = { 1, 'A', 2, 'B', 'C', 'D', 'E' };
		int[] actual = problem.merge(a, b);
		int i = 0;
		for (int e : expected) {
			Assert.assertEquals(e, actual[i++]);
		}
	}
}
