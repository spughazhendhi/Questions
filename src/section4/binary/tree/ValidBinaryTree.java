package section4.binary.tree;

public class ValidBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node four = new Node(4);
		Node two = new Node(2);
		Node five = new Node(5);
		Node one = new Node(1);
		Node three = new Node(3);
		
		four.left = two;
		four.right = five;
		
		two.left = one;
		two.right = three;
		//System.out.println(isValidBinaryTree(four));
		
	
		
	}
	
	

	public static boolean isValidBinaryTree(Node root) {
		if(root==null) {
			return true;
		}
		
		boolean left = isValidBinaryTree(root.left);
		boolean right = isValidBinaryTree(root.right);
		if(left && right && (root.left ==null || root.value > root.left.value) && (root.right==null || root.value < root.right.value)) {
			return true;
		}else {
			return false;
		}
		
	}
}
