package section1;

import java.util.Stack;

public class ValidParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("}}"));
	}
	
	public static boolean isValid(String s) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			
			if(c =='(' || c=='{' || c=='[') {
				stack.push(c);
			}
			else {
				if(stack.isEmpty()) return false;
				char c1 = stack.peek();
				if((c==')' && c1=='(')  ||  (c=='}' && c1=='{') || (c==']' && c1=='[')) {
					stack.pop();
				}else {
					return false;
				}
			}
		}
		
		return stack.isEmpty();
	}

}
