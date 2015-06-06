package binary.search.tree;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTreeTest {

	@Test
	public void test0() {
		BinarySearchTree actual = new BinarySearchTree();
		actual.addNode(3);
		actual.addNode(2);
		actual.addNode(1);
		actual.addNode(4);
		actual.addNode(5);
		actual.addNode(3);
		Assert.assertEquals(actual.root.data, 3);
		Assert.assertEquals(actual.root.leftChild.data, 2);
		Assert.assertEquals(actual.root.leftChild.leftChild.data, 1);
		Assert.assertEquals(actual.root.rightChild.data, 4);
		Assert.assertEquals(actual.root.rightChild.rightChild.data, 5);
		Assert.assertEquals(actual.size(), 5);
	}

	@Test
	public void testheight0() {
		BinarySearchTree actual = new BinarySearchTree();
		actual.addNode(3);
		actual.addNode(2);
		actual.addNode(1);
		actual.addNode(4);
		actual.addNode(5);
		actual.addNode(3);
		Assert.assertEquals(3, actual.height(actual.root));
	}

	@Test
	public void testheight1() {
		BinarySearchTree actual = new BinarySearchTree();
		Assert.assertEquals(0, actual.height(actual.root));
	}

	@Test
	public void testheight2() {
		BinarySearchTree actual = new BinarySearchTree();
		actual.addNode(3);
		actual.addNode(2);
		actual.addNode(1);
		actual.addNode(4);
		actual.addNode(5);
		actual.addNode(6);
		actual.addNode(7);
		actual.addNode(8);
		actual.addNode(3);
		Assert.assertEquals(6, actual.height(actual.root));
	}

	@Test
	public void testheight3() {
		BinarySearchTree actual = new BinarySearchTree();
		actual.addNode(1);
		actual.addNode(2);
		actual.addNode(3);
		actual.addNode(4);
		actual.addNode(5);
		Assert.assertEquals(5, actual.height(actual.root));
	}

}
