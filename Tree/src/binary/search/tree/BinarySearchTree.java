package binary.search.tree;

public class BinarySearchTree {

	Node root;
	private int size = 0;
	
	public void addNode(int data) {
		Node newNode = new Node(data);
		if (root == null) {
			root = newNode;
			size++;
		}
		else {
			Node current = root;
			while (data != current.data) {
				while (data < current.data) {
					if (current.leftChild == null) {
						current.leftChild = newNode;
						size++;
						return;
					}
					current = current.leftChild;
				}
				while (data > current.data) {
					if (current.rightChild == null) {
						current.rightChild = newNode;
						size++;
						return;
					}
					current = current.rightChild;
				}
			}
		}
	}
	
	public void inOrderTraversal(Node node) {
		
	}
	
	public void preOrderTraversal(Node node) {
		
	}
	
	public void postOrderTraversal(Node node) {
		
	}
	
	public void bfsTraversal(Node node) {
		
	}
	
	public void dfsTraversal(Node node) {
		
	}
	
	public int size(Node node) {
		return 0;
	}
	
	public int height(Node node) {
		return 0;
	}
	
	public int size() {
		return size;
	}
}
