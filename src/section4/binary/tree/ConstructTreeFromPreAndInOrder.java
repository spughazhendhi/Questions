package section4.binary.tree;

public class ConstructTreeFromPreAndInOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] pre = {3,9,20,15,7};
		int[] in = {9,3,15,20,7};
		
		Node root = construct(pre,in);
		inOrder(root);

	}
	
	public static void inOrder(Node root) {
		if(root == null) return;
		inOrder(root.left);
		System.out.print(root.value +" ");
		inOrder(root.right);
		
		
	}
	
	public static Node helper(int[] pre,int[] in, int inStart,int inEnd, int preStart, int preEnd) {
		if(inStart > inEnd) {
			return null;
		}
		
		int rootValue = pre[preStart];
		Node root = new Node(rootValue);
		int leftPreS,leftPreE,leftInS,leftInE;
		int rightPreS,rightPreE,rightInS,rightInE;
		
		leftInS = inStart;
		leftPreS = preStart+1;
		rightInE = inEnd;
		rightPreE = preEnd;
		
		
		
		int rootIndex =-1;
		for(int i=inStart;i<=inEnd;i++) {
			if(in[i]==rootValue) {
				rootIndex =i;
				break;
			}
		}
		
		leftInE = rootIndex -1;
		leftPreE = leftPreS +leftInE - leftInS;
		rightInS = rootIndex+1;
		rightPreS = leftPreE+1;
		
		root.left = helper(pre,in,leftInS,leftInE,leftPreS,leftPreE);
		root.right = helper(pre,in,rightInS,rightInE,rightPreS,rightPreE);
		
		return root;
		
	}
	
	public static Node construct(int[] pre, int[] in) {
		return helper(pre,in,0,pre.length-1,0,in.length-1);
	}

}
