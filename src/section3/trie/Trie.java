package section3.trie;

import java.util.HashMap;
import java.util.Map;

class ANode{
	
	ANode[] child = new ANode[26];
	boolean isTerminal = false;
}

class HashNode{
	Map<Character,HashNode> child = new HashMap<>();
	boolean isTerminal = false;
}
public class Trie {
	
	public void insert1(String word, HashNode root) {
		for(int i=0;i<word.length();i++) {
			if(!root.child.containsKey(word.charAt(i))) {
				root.child.put(word.charAt(i), new HashNode());
			}
			root = root.child.get(word.charAt(i));
		}
		root.isTerminal = true;
	}
	
	public boolean search1(String word,HashNode root) {
		for(int i=0;i<word.length();i++) {
			if(!root.child.containsKey(word.charAt(i))) {
				return false;
			}
			root = root.child.get(word.charAt(i));
		}
		return root.isTerminal ;
	}
	
	public void insert(String word, ANode root) {
		for(int i=0;i<word.length();i++) {
			ANode node = root.child[word.charAt(i)-'A'];
			if(node ==null) {
				root.child[word.charAt(i)-'A'] = new ANode();
			}
			
			root = root.child[word.charAt(i)-'A'];
			
		}
		root.isTerminal = true;
	}
	
	public boolean search(String word,ANode root) {
		for(int i=0;i<word.length();i++) {
			ANode node = root.child[word.charAt(i)-'A'];
			if(node ==null) return false;
			root = root.child[word.charAt(i)-'A'];
		}
		
		
		
		return root.isTerminal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ANode root = new ANode();
		Trie ob = new Trie();
		ob.insert("ABC", root);
		ob.insert("BCD", root);
		ob.insert("APPLE", root);
		ob.insert("TEACH", root);
		System.out.println(ob.search("ABC", root));
		System.out.println(ob.search("WAPPL", root));
		
		
		HashNode hash = new HashNode();
		ob.insert1("ABC", hash);
		ob.insert1("BCD", hash);
		ob.insert1("APPLE", hash);
		ob.insert1("TEACH", hash);
		System.out.println(ob.search1("ABC", hash));
		System.out.println(ob.search1("WAPPL", hash));

	}

}
