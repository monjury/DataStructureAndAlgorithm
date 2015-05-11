package search;

import java.util.HashSet;
import java.util.List;
import java.util.Stack;

import representation.Node;

public class DepthFirstSearch<E> {

	public void traverse(Node<E> start) {
		Stack<Node<E>> stack = new Stack<Node<E>>();
		HashSet<Node<E>> visited = new HashSet<Node<E>>();
		stack.push(start);
		visited.add(start);
		doSomething(start);
		while (!stack.isEmpty()) {
			Node<E> next = null;
			List<Node<E>> neighbors = stack.peek().getNeighbors();
			if (neighbors != null) {
				for (Node<E> neighbor : neighbors) {
					if (!visited.contains(neighbor)) {
						next = neighbor;
						break;
					}
				}
			}
			if (next != null) {
				stack.push(next);
				visited.add(next);
				doSomething(next);
			} else {
				stack.pop();
			}
		}
	}

	private void doSomething(Node<E> node) {
		System.out.println(node.getData());
	}
}
