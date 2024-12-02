package section4.binary.tree;

import java.util.LinkedList;
import java.util.Queue;

class Height{
	public Node node;
	public int depth;
	Height(Node node, int depth){
		this.node = node;
		this.depth = depth;
	}
}
public class MinimumHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node twelve = new Node(12);
		Node seven = new Node(7);
		Node fiftyone = new Node(51);
		Node eight = new Node(8);
		Node nine = new Node(9);
		Node ten = new Node(10);
		Node twelve1 = new Node(12);
		Node fifteen = new Node(15);
		Node seven1 = new Node(7);
		
		twelve.left = seven;
		twelve.right = fiftyone;
		
		seven.left = eight;
		seven.right = nine;
		nine.right = new Node(101);
		
		Node ninetynine = new Node(99);
		Node ninetyeight = new Node(98);
		
		fiftyone.right = seven1;
		fiftyone.left = ninetynine;
		ninetynine.left = ninetyeight;
		seven1.left = new Node(100);
		
		eight.left = ten;
		eight.right = twelve1;
		
		twelve1.right = fifteen;
		
		System.out.println(getMinHeight1(twelve));
		System.out.println(getDepth(twelve));


	}
	
	/*
	 * public static int getMinHeight(Node root) { if(root ==null ) return 0; int
	 * left = getMinHeight(root.left); int right = getMinHeight(root.right); return
	 * 1+Math.min(left, right);
	 * 
	 * }
	 */
	
	public static int getDepth(Node root) {
		Queue<Height> queue = new LinkedList<>();
		queue.add(new Height(root,1));
		
		while(!queue.isEmpty()) {
			Height height = queue.poll();
			if(height.node.left ==null && height.node.right==null) {
				return height.depth;
			}
			if(height.node.left!=null) {
				queue.add(new Height(height.node.left,height.depth+1));
			}
			if(height.node.right!=null) {
				queue.add(new Height(height.node.right,height.depth+1));
			}
		}
		
		return -1;
		
	}
	
	
	public static int getMinHeight1(Node root) {
		if(root ==null ) return 0;
		
		return helper(root);
		
	}
	
	public static int helper(Node root) {
		if(root.left==null && root.right==null) {
			return 1;
		}
		
		if(root.left ==null) {
			return helper(root.right) +1;
		}
		if(root.right ==null) {
			return helper(root.left) +1;
		}
		return 1 + Math.min(helper(root.left), helper(root.right));
	}


}
