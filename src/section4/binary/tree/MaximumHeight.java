package section4.binary.tree;

public class MaximumHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node four = new Node(4);
		Node seven = new Node(7);
		Node twelve = new Node(12);
		Node seven1 = new Node(7);
		Node eight = new Node(8);
		Node five = new Node(5);
		Node nine = new Node(9);
		Node six = new Node(6);
		
		four.left = seven;
		four.right = twelve;
		
		seven.left = eight;
		twelve.right = seven1;
		
		eight.left = five;
		eight.right = nine;
		
		five.right = six;
		
		System.out.println(getMaxHeight(four));
		System.out.println(getMinHeight(four));

	}
	
	
	public static int getMaxHeight(Node root) {
		if(root ==null ) return 0;
		int left =  getMaxHeight(root.left);
		int right = getMaxHeight(root.right);
		return 1+Math.max(left, right);
		
	}
	
	public static int getMinHeight(Node root) {
		if(root ==null ) return 0;
		int left =  getMinHeight(root.left);
		int right = getMinHeight(root.right);
		return 1+Math.min(left, right);
		
	}

}
