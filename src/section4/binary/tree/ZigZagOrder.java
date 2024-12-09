package section4.binary.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;

public class ZigZagOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node three = new Node(3);
		Node nine = new Node(9);
		Node twenty = new Node(20);
		Node fifteen = new Node(15);
		Node seven = new Node(7);
		three.left = nine;
		three.right =twenty;
		
		twenty.left = fifteen;
		twenty.right =seven;
		System.out.println(zigzag(three));
		
	}
	
	public static List<List<Integer>> zigzag(Node root){
		 List<List<Integer>> results = new ArrayList<>();
		 
		 boolean lefttotrue = true;
		 
		 Queue<Node> queue =new LinkedList<>();
			queue.add(root);
			while(!queue.isEmpty()) {
				int size = queue.size();
				System.out.println(" size "+size);
				List<Integer> result = new ArrayList<>(size);
				for(int i=0;i<size;i++) {
					System.out.println(" size  inside"+size);
					Node node = queue.poll();
					
					if(node.left!=null) {
						queue.add(node.left);
					}
					if(node.right!=null) {
						queue.add(node.right);
					}
					result.add(node.value);
				}
				
				if(!lefttotrue) {
					List<Integer> reverse = new ArrayList<>();
					for(int i=result.size()-1 ; i>=0;i-- ) {
						reverse.add(result.get(i));
					}
					results.add(reverse);
				}else {
					results.add(result);
				}
				lefttotrue = !lefttotrue;
				
			}
		 
		 return results;
		 
	}
		

}
