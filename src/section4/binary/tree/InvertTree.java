package section4.binary.tree;

public class InvertTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
		Node six = new Node(6);
		Node seven = new Node(7);
		one.left = two;
		one.right = three;
		
		two.left = four;
		two.right = five;
		
		
		three.left = six;
		three.right = seven;
		
		inOrder(one);
		Node invert = revert(one);
		System.out.println();
		inOrder(invert);

	}
	
	public static Node revert(Node root) {
		if(root==null) {
			return null;
		}
		Node left = revert(root.right);
		Node right = revert(root.left);
		root.left = left;
		root.right = right;
		return root;
	}
	
	public static void inOrder(Node root) {
		if(root==null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.value +" ");
		inOrder(root.right);
	}

}
