import java.util.ArrayList;

public class DepthFirstTraversal<E> {
		
	public ArrayList<Node<E>> getPath(Node<E> root) {
		Stack<Node<E>> s = new Stack<Node<E>>();
		ArrayList<Node<E>> path = new ArrayList<Node<E>>();
		return traverse(root, s, path);
	}
	
	public ArrayList<Node<E>> traverse(Node<E> node, Stack<Node<E>> s, ArrayList<Node<E>> path) {

		path.add(node);
		s.push(node);
		
		if(node.getLeft() != null) {
			traverse(node.getLeft(), s, path);
		}
		
		
		 
		traverse(node.getRight(), s, path);
		
		if(node.getLeft() == null && node.getRight() == null) {
			traverse(node.getLeft(), s, path);
		}
		return path;
	}
}
