import java.io.Serializable;

public class Node<E> implements Serializable {
	
	private static final long serialVersionUID = -8500458970472702361L;
	private E data;
	private Node<E> left;
	private Node<E> right;

	public Node(E data) {
		this.data = data;
		left = null;
		right = null;
	}

	public String toString() {
		return data.toString();
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public Node<E> getLeft() {
		return left;
	}

	public void setLeft(Node<E> left) {
		this.left = left;
	}

	public Node<E> getRight() {
		return right;
	}

	public void setRight(Node<E> right) {
		this.right = right;
	}
}