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
		System.out.println(isValidBinaryTree(four));
		
	
		
	}
	public static boolean isValidBinaryTree(Node root) {
		return helper(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
		
	}
	
	public static boolean helper(Node root, int minVal, int maxVal) {
		if(root ==null) return true;
		boolean left = helper(root.left,minVal,root.value);
		boolean right = helper(root.right,root.value,maxVal);
		if(left && right && root.value >minVal && root.value < maxVal) {
			return true;
		}else {
			return false;
		}
	}
	
	



	
}
