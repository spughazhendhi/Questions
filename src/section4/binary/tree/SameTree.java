package section4.binary.tree;

public class SameTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Node one = new Node(1);
		Node two = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
		
		one.left = two;
		one.right = three;
		
		two.left = four;
		//two.right = five;
		
		
		
		Node one1 = new Node(1);
		Node two1 = new Node(2);
		Node three1 = new Node(31);
		Node four1 = new Node(4);
		Node five1 = new Node(5);
		
		one1.left = two1;
		one1.right = three1;
		
		two1.left = four1;
		two1.right = five1;
		
		//System.out.println(isSameTree(one,one1));
		System.out.println(numberOfNodes(one));

	}
	
	public static int numberOfNodes(Node one) {
		if(one==null) return 0;
		return 1+numberOfNodes(one.left) + numberOfNodes(one.right);
	}
	
	public static boolean isSameTree(Node one, Node two) {
		
		if(one ==null && two ==null) return true;
		if(one!=null && two ==null) return false;
		if(two!=null && one==null) return false;
		if(one.value!=two.value) return false;
		
		return isSameTree (one.left,two.left)  && isSameTree(one.right ,two.right);
	}

}
