package section4.linked.list;

public class PartitionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node one = new Node(1);
		Node four = new Node(4);
		Node three = new Node(3);
		Node one1 = new Node(1);
		Node two = new Node(2);
		Node five = new Node(5);
		Node two2 = new Node(2);
		one.next = four;
		four.next= three;
		three.next = one1;
		two.next = five;
		five.next = two2;
		
		Node node = partitionList(one, 3);
		print(node);
	}
	
	public static Node partitionList(Node root,int k) {
		
		Node LH= null,LT= null,RH= null,RT= null;
		
		while(root!=null) {
			Node newNode = new Node(root.value);
			if(root.value < k) {
				if(LH==null) {
					LH= LT= newNode;
				}else {
					LT.next= newNode;
					LT = newNode;
				}
			}else {
				if(RH==null) {
					RH= RT= newNode;
				}else {
					RT.next= newNode;
					RT = newNode;
				}
			}
			root = root.next;
		}
		if(LH==null && RH==null) return null;
		if(LH ==null ) return RH;
		if(RH==null) return LH;
		LT.next = RH;
		return LH;
		
	}
	
	
	public static void print(Node root) {
		while(root!=null) {
			System.out.print(root.value+" ");
			root = root.next;
		}
	}
	

}
