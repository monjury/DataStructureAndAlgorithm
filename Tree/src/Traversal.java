
public class Traversal<E> {

	private void doSomething(Node<E> node) {
		System.out.print(node.getData() + " ");
	}
	
	public void preOrder(Node<E> root) {
		/*
		 *  1. Do something with current node
		 *  2. Go to left sub tree
		 *  3. Go to right subtree
		 */
		if(root == null) {
			return;
		}
		doSomething(root);
		preOrder(root.getLeft());
		preOrder(root.getRight());
	}

	public void inOrder(Node<E> root) {
		/*
		 *  1. Go to left sub tree
		 *  2. Do something with current node
		 *  3. Go to right subtree
		 */
		if(root == null) {
			return;
		}
		inOrder(root.getLeft());
		doSomething(root);
		inOrder(root.getRight());
	}
	
	public void postOrder(Node<E> root) {
		/*
		 *  1. Go to left sub tree
		 *  2. Go to right subtree
		 *  3. Do something with current node
		 */
		if(root == null) {
			return;
		}
		postOrder(root.getLeft());
		postOrder(root.getRight());
		doSomething(root);
	}
	
	public static void main(String[] args){
		Traversal<Integer> t = new Traversal<Integer>();
		Node<Integer> root = new Node<Integer>(40);
		
		root.setLeft(new Node<Integer>(30));
		root.setRight(new Node<Integer>(55));
		
		root.getLeft().setLeft(new Node<Integer>(32));
		root.getLeft().setRight(new Node<Integer>(35));
		
		root.getRight().setLeft(new Node<Integer>(50));
		
		System.out.println("\n\nEXPECTED PRE-ORDER : 40 30 32 35 55 50");
		t.preOrder(root);
		
		System.out.println("\n\nEXPECTED IN-ORDER : 32 30 35 40 50 55");
		t.inOrder(root);
		
		System.out.println("\n\nEXPECTED POST-ORDER : 32 35 30 50 55 40");
		t.postOrder(root);
	}
}