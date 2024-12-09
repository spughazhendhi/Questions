package section4.binary.tree;

public class Diameter {

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
		two.right = five;
		System.out.println(diameter(one));
		System.out.println(diameter1(one));
		
	}
	
	public static int diameter(Node root) {
		if(root==null) return 0;
		
		int diameter = height(root.left )+ height(root.right);
		int left = diameter(root.left);
		int right = diameter(root.right);
		return Math.max(diameter, Math.max(left, right));
	}
	
	public static int height(Node root) {
		if(root==null) return 0;
		
		return 1+Math.max(height(root.left),height(root.right));
	}
	
	public static int diameter1(Node root) {
		int[] result = helper(root);
		return result [1];
	}
	
	public static int[] helper(Node root) {
		if(root ==null) {
			int[] a = new int[2];
			return a;
		}
		int[] left = helper(root.left);
		int[] right = helper(root.right);
		int[] a = new int[2];
		int height = 1+ Math.max(left[0], right[0]);
		int dia = Math.max(height, Math.max(left[1], right[1]));
		a[0] = height;
		a[1] = dia;
		
		
		return a;
		
	}

}
