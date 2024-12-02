package section4.linked.list;



public class AddList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node two = new Node(2);
		Node four = new Node(4);
		Node three = new Node(3);
		Node seven = new Node(7);
		two.next = four;
		four.next = three;
		three.next = seven;
		
		Node five = new Node(5);
		Node six = new Node(6);
		Node four1 = new Node(4);
		five.next = six;
		six.next = four1;
		Node add = addList(two,five);
		print(add);
		System.out.println();
		Node add1 = addList1(two,five);
		print(add1);
	}
	
	public static void print(Node root) {
		while(root!=null) {
			System.out.print(root.value+" ");
			root = root.next;
		}
	}
	
	
	public static Node addList1(Node one, Node two) {
		
		int carry =0;
		
		Node head = null;
		while(one!=null && two!=null) {
			int value = one.value + two.value+carry;
			Node newNode = new Node(value%10);
			newNode.next = head;
			head = newNode;
			
			carry = value/10;
			
			one = one.next;
			two = two.next;
		}
		
		
		while(one!=null ) {
			int value = one.value + carry;
			Node newNode = new Node(value%10);
			newNode.next = head;
			head = newNode;
			
			carry = value/10;
			
			one = one.next;
			
		}
		
		while(two!=null) {
			int value = two.value+carry;
			Node newNode = new Node(value%10);
			newNode.next = head;
			head = newNode;
			
			carry = value/10;
			
			
			two = two.next;
		}
		
		if(carry > 0) {
			Node newNode = new Node(carry);
			newNode.next = head;
			head = newNode;
		}
		return reverse1(head);
	}
	
	
	public static Node reverse1(Node head) {
		Node prev = null;
		Node curr = head;
		
		while(curr!=null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		return prev;
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static Node addList(Node one, Node two) {
		
		if(one ==null) return two;
		if(two==null) return one;
		int carry =0;
		Node head = null;
		int count =0;
		while(one!=null && two!=null) {
			System.out.println("one .value "+one.value +" two "+two.value);
			int  value = one.value + two.value + carry;
			carry = value/10;
			Node newOne = new Node(value%10);
			newOne.next = head;
			head = newOne;
			one = one.next;
			two = two.next;
			count++;
			if(count ==5) break;
			
		}
	
		count =0;
		while(one!=null) {
			int  value = one.value +  carry;
			carry = value/10;
			Node newOne = new Node(value%10);
			newOne.next = head;
			head = newOne;
			one = one.next;
			if(count ==5) break;
			
		}
		
		while(two!=null) {
			int  value = two.value +  carry;
			carry = value/10;
			Node newOne = new Node(value%10);
			newOne.next = head;
			head = newOne;
			two = two.next;
		}
		
		if(carry >0) {
			Node newOne = new Node(carry);
			newOne.next = head;
			head = newOne;
		}
		System.out.println("reverse ");
		
		System.out.println("reverse ");
		return reverse(head);
	}
	
	public static Node reverse(Node head) {
		
		Node prev = null;
		Node current = head;
		while(current!=null) {
			Node next = current.next;
			System.out.println("value here "+current.value);
			current.next = prev;
			prev = current;
			current = next;
		}
		
		return prev;
	}
	
	public static int length(Node one) {
		int count =0;
		
		while(one!=null) {
			one = one.next;
			count++;
		}
		
		return count;
	}

}
