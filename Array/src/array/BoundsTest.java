package array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BoundsTest {

    protected Bounds solution;
    protected Bounds b;
	int[] input = new int[200];
	int key = 0;
	int[] actual = new int[2];

    @Before
    public void setUp() {
        b = new Bounds();
    }

    @Test(timeout = 2000)
    public void testCase0() {
    	input = new int[] {1, 2, 4, 4, 4, 4, 10 , 15, 20};
		key = 4;
		actual = b.findBounds(input, key);
		int[] expected = new int[] {2,5};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase1() {
    	input = new int[] {3, 3, 3, 3};
		key = 4;
		actual = b.findBounds(input, key);
		int[] expected = new int[] {-1,-1};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase2() {
    	input = new int[] {3, 3, 3, 3};
		key = 3;
		actual = b.findBounds(input, key);
		int[] expected = new int[] {0,3};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase3() {
    	input = new int[] {1, 2, 4, 4, 5};
		key = 4;
		actual = b.findBounds(input, key);
		int[] expected = new int[] {2,3};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test(timeout = 2000)
    public void testCase4() {
    	input = new int[] {1, 2, 4, 5};
		key = 4;
		actual = b.findBounds(input, key);
		int[] expected = new int[] {2,2};
        Assert.assertArrayEquals(expected, actual);
    }
    
    @Test(timeout = 2000)
    public void testCase5() {
    	input = new int[] {1, 2, 4, 5};
		key = 5;
		actual = b.findBounds(input, key);
		int[] expected = new int[] {3,3};
        Assert.assertArrayEquals(expected, actual);
    }

}