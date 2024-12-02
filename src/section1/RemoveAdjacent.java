package section1;

import java.util.Stack;

public class RemoveAdjacent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(getAdjacent("abbac"));
		System.out.println(getAdjacent1("abbac"));

	}
	
	public static String getAdjacent(String s) {
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++) {
			if(stack.isEmpty() || s.charAt(i)!=stack.peek()) {
				stack.push(s.charAt(i));
			}else {
				stack.pop();
			}
		}
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		
		
		return sb.reverse().toString();
	}
	
	public static String getAdjacent1(String s) {
		int strP =-1;
		char[] c = s.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(strP ==-1 || c[strP]!=c[i]) {
				strP++;
				c[strP] = c[i];
			}else {
				strP--;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<=strP;i++) {
			sb.append(c[i]);
		}
		
		return sb.toString();
	}

}
