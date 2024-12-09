package section4.binary.tree;

public class KthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5,6,7};
		Node root = BalancedBinaryTree.construct(a);
		System.out.println(kThSmallest(root,5));
	}
	
	
	public static int kThSmallest(Node root, int k) {
		int[] a=new int[1];
		 helper(root, k,a,new int[] {0});
		//helper(root,k,a,0);
		 return a[0];
	}
	
	public static void helper(Node root, int k, int[] result,int[] count) {
		if(root ==null) {
			return;
		}
		helper(root.left,k,result,count);
		count[0]++;
		if(count[0] ==k) {
			result[0] = root.value;
			return;
		}
		helper(root.right,k,result,count);
	}
	
	public static void helper(Node root, int k, int[] result,int count) {
		if(root ==null) {
			return;
		}
		helper(root.left,k,result,count);
		count++;
		System.out.println("count value "+ count +" array value "+root.value);
		if(count ==k) {
			result[0] = root.value;
			return;
		}
		helper(root.right,k,result,count);
	}

}
