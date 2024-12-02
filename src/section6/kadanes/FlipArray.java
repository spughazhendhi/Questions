package section6.kadanes;

import java.util.ArrayList;
import java.util.List;

public class FlipArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(flip("010"));
	}
	
	public static List<Integer> flip(String s){
		List<Integer> result = new ArrayList<>();
		int left =0,right =0;
		int currentSum =0,maxSum = Integer.MIN_VALUE;
		for(int i=0;i<s.length();i++) {
			
			char s1 = s.charAt(i);
			if(s1=='0') {
				currentSum+=1;
			}else {
				currentSum+=-1;
			}
			if(currentSum > maxSum) {
				right =i;
				maxSum = currentSum;
			}
			
			if(currentSum < 0) {
				currentSum = 0;
				left =i;
			}
			
		}
		if(maxSum ==-1) {
			return result;
		}else {
			result.add(left+1);
			result.add(right+1);
		}
		
		return result;
	}

}
