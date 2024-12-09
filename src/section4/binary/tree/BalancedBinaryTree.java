package section4.binary.tree;

public class BalancedBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,3,4,5,6,7};
		Node root = construct(a);
		inOrder(root);
	}
	
	public static void inOrder(Node root) {
		if(root ==null) return;
		inOrder(root.left);
		System.out.print(root.value+" ");
		inOrder(root.right);
	}
	
	public static Node construct(int[] a) {
		return binaryTree(a,0,a.length-1);
	}
	
	public static Node binaryTree(int[] a, int start, int end) {
		if(start > end) return null;
		int mid = (start+end)/2;
		Node root = new Node(a[mid]);
		root.left = binaryTree(a,start,mid-1);
		root.right = binaryTree(a,mid+1,end);
		return root;
	}

}
