package section4.linked.list;

class Node{
	int value;
	Node next;
	
	Node(int value){
		this.value = value;
	}
	
}

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node first = new Node(1);
		Node second_1 = new Node(2);
		Node three = new Node(3);
		Node four = new Node(4);
		Node five = new Node(5);
		Node six = new Node(6);
		first.next = second_1;
		second_1.next = three;
		three.next = four;
		four.next = five;
		five.next= six;
		
		printList(first);
		Node rev = reverse4(first);
		System.out.println("==========");
		
		printList(rev);
		
	//	printList(first);
		//System.out.println("==========");
		//Node rem= removeNode(first,6);
		//printList(rem);
		//System.out.println(midValue(first));
		
		/*
		printList(first);
		Node rev = reverse1(first);
		System.out.println("==========");
		
		printList(rev);
		
		Node hundred = new Node(100);
		Node six = new Node(1);
		Node seven = new Node(1);
		hundred.next = six;
		six.next = seven;
		seven.next = three;
		
		System.out.println(interSection(first,hundred));
		*/

	}
	
	public static Node reverse4(Node root) {
		Node prev = null;
		Node curr =root;
		while(curr!=null) {
			Node next = curr.next;
			curr.next = prev;
			prev =curr;
			curr = next;
		}
		return prev;
	}
	
	public static Node removeNode(Node root, int k) {
		Node slow = root;
		Node fast = root;
		while(k> 0) {
			fast = fast.next;
			k--;
		}
		
		if(fast==null) {
			return slow.next;
		}
		
		while(fast.next!=null) {
			fast = fast.next;
			slow = slow.next;
		}
		slow.next= slow.next.next;
		return root;
		
	}
	
	public static int midValue(Node root) {
		Node slow = root;
		Node fast = root.next;
		while(fast!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast ==null) {
			return slow.value;
		}else {
			return slow.next.value;
		}
	}
	
	public static Node reverse1(Node root) {
		Node prev =null;
		Node current = root;
		
		while(root!=null) {
			root = root.next;
			current.next = prev;
			prev = current;
			current = root;
		}
		
		return prev;
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static Node reverse(Node root) {
		Node prev = null;
		Node curr = root;
		while(root!=null) {
			//curr =
			root = root.next;
			curr.next = prev;
			prev = curr;
			
			curr = root;
			
			
		}
		return prev;
	}
	
  public static void printList(Node root) {
	  while(root!=null) {
		  System.out.print(root.value +" ");
		  root = root.next;
	  }
  }
	
	public static int interSection(Node first, Node second) {
		
		int firstLen = length(first);
		int secondLen = length(second);
		if(firstLen > secondLen) {
			int value = firstLen - secondLen;
			while(value > 0) {
				first = first.next;
				value--;
			}
		}else {
			int value = secondLen - firstLen;
			while(value > 0) {
				second = second.next;
				value--;
			}
		}
		
		while(first!=null && second!=null) {
			if(first== second) {
				return first.value;
			}
			
			first = first.next;
			second = second.next;
		}
		
		return -1;
	}
	
	
	public static int length(Node first) {
		int count =0;
		
		while(first!=null) {
			first = first.next;
			count++;
		}
		
		return count;
	}

}
