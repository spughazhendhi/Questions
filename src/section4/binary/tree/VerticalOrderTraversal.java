package section4.binary.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;

class Element{
	Node node;
	int distance;
	Element(Node node, int distance){
		this.node = node;
		this.distance = distance;
	}
}

public class VerticalOrderTraversal {

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
		
		System.out.println(vertical(three));
		
	}
	
	public static List<List<Integer>> vertical(Node root){
		
		TreeMap<Integer,List<Integer>> map = new TreeMap<>();
		 List<List<Integer>> result = new ArrayList<>();
		
		Queue<Element> queue =new LinkedList<>();
		queue.add(new Element(root,0));
		while(!queue.isEmpty()) {
			Element  element = queue.poll();
			
			if(!map.containsKey(element.distance)) {
				map.put(element.distance, new ArrayList<Integer>());
			}
			List<Integer> list = map.get(element.distance);
			list.add(element.node.value);
			map.put(element.distance,list);
			
			if(element.node.left!=null) {
				queue.add(new Element(element.node.left,element.distance-1));
			}
			if(element.node.right!=null) {
				queue.add(new Element(element.node.right,element.distance+1));
			}
			
		}
		
		for(Integer i:map.keySet()) {
			List<Integer> values = map.get(i);
			if(values.size() > 1) {
				Collections.sort(values);
				
			}
			result.add(values);
		}
		
		return result;
		
	}

}
