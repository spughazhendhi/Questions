package section1;

import java.util.Stack;

class Pair{
	public char c;
	public int count;
	
}

public class RemoveKAdjacent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="aaaaaa";
		System.out.println(removeAdjacent(s,2));
	}
	
	public static String removeAdjacent(String s,int K) {
		Stack<Pair> stack = new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(stack.isEmpty()) {
				Pair p = new Pair();
				p.c = c;
				p.count = 1;
				stack.push(p);
			}else {
				Pair top = stack.peek();
				if(top.c ==c) {
					top.count++;
					if(top.count==K) {
						stack.pop();
					}
				}else {
					Pair p = new Pair();
					p.c = c;
					p.count = 1;
					stack.push(p);
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		while(!stack.isEmpty()) {
			Pair top = stack.pop();
			int i = top.count;
			while( i >0) {
				sb.append(top.c);
				i--;
			}
		}
		
		return sb.reverse().toString();
	}

}
