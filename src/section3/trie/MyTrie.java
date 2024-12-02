package section3.trie;

class Node{
	public boolean isTerminal;
	public Node[] child = new Node[26];
}

public class MyTrie {
	
	
	
	public void insert(String word,Node root) {
		
		for(int i=0;i<word.length();i++) {
			if(root.child[word.charAt(i) -'A']==null) {
				root.child[word.charAt(i) -'A'] = new Node();
			}
			root = root.child[word.charAt(i)-'A'];
			
		}
		root.isTerminal = true;
	}
	
	public boolean search(String word,Node root) {
		for(int i=0;i<word.length();i++) {
			if(root.child[word.charAt(i) -'A']!=null) {
				System.out.println("inside chart "+word.charAt(i));
				root = root.child[word.charAt(i)-'A'];
			}else {
				return false;
			}
		}
		return root.isTerminal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node();
		MyTrie ob = new MyTrie();
		ob.insert("ABC", root);
		ob.insert("BCD", root);
		ob.insert("APPLE", root);
		ob.insert("TEACH", root);
		System.out.println(ob.search("ABC", root));
		System.out.println(ob.search("WAPPL", root));
	}

}
