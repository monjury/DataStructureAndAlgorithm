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
	
	public int size(Node node) {
		//TODO
		return 0;
	}
	
	public int height(Node node) {
		if(node == null) return 0;
		return max(height(node.leftChild), height(node.rightChild)) + 1;
	}
	
	private int max(int a, int b) {
		return (a > b)? a : b;
	}
	
	public int size() {
		return size;
	}
	
	
}
