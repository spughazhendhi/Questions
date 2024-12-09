package section4.binary.tree;

public class CartesianTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,4,5,3,7,9,0};
		Node root = construct(a);
		BalancedBinaryTree.inOrder(root);
	}
	
	public static Node construct(int[] a) {
		return binaryTree(a,0,a.length-1);
	}
	
	public static Node binaryTree(int[] a, int start, int end) {
		if(start > end) return null;
		int mid = findMaxIndex(a,start,end);
		Node root = new Node(a[mid]);
		root.left = binaryTree(a,start,mid-1);
		root.right = binaryTree(a,mid+1,end);
		return root;
	}
	
	public static int findMaxIndex(int [] a,int start, int end) {
		int maxIndex =-1;
		int max = Integer.MIN_VALUE;
		for(int i= start;i<=end;i++) {
			if( max < a[i]) {
				max= a[i];
				maxIndex = i;
			}
			
		}
		return maxIndex;
	}


}
