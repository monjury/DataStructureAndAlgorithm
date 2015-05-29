package old;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.Serializable;

public class BinaryTree<E> implements Serializable{

	private static final long serialVersionUID = 2938290145967156090L;
	protected Node<E> root;
	
	public BinaryTree() {
		root = null; 
	}
	
	public BinaryTree(Node<E> root) {
		this.root = root; 
	}
	
	public BinaryTree(E data, BinaryTree<E> leftTree, BinaryTree<E> rightTree) {
		this.root = new Node<E>(data); 
		root.left = (leftTree != null) ? leftTree.root : null;
		root.right = (rightTree != null) ? rightTree.root : null;	
	}
	
	public BinaryTree<E> getLeftSubTree() {
		if(root != null && root.left != null) {
			return new BinaryTree<E>(root.left);
		} 
		else {
			return null;
		}	
	}
	
	public BinaryTree<E> getRightSubTree() {
		if(root != null && root.right != null) {
			return new BinaryTree<E>(root.right);
		} 
		else {
			return null;
		}	
	}
	
	public E getData() {
		if(root != null) {
			return root.data;
		}
		else {
			return null;
		}
			
	}
	
	public boolean isLeaf() {
		return (root.left == null && root.right == null);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		preOrderTraverse(root, 1, sb);
		return sb.toString();
	}
	
	private void preOrderTraverse(Node<E> node, int depth, StringBuilder sb) {
		for(int i = 1; i < depth; i++) {
			sb.append(" ");
		}
		if(node == null) {
			sb.append("null \n");
		}
		else {
			sb.append(node.toString());
			sb.append("\n");
			preOrderTraverse(node.left, depth + 1, sb);
			preOrderTraverse(node.right, depth + 1, sb);
		}
	}
	
	public static BinaryTree<String> readBinaryTree(BufferedReader bR) throws IOException {
		String data = bR.readLine().trim();
		if(data.equals("null")) {
			return null;
		}
		else {
			BinaryTree<String> leftTree = readBinaryTree(bR);
			BinaryTree<String> rightTree = readBinaryTree(bR);
			return new BinaryTree<String>(data, leftTree, rightTree);
		}
	}
	
	protected static class Node<E> implements Serializable {
		private static final long serialVersionUID = -8500458970472702361L;
		protected E data;
		protected Node<E> left;
		protected Node<E> right;
		
		public Node(E data) {
			this.data = data;
			left = null;
			right = null;
		}
		
		public String toString() {
			return data.toString();
		}
	}

}
