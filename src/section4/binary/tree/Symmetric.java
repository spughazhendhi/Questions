package section4.binary.tree;

public class Symmetric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node one = new Node(1);
		Node two = new Node(2);
		Node two1 = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node three1 = new Node(3);
		Node four1 = new Node(41);
		
		one.left = two;
		one.right = two1;
		
		two.left = three;
		two.right = four;
		
		two1.right = three1;
		two1.left = four1;
				
		System.out.println(isSysmmetric(one));

	}
	
	public static boolean isSysmmetric(Node one) {
		
		return helper(one.left,one.right);
	}
	
	public static boolean helper(Node leftTree,Node rightTree) {
		if(leftTree==null && rightTree==null) return true;
		if(leftTree!=null && rightTree==null) return false;
		if(leftTree==null && rightTree!=null) return false;
		if(leftTree.value!=rightTree.value) return false;
		return helper(leftTree.left,rightTree.right) && helper(leftTree.right , rightTree.left); //&& helper(leftTree.right && rightTree.left);
	}

}
