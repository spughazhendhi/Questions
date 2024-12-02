package section4.linked.list;

public class CycleDetection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node eight = new Node(8);
		Node one = new Node(1);
		Node nine = new Node(9);
		Node four = new Node(4);
		Node two = new Node(2);
		Node three = new Node(3);
		Node seven = new Node(7);
		Node two2 = new Node(2);
		Node nine9 = new Node(9);
		
		eight.next = one;
		one.next = nine;
		nine.next = four;
		four.next = two;
		two.next = three;
		three.next = seven;
		seven.next = two2;
		two2.next = nine9;
		nine9.next = two;
		//System.out.println(hasCycle(eight));
		System.out.println(cycleLocation(eight));
		System.out.println(cycleLocation1(eight));
	}
	
public static int cycleLocation1(Node root) {
		
		Node slow = root;
		Node fast = root;
		
		while(root!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow ==fast) {
				break;
			}
		}
		
		if(fast==null || fast.next==null) return -1;
		
		slow = slow.next;
		int count =1;
		
		while(slow!=fast) {
			slow= slow.next;
			count++;
		}
		
		slow = root;
		fast = root;
		
		while(count > 0) {
			fast = fast.next;
			count--;
		}
		
		while(slow!=fast) {
			slow = slow.next;
			fast = fast.next;
		}
		
		return slow.value;
}
	
	
	
	
	
	
	
	public static int cycleLocation(Node root) {
		
		Node slow = root;
		Node fast = root;
		
		while(root!=null && fast.next!=null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow ==fast) {
				break;
			}
		}
		
		if(fast==null || fast.next==null) return -1;
		int count =1;
		slow = slow.next;
		while(slow!=fast) {
			slow = slow.next;
			count++;
		}
		
		 fast = root;
		 slow = root;
		while(count >0) {
			fast = fast.next;
			count--;
			
		}
		
		while(slow!=fast) {
			slow = slow.next;
			fast = fast.next;
		}
		
		
		
		return slow.value;
	}
	
	public static boolean hasCycle(Node root) {
		
		Node slow = root;
		Node fast = root;
		
		while(fast!=null && fast.next!=null) {
			fast = fast.next.next;
			slow = slow.next;
			if(fast==slow) return true;
			
		}
		return false;
	}

}
