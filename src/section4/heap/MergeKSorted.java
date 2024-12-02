package section4.heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Node{
	public int value;
	public Node next;
	Node (int value){
		this.value = value;
	}
}
public class MergeKSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node one = new Node(1);
		Node four = new Node(4);
		Node five = new Node(5);
		one.next = four;
		four.next = five;
		
		Node one1 = new Node(1);
		Node three = new Node(3);
		Node four1 = new Node(4);
		one1.next = three;
		three.next = four1;
		
		Node two = new Node(2);
		Node six = new Node(6);
		
		two.next = six;
		
		List<Node> list = new ArrayList<>();
		list.add(one);
		list.add(one1);
		list.add(two);
		
		Node merge = mergeKsortedList(list);
		print(merge);

	}
	
	public static void print(Node node) {
		while(node!=null) {
			System.out.print(node.value+" ");
			node = node.next;
		}
	}
	
	public static Node mergeKsortedList(List<Node> nodes) {
		PriorityQueue<Node> pq = new PriorityQueue<>((n1,n2) -> Integer.compare(n1.value, n2.value));
		for(int i=0;i<nodes.size();i++) {
			pq.add(nodes.get(i));
		}
		Node head = null;
		Node tail = null;
		
		while(!pq.isEmpty()) {
			Node temp = pq.poll();
			if(head==null) {
				head= temp;
				tail = head;
			}else {
				tail.next = temp;
				tail = temp;
			}
			if(temp.next !=null) {
				pq.add(temp.next);
			}
		}
		
		
		
		return head;
	}

}
