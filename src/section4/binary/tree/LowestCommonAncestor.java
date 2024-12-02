package section4.binary.tree;

class TreeNode{
	int value;
	TreeNode left;
	TreeNode right;
	
	TreeNode(int value){
		this.value = value;
	}
}

public class LowestCommonAncestor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode six = new TreeNode(6);
		TreeNode two = new TreeNode(2);
		TreeNode zero = new TreeNode(0);
		TreeNode four = new TreeNode(4);
		TreeNode three = new TreeNode(3);
		TreeNode five = new TreeNode(5);
		TreeNode eight = new TreeNode(8);
		TreeNode seven = new TreeNode(7);
		TreeNode nine = new TreeNode(9);
		
		six.left = two;
		six.right = eight;
		
		two.left = zero;
		two.right = four;
		
		four.left = three;
		four.right = five;
		
		eight.left = seven;
		eight.right = nine;
		
		TreeNode result = find(six,three,five);
		System.out.println(" result here --> "+result.value);
		
	}
	
	public static TreeNode find(TreeNode root, TreeNode left, TreeNode right) {
		
		while(root !=null) {
			if(left.value < root.value && right.value > root.value) {
				return root;
			}else if( left.value == root.value || right.value == root.value) {
				return root;
			}
			else if(left.value < root.value && right.value < root.value) {
				root = root.left;
			}else {
				root = root.right;
			}
		}
		
		return null;
	}

}
