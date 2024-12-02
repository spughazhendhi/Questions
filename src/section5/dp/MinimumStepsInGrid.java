package section5.dp;

import java.util.Arrays;
import java.util.List;

public class MinimumStepsInGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a1 = Arrays.asList(0,1,1);
		List<Integer> a2 = Arrays.asList(0,1,2);
		System.out.println(minimumSteps(a1,a2));
	}
	
	public static int minimumSteps(List<Integer> a1,List<Integer> a2) {
		
		int steps =0;
		for(int i = 0;i<a1.size()-1;i++) {
			steps += Math.max(Math.abs(a1.get(i+1) - a1.get(i)), Math.abs(a2.get(i+1)- a2.get(i)));
		}
		
		return steps;
	}

}
