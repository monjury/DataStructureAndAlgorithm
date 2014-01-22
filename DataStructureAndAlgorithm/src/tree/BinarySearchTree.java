package tree;

public class BinarySearchTree<E extends Comparable<E>> extends BinaryTree<E> implements SearchTree<E> {

	private static final long serialVersionUID = 3704195509717426913L;
	protected boolean addReturn;
	protected E deleteReturn;
	
	@Override
	public boolean add(E item) {
		return false;
	}

	@Override
	public boolean contains(E target) {

		return false;
	}

	@Override
	public E find(E target) {

		return null;
	}

	@Override
	public E delete(E target) {

		return null;
	}

	@Override
	public boolean remove(E target) {

		return false;
	}
}