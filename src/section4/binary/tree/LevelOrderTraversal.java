package section4.binary.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class LevelOrderTraversal {
	
	public static void main(String[] args) {
		
		Node seven = new Node(7);
		Node ten = new Node(10);
		Node fifteen = new Node(15);
		Node fifteen1 = new Node(15);
		Node thirty = new Node(30);
		Node seven1 = new Node(7);
		seven.left = ten;
		seven.right =fifteen;
		
		ten.left = fifteen1;
		ten.right =thirty;
		
		thirty.right =seven1;
		
		levelOrder(seven);
		levelOrderReverse1(seven);
	}
	
	
	public static void levelOrderReverse1(Node root) {
		
		Queue<Node> queue = new LinkedList<>();
			queue.add(root);
			Stack<Integer> parent = new Stack<>();
			
			
			while(!queue.isEmpty()) {
				int size = queue.size();
				while(size > 0) {
					Node node = queue.poll();
					parent.add(node.value);
					size--;
					if(node.right!=null) {
						queue.add(node.right);
					}
					if(node.left!=null) {
						queue.add(node.left);
					}
					
				}
				
			}
			
			while(!parent.isEmpty()) {
				System.out.println("list here "+parent.pop());
			}
			
			
		}

	
	
public static void levelOrderReverse(Node root) {
		
	Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		Stack<List<Integer>> parent = new Stack<>();
		
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> list = new ArrayList<>();
			while(size > 0) {
				Node node = queue.poll();
				list.add(node.value);
				size--;
				if(node.left!=null) {
					queue.add(node.left);
				}
				if(node.right!=null) {
					queue.add(node.right);
				}
			}
			parent.add(list);
		}
		
		while(!parent.isEmpty()) {
			System.out.println("list here "+parent.pop());
		}
		
		
	}

	
	public static void levelOrder(Node root) {
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		List<List<Integer>> parent = new ArrayList<>();
		
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> list = new ArrayList<>();
			while(size > 0) {
				Node node = queue.poll();
				list.add(node.value);
				size--;
				if(node.left!=null) {
					queue.add(node.left);
				}
				if(node.right!=null) {
					queue.add(node.right);
				}
			}
			parent.add(list);
		}
		
		System.out.println("list here "+parent);
		
	}

}
