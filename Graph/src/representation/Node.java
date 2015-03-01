package representation;

import java.util.ArrayList;
import java.util.List;

public class Node<E> {

	private List<Node<E>> neighbors = new ArrayList<Node<E>>();
	private E data;

	public Node(E data) {
		this.data = data;
	}

	public void addNeighbor(Node<E> node) {
		neighbors.add(node);
	}

	public void addNeighbors(List<Node<E>> newNeighbors) {
		neighbors.addAll(newNeighbors);
	}

	public List<Node<E>> getNeighbors() {
		return neighbors;
	}

	public E getData() {
		return data;
	}

	// remove neighbors
}
