package section11.permutation;

import java.util.ArrayList;
import java.util.List;

public class TwoClassSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,4,6,8,10,45};
		System.out.println(twoSum(a,2));
	}
	
	public static List<Integer> twoSum(int[] a,int target){
		List<Integer> result = new ArrayList<>();
		
		int start =0;
		int end = a.length-1;
		
		while(start<end) {
			if(a[start]+a[end]== target) {
				result.add(start);
				result.add(end);
				return result;
			}else if( a[start]+a[end] > target) {
				end--;
			}else {
				start++;
			}
		}
		
		return result;
		
	}

}
