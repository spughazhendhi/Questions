package section3.trie;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TrieNode{
	public Boolean terminal = null;
	
	public TrieNode[] child = new TrieNode[26];
	
}

public class ShortestPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TrieNode root = new TrieNode();
		List<String> words = Arrays.asList("zebra","dog","duck","dove");
		//List<String> words = Arrays.asList("dog","zebra");
		insert(words,root);
		TrieNode[] child = root.child;
		for(int i=0;i<child.length;i++) {
			System.out.println(" i "+ i +" char " + (char)(i+'a') +"  " + child[i]);
		}
		
		List<String> result = new ArrayList<>();
		for(String s:words) {
			result.add(search(s,root));
		}
		System.out.println(result);
	}
	
	public static String  search(String s,TrieNode root) {
		StringBuilder sb = new StringBuilder();
	
		for(int i=0;i<s.length();i++) {
			if(root.child[s.charAt(i)-'a']==null) {
				break;
			}else {
				root = root.child[s.charAt(i)-'a'];
				sb.append(s.charAt(i));
				if(root.terminal) {
					break;
				}
			}
			
		}
		return sb.toString();
	}
	
	public static void insert(List<String> words,TrieNode parent) {
		
		TrieNode root = parent;
		for(String s:words) {
			 root = parent;
			for(int i=0;i<s.length();i++) {
				if(root.child[s.charAt(i)-'a']==null) {
					root.child[s.charAt(i)-'a'] = new TrieNode();
					//System.out.println(" char 1 "+ s.charAt(i) +" not null -->"+root.child[s.charAt(i)-'a']);
				}
				//System.out.println(" char 2  "+ s.charAt(i) +" not null -->"+root.child[s.charAt(i)-'a']);
				root = root.child[s.charAt(i)-'a'];
				if(root.terminal ==null) {
					root.terminal = true;
				}else if(root.terminal) {
					root.terminal = false;
				}
				//System.out.println(" char 3 "+ s.charAt(i) +" not null -->"+root.child[s.charAt(i)-'a']);
			}
			root.terminal = true;
		}
	}

}
