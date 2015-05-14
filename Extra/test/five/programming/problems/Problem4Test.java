package five.programming.problems;

import org.junit.Assert;
import org.junit.Test;

public class Problem4Test {

	@Test
	public void test0() {
		int[] input = { 50, 2, 1, 9 };
		int[] expected = { 9, 50, 2, 1 };
		Problem4 p = new Problem4();
		int[] actual = p.rearrange(input);
		for (int i = 0; i < expected.length; i++) {
			Assert.assertEquals(expected[i], actual[i]);
		}
	}

	@Test
	public void test6() {
		int[] input = { 420, 42, 423 };
		int[] expected = { 42, 423, 420 };
		Problem4 p = new Problem4();
		int[] actual = p.rearrange(input);
		for (int i = 0; i < expected.length; i++) {
			Assert.assertEquals(expected[i], actual[i]);
		}
	}

	@Test
	public void test1() {
		int expected = 1;
		Problem4 p = new Problem4();
		int actual = p.compare(9, 50);
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void test2() {
		int expected = 1;
		Problem4 p = new Problem4();
		int actual = p.compare(50, 2);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test3() {
		int expected = 1;
		Problem4 p = new Problem4();
		int actual = p.compare(42, 421);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test4() {
		int expected = 0;
		Problem4 p = new Problem4();
		int actual = p.compare(0, 00);
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void test5() {
		int expected = -1;
		Problem4 p = new Problem4();
		int actual = p.compare(1, 99);
		Assert.assertEquals(expected, actual);
	}
}
