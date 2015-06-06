package binary.search.tree;

//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.Queue;
//import java.util.Set;
//import java.util.Stack;

public class BinarySearchTreeTraversal {
	public void inOrderTraversal(Node node) {
		if (node == null)
			return;
		inOrderTraversal(node.leftChild);
		doSomething(node);
		inOrderTraversal(node.rightChild);
	}

	public void preOrderTraversal(Node node) {
		if (node == null)
			return;
		doSomething(node);
		preOrderTraversal(node.leftChild);
		preOrderTraversal(node.rightChild);
	}

	public void postOrderTraversal(Node node) {
		if (node == null)
			return;
		postOrderTraversal(node.leftChild);
		postOrderTraversal(node.rightChild);
		doSomething(node);
	}

	/*public void bfsTraversal(Node start) {
		Queue<Node> queue = new LinkedList<Node>();
		Set<Node> visited = new HashSet<Node>();
		bfsVisit(start, queue, visited);
		while (!queue.isEmpty()) {
			Node current = queue.poll();
			if (!visited.contains(current.leftChild)) {
				bfsVisit(current.leftChild, queue, visited);
			}
			if (!visited.contains(current.rightChild)) {
				bfsVisit(current.rightChild, queue, visited);
			}
		}
	}

	private void bfsVisit(Node node, Queue<Node> queue, Set<Node> visited) {
		queue.add(node);
		visited.add(node);
		doSomething(node);
	}

	public void dfsTraversal(Node start) {
		Stack<Node> stack = new Stack<Node>();
		Set<Node> visited = new HashSet<Node>();
		dfsVisit(start, stack, visited);
		while(!stack.isEmpty()) {
			Node current = stack.pop();
			if (!visited.contains(current.leftChild)) {
				dfsVisit(current.leftChild, stack, visited);
			}
			if (!visited.contains(current.rightChild)) {
				dfsVisit(current.rightChild, stack, visited);
			}
		}

	}

	private void dfsVisit(Node node, Stack<Node> stack, Set<Node> visited) {
		stack.add(node);
		visited.add(node);
		doSomething(node);
	}*/

	private void doSomething(Node node) {
		System.out.println(node.data);
	}
}
