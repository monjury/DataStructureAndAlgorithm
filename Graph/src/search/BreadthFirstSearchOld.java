package search;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

import representation.Node;

public class BreadthFirstSearchOld<E> {

	public void traverse(Node<E> start) {
		Set<Node<E>> visited = new HashSet<Node<E>>();
		Queue<Node<E>> queue = new LinkedList<Node<E>>();
		queue.add(start);
		Node<E> current = null;
		while (queue.size() > 0) {
			current = queue.peek();
			if (!visited.contains(current)) {
				visited.add(current);
				doSomething(current);
				for (Node<E> neighbor : current.getNeighbors()) {
					queue.add(neighbor);
				}
			}
			queue.poll();
		}
	}

	protected void doSomething(Node<E> node) {
		System.out.print(node.getData().toString() + "  ");
	}
}