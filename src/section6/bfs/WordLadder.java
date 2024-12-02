package section6.bfs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

class Node{
	String word;
	int count;
	Node(String word, int count){
		this.count=count;
		this.word =word;
	}
}
public class WordLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("hot","dot","dog","lot","log","cog");
		System.out.println(wordCount("hit","cog",list));
	}
	
	public static int wordCount(String start, String end, List<String> list) {
		Set<String> visited = new HashSet<>();
		visited.add(start);
		
		Queue<Node> queue = new LinkedList<>();
		queue.add( new Node(start,1));
		
		Set<String> wordsToPresent = new HashSet<>();
		for(String s:list) {
			wordsToPresent.add(s);
		}
		
		
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			String word = node.word;
			//System.out.println("word here "+word);
			if(node.word.equalsIgnoreCase(end)) {
				return node.count;
			}
			
			for(int i=0;i<word.length();i++) {
				for(int j=0;j< 26;j++) {
					char replace = (char) ('a'+j);
					String newWord = word.replace(word.charAt(i), replace);
					
					if(!visited.contains(newWord) && wordsToPresent.contains(newWord)) {
						System.out.println("new Word "+newWord);
						queue.add(new Node(newWord,node.count+1));
						visited.add(newWord);
					}
				}
			}
			
		}
		
		return 0;
		
	}

}
