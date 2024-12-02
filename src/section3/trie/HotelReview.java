package section3.trie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class HTrie{
	public HTrie[] character = new HTrie[26];
	public boolean terminal = false;
}
public class HotelReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> words = Arrays.asList("cold","ice","wifi");
		List<String> search = Arrays.asList("water_is_cold","ice_is_cool","ice_wifi_true");
		
		HTrie root = new HTrie();
		addWords(words,root);
		List<Integer> result = new ArrayList<>();
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
		
		int index =0;
		for(String s:search) {
			int count =0;
			for(String s1:s.split("_")) {
				if(search(root,s1)) {
					count++;
				}
			}
			//result.add(count);
			map.put(index, count);
			index++;
		}
		System.out.println(map);
		LinkedHashMap<Integer,Integer> sorted = map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(
				Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(oldValue, newValue) -> oldValue ,LinkedHashMap::new));
			
		
		System.out.println(new ArrayList<>(sorted.keySet()));
		
		Map<String,String> map1 = new HashMap<>();
		map1.put(" ", "space");
		map1.put("", "space1");
		System.out.println(map1.get(" "));
		char c=' ';
		System.out.println((int)c);
	}
	
	public static void addWords(List<String> words,HTrie parent) {
		
		
		for(String s:words) {
			HTrie trie = parent;
			for(int i=0;i<s.length();i++) {
				if(trie.character[s.charAt(i)-'a'] ==null) {
					trie.character[s.charAt(i)-'a'] = new HTrie();
				}
				trie = trie.character[s.charAt(i)-'a'];
			}
			trie.terminal = true;
		}
	}
	
	public static boolean search(HTrie trie, String s) {
		for(int i=0;i<s.length();i++) {
			if(trie.character[s.charAt(i)-'a'] ==null) {
				return false;
			}
			trie = trie.character[s.charAt(i)-'a'];
		}
		return trie.terminal ;
	}

}
