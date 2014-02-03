public class Tree<E> {
	
	public boolean isLeaf(Node<E> node) {
		return (node != null && node.getLeft() == null && node.getRight() == null);	
	}
}
