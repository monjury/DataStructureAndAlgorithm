package search;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import representation.Node;

public class BreadthFirstSearch<E> {

	private Queue<Node<E>> queue = new LinkedList<Node<E>>();
	private Set<Node<E>> visited = new HashSet<Node<E>>();
	public List<Node<E>> result = new ArrayList<Node<E>>();

	public void traverse(Node<E> start) {
		queue.add(start);
		visited.add(start);
		doSomething(start);
		while (queue.size() > 0) {
			Node<E> current = queue.poll();
			for (Node<E> neighbor : current.getNeighbors()) {
				if (!visited.contains(neighbor)) {
					queue.add(neighbor);
					visited.add(neighbor);
					doSomething(neighbor);
				}
			}
		}
	}

	private void doSomething(Node<E> node) {
		result.add(node);
		System.out.println(node.getData());
	}
}
