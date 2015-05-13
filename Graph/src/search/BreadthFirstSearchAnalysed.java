package search;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

import representation.Node;

/* 
 * Reference: https://www.youtube.com/watch?v=zLZhSSXAwxI
 * 
 * 1. Visit first
 * 2. Mark first as visited
 * 
 * 3. Visit first neighbor [if neighbor not visited]
 * 4. Mark first neighbor as visited
 * 5. Add first neighbor to queue
 * 
 * 6. Repeat from Step 3 for other neighbors for first till all neighbors of first is already visited
 * 7. Now take next item from head of queue and dequeue
 * 8. Repeat from Step 3 for all neighbors of current node
 * 9. Continue till queue is empty
 * 
 */

public class BreadthFirstSearchAnalysed<E> {

	private Queue<Node<E>> queue = new LinkedList<Node<E>>();
	private Set<Node<E>> visited = new HashSet<Node<E>>();
	public List<Node<E>> result = new ArrayList<Node<E>>();

	public void traverse(Node<E> start) {
		visit(start);
		while(queue.size() > 0) {
			Node<E> current = queue.poll();
			for (Node<E> neighbor : current.getNeighbors()) {
				if (!visited.contains(neighbor)) {
					visit(neighbor);
				}
			}
		}
	}
	
	private void visit(Node<E> node) {
		queue.add(node);
		visited.add(node);
		doSomething(node);
	}
	

	private void doSomething(Node<E> node) {
		result.add(node);
		System.out.println(node.getData());
	}
}
