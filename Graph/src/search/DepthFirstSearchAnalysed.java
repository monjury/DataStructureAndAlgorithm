package search;

import java.util.HashSet;
import java.util.Stack;

import representation.Node;

/* 
 * Reference: https://www.youtube.com/watch?v=zLZhSSXAwxI
 * 
 * 1. Take item - push on stack - visit it and mark visited 
 * 2. Look at top of stack and all unvisited neighbors 
 * 3. Visit first unvisited neighbor 
 * 4. Take item - push on stack - visit it and mark visited 
 * 5. repeat for top of stack till no unvisited neighbors 
 * 6. if no unvisited neighbors - pop from stack 
 * 7. Repeat from Step 2. 
 * 8. Complete when stack is empty
 */
public class DepthFirstSearchAnalysed<E> {

	private Stack<Node<E>> stack = new Stack<Node<E>>();
	private HashSet<Node<E>> visited = new HashSet<Node<E>>();

	public void traverse(Node<E> start) {
		visit(start);
		while (!stack.isEmpty()) {
			Node<E> next = nextUnvisitedNeighbor(stack.peek());
			if (next != null) {
				visit(next);
			} else {
				stack.pop();
			}
		}
	}

	// Look at top of stack and all unvisited neighbors Visit first unvisited
	// neighbor
	private Node<E> nextUnvisitedNeighbor(Node<E> node) {
		for (Node<E> neighbor : node.getNeighbors()) {
			if (!visited.contains(neighbor)) {
				return neighbor;
			}
		}
		return null;
	}

	// Take item - push on stack - visit it and mark visited
	private void visit(Node<E> node) {
		stack.push(node);
		visited.add(node);
		doSomething(node);
	}
	
	private void doSomething(Node<E> node) {
		System.out.println(node.getData());
	}
}
