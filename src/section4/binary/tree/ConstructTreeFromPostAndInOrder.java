package section4.binary.tree;

public class ConstructTreeFromPostAndInOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] post = {9,15,7,20,3};
		int[] in = {9,3,15,20,7};
		
		Node root = construct(post,in);
		inOrder(root);

	}
	
	public static void inOrder(Node root) {
		if(root == null) return;
		inOrder(root.left);
		System.out.print(root.value +" ");
		inOrder(root.right);
		
		
	}
	
	public static Node helper(int[] post,int[] in, int inStart,int inEnd, int postStart, int postEnd) {
		if(inStart > inEnd) {
			return null;
		}
		
		int rootValue = post[postEnd];
		Node root = new Node(rootValue);
		int leftpostS,leftpostE,leftInS,leftInE;
		int rightpostS,rightpostE,rightInS,rightInE;
		int rootIndex =-1;
		for(int i=inStart;i<=inEnd;i++) {
			if(in[i]==rootValue) {
				rootIndex =i;
				break;
			}
		}
		
		leftInS = inStart;
		leftInE = rootIndex -1;
		leftpostS = postStart;
		leftpostE = leftpostS +leftInE - leftInS;
		
		rightInE = inEnd;
		rightpostE = postEnd-1;
		rightInS = rootIndex+1;
		rightpostS = leftpostE+1;
		
		root.left = helper(post,in,leftInS,leftInE,leftpostS,leftpostE);
		root.right = helper(post,in,rightInS,rightInE,rightpostS,rightpostE);
		
		return root;
		
	}
	
	public static Node construct(int[] post, int[] in) {
		return helper(post,in,0,post.length-1,0,in.length-1);
	}

}
