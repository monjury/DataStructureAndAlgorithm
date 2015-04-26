package nlogn;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MergeSortTest {

	protected MergeSort solution;

	@Before
	public void setUp() {
		solution = new MergeSort();
	}

	@Test
	public void testCase0() {
		int[] input = new int[] { 12, 11, 13, 5, 6, 7 };
		int[] expected = new int[] { 5, 6, 7, 11, 12, 13 };
		int[] actual = solution.sortInitiator(input);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void testCase1() {
		int[] input = new int[] { 1, 4, 5, 7, 9, 12 };
		int[] expected = new int[] { 1, 4, 5, 7, 9, 12 };
		int[] actual = solution.sortInitiator(input);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void testCase2() {
		int[] input = new int[] { 12, 9, 7, 5, 4, 1 };
		int[] expected = new int[] { 1, 4, 5, 7, 9, 12 };
		int[] actual = solution.sortInitiator(input);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void testCase3() {
		int[] input = new int[] {};
		int[] expected = new int[] {};
		int[] actual = solution.sortInitiator(input);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void testCase4() {
		int[] input = new int[] { 1 };
		int[] expected = new int[] { 1 };
		int[] actual = solution.sortInitiator(input);
		Assert.assertArrayEquals(expected, actual);
	}

	@Test
	public void testCase5() {
		int[] input = new int[] { 2, 1, 1 };
		int[] expected = new int[] { 1, 1, 2 };
		int[] actual = solution.sortInitiator(input);
		Assert.assertArrayEquals(expected, actual);
	}

}
