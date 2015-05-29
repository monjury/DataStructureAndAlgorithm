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
}
