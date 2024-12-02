package section3.map;

class Node<Value>{
	public String key;
	public Value value;
	public Node<Value> next;
	
	Node(String key, Value value){
		this.key = key;
		this.value = value;
	}
	
}

class Map<Value>{
	
	int count;
	int bucketSize;
	Node<Value> [] buckets;
	
	Map(){
		bucketSize = 5;
		buckets =  (Node<Value>[])new Node[bucketSize];
		//buckets = (Node[])new Object[5];
	}
	
	int size() {
		return count;
	}
	
	void insert(String key, Value value) {
		int bucketIndex = hash(key);
		Node<Value> head = buckets[bucketIndex];
		
		while(head!=null) {
			if(head.key==key) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		Node<Value> node = new Node<>(key,value);
		node.next =  buckets[bucketIndex];
		buckets[bucketIndex]  = node;
		 count++;
		 
		 double loadFactor  = (1.0 * count)/bucketSize;
		// System.out.println("loadFactor "+loadFactor);
		 if(loadFactor > 0.2) {
			 rehash();
		 }
	}
	
	public void rehash() {
		Node<Value>[] temp = buckets;
		
		buckets = new Node[2*bucketSize];
		
		bucketSize = 2 * bucketSize;
		
		count =0;
		for(int i=0;i<temp.length;i++) {
			Node<Value> val = temp[i];
			while(val!=null) {
				//System.out.println("ke "+key.);
			 insert(val.key,val.value);
			 val = val.next;
			}
		}
		
	}
	
	Value getValue(String key) {
		int bucketIndex = hash(key);
		Node<Value> head = buckets[bucketIndex];
		while(head!=null) {
			
			if(head.key.equals(key)) {
				return head.value;
			}
		}
		return null;
	}
	
	Value remove(String key) {
		int bucketIndex = hash(key);
		Node<Value> head = buckets[bucketIndex];
		if(head ==null) return null;
		
		Node<Value> prev = null;
		
		Value value = null;
		
		while(head!=null) {
	
			if(head.key.equals(key)) {
				if(prev==null) {
					buckets[bucketIndex] = head.next;
				}else {
					prev.next = head.next;	
				}
				value = head.value;
				count--;
				break;
			}
			
			prev = head;
			head = head.next;
		}
		return value;
	}
	
	int hash(String key) {
		
		
		int hashCode = 0;
		
		int base =1;
	
		for(int i =key.length()-1 ;i>=0;i--) {
			hashCode+= key.charAt(i) * base;
			hashCode = hashCode%bucketSize;
			base = base * 37;
		}
		
		
		return hashCode%bucketSize;
	}
}

public class MyMap {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String> map = new Map<>();
		
		map.insert("123", "456");
		map.insert("1236", "4568");
		
		map.insert("1234", "4567");
		System.out.println(map.size());
		
		
		map.insert("234", "4567");
		map.insert("124", "4567");
		map.insert("12345", "4567");
		map.insert("12348", "4567");
		
		System.out.println(map.size());
		
		
		
	}

}
