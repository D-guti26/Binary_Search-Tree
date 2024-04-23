public class BinarySearchTree {

	private Node root;


	public void Insert(int data) {
		Node newNode = new Node(data);
		RecursiveInsert(root, newNode);

	}

	private Node RecursiveInsert(Node root, Node newNode) {
		if (root == null) {
			root = newNode;
			return root;
		} else if (newNode.data >= root.data) { // if data is less than or equal to the root, insert to the right
			root.right = RecursiveInsert(root.right, newNode);
		} else {
			root.left = RecursiveInsert(root.left, newNode);
		}

		return root;
	}

	public void Display() {
		 RecursiveDisplay(root);

	}

	private void RecursiveDisplay(Node root) {
		if (root != null) {
			RecursiveDisplay(root.left);
			System.out.println(root.data);
			RecursiveDisplay(root.right);
		}
	}
}
