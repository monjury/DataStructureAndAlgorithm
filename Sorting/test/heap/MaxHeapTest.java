package heap;

import org.junit.Assert;
import org.junit.Test;

public class MaxHeapTest {

	@Test
	public void test0() {
		int[] data = { 40, 15, 22, 13, 8, 20 };
		MaxHeap mh = new MaxHeap(data);
		mh.add(45);
		int[] actual = mh.heap;
		int[] expected = { 45, 15, 40, 13, 8, 20, 22 };
		for (int i = 0; i < expected.length; i++) {
			Assert.assertEquals(expected[i], actual[i]);
		}
	}

	@Test
	public void test1() {
		int[] data = { 40, 15, 20, 13, 8 };
		MaxHeap mh = new MaxHeap(data);
		mh.add(22);
		int[] actual = mh.heap;
		int[] expected = { 40, 15, 22, 13, 8, 20 };
		for (int i = 0; i < expected.length; i++) {
			Assert.assertEquals(expected[i], actual[i]);
		}
	}
	
	@Test
	public void test2() {
		int[] data = { 40, 18, 20, 15, 13, 9, 19, 1, 3, 8};
		MaxHeap mh = new MaxHeap(data);
		mh.removeRoot();
		int[] actual = mh.heap;
		int[] expected = { 20, 18, 19, 15, 13, 9, 8, 1, 3 };
		for (int i = 0; i < expected.length; i++) {
			Assert.assertEquals(expected[i], actual[i]);
		}
	}
	
	@Test
	public void test3() {
		int[] data = { 20, 18, 19, 15, 13, 9, 8, 1, 3 };
		MaxHeap mh = new MaxHeap(data);
		mh.removeRoot();
		int[] actual = mh.heap;
		int[] expected = { 19, 18, 9, 15, 13, 3, 8, 1 };
		for (int i = 0; i < expected.length; i++) {
			Assert.assertEquals(expected[i], actual[i]);
		}
	}
}
