package section4.binary.tree;

public class LowestCommonBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode three = new TreeNode(3);
		TreeNode five = new TreeNode(5);
		TreeNode one = new TreeNode(1);
		TreeNode six = new TreeNode(6);
		TreeNode two = new TreeNode(2);
		TreeNode seven = new TreeNode(7);
		TreeNode four = new TreeNode(4);
		TreeNode zero = new TreeNode(0);
		TreeNode eight = new TreeNode(8);
		
		three.left = five;
		three.right = one;
		five.left = six;
		five.right = two;
		
		two.left = seven;
		two.right = four;
		
		one.left= zero;
		one.right = eight;
		
		TreeNode result = find1(three,seven,four);
		System.out.println(result.value);
		
		TreeNode result1 = find(three,seven,four);
		System.out.println(result1.value);

	}
	
	
	public static TreeNode find1(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        
        if(root.value == p.value || root.value == q.value){
            return root;
        }
        
        TreeNode left = find1(root.left, p, q);
        TreeNode right = find1(root.right, p ,q);
        
        if(left==null && right==null) return null;
        else if(left==null && right!=null) return right;
        else if(left!=null && right == null) return left;
        return root;
    }
	
	public static TreeNode find(TreeNode root,TreeNode left, TreeNode right) {
		if(root ==null) {
			return null;
		}
		if(root.value == left.value || root.value == right.value) {
			return root;
		}
		TreeNode leftTree = find(root.left,left,right);
		TreeNode rightTree = find(root.right,left,right);
		
		if(leftTree ==null && rightTree==null) {
			return null;
		}
		else if(leftTree==null && right!=null) {
			return rightTree;
		}
		else if(rightTree==null && left!=null) {
			return leftTree;
		}
		
		return root;
	}

}
