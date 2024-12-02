package section7.lru;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LRUCache1 {
	
	Map<Integer,Integer> map = new HashMap<>();
	LinkedList<Integer> list = new LinkedList<>();
	int capacity;
	
	LRUCache1(int capacity){
		this.capacity = capacity;
	}
	
	int get(int key) {
		if(!map.containsKey(key)) {
			return -1;
		}
		
		list.remove(Integer.valueOf(key));
		list.addFirst(key);
		
		return map.get(key);
	}
	
	
	void put(int key,int value) {
		if(map.containsKey(key)) {
			map.put(key, value);
			list.remove(Integer.valueOf(key));
			list.addFirst(key);
		}else {
			if(map.size() == capacity) {
				int key1 = list.removeLast();
				map.remove(key1);
			}
			map.put(key, value);
			list.addFirst(key);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LRUCache1 cache = new LRUCache1(2);
		cache.put(1,1);
		cache.put(2,2);
		System.out.println(cache.get(1));
		System.out.println(cache.get(2));
		cache.put(3,3);
		
		System.out.println(cache.get(3));
		System.out.println(cache.get(1));
	}

}
