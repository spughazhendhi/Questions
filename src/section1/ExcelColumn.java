package section1;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ExcelColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(getColumn("AAA"));
		System.out.println(evaluate(Arrays.asList("6","3","+","5","/")));
	}
	
	
	public static double evaluate(List<String> value) {
		
		Stack<Integer> operand = new Stack<>();
		//Stack<String> operators = new Stack<>();
		
		for(String s:value) {
			if(s.equalsIgnoreCase("+") || s.equalsIgnoreCase("-") || s.equalsIgnoreCase("*") || s.equalsIgnoreCase("/")) {
				
				int right = operand.pop();
				int left = operand.pop();
				int result =0;
				System.out.println("left "+left +" right "+right);
				if(s.equalsIgnoreCase("+")) {
					result = left+right;
				}else if(s.equalsIgnoreCase("-")) {
					result = left-right;
				}else if(s.equalsIgnoreCase("*")) {
					result = left*right;
				}else {
					result = left/right;
				}
				System.out.println("result her e"+result);
				operand.push(result);
				
			}else {
				System.out.println("else part here "+s);
				operand.push(Integer.parseInt(s));
				System.out.println("stack 1 "+operand);
			}
		}
		
		return operand.pop();
	}
	
	public static int getColumn(String a) {
		int answer =0;
		int pow =1;
		for(int i=a.length()-1;i>=0 ;i--) {
			 int value = a.charAt(i) -'A'+1;
			 System.out.println("value "+value);
			 
			answer += pow * value; 
			pow = pow * 26;
		}
		
		
		
		
		return answer;
	}

}
