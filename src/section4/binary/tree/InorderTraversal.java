package section4.binary.tree;

import java.util.ArrayList;
import java.util.List;

class Node{
	int value;
	Node left;
	Node right;
	Node(int value){
		this.value = value;
	}
}

public class InorderTraversal {

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
		
		List<Integer> list = new ArrayList<>();
		inOrder(one,list);
		System.out.println(list);
		list = new ArrayList<>();
		preOrder(one,list);
		System.out.println(list);
		
		list = new ArrayList<>();
		postOrder(one,list);
		System.out.println(list);

	}
	
	public static void inOrder(Node root,List<Integer> list) {
		if(root==null) {
			return;
		}
		inOrder(root.left,list);
		list.add(root.value);
		inOrder(root.right,list);
	}
	
	public static void preOrder(Node root,List<Integer> list) {
		if(root==null) {
			return;
		}
		list.add(root.value);
		preOrder(root.left,list);
		
		preOrder(root.right,list);
	}
	
	public static void postOrder(Node root,List<Integer> list) {
		if(root==null) {
			return;
		}
	
		postOrder(root.left,list);
		postOrder(root.right,list);
		list.add(root.value);
	}

}
