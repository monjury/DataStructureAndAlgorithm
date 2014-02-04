import java.util.ArrayList;

public class DepthFirstTraversal<E> {
		
	public ArrayList<Node<E>> getPath(Node<E> root) {
		Stack<Node<E>> s = new Stack<Node<E>>();
		ArrayList<Node<E>> path = new ArrayList<Node<E>>();
		return traverse(root, s, path);
	}
	
	private ArrayList<Node<E>> traverse(Node<E> node, Stack<Node<E>> s, ArrayList<Node<E>> path) {

		/*
		- if left and right child is null or is visited pop off stack
		- else push it to stack and add to path and mark as visited
		- do same with left and right subtrees
		*/
		
		if(node == null || (node.getLeft() == null && node.getRight() == null) ||
				(node.getLeft().isVisited() && node.getRight().isVisited())){
			s.pop();
		}
		else {
			path.add(node);
			s.push(node);
			node.setVisited(true);
			traverse(node.getLeft(), s, path);
			traverse(node.getRight(), s, path);
		}
		return path;
	}
	
	public static void main(String[] args){
		DepthFirstTraversal<Integer> t = new DepthFirstTraversal<Integer>();
		Node<Integer> root = new Node<Integer>(40);
		
		root.setLeft(new Node<Integer>(30));
		root.setRight(new Node<Integer>(55));
		
		root.getLeft().setLeft(new Node<Integer>(32));
		root.getLeft().setRight(new Node<Integer>(35));
		
		root.getRight().setLeft(new Node<Integer>(50));
		
		System.out.println("\n\nEXPECTED DFS : 40 30 32 35 55 50");
		t.getPath(root);
	}
}
