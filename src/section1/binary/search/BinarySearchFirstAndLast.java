package section1.binary.search;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchFirstAndLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {5,7,8,8,10};
		System.out.println(getFirst(a,18));
	}
	
	public static List<Integer> getFirst(int[] a, int k){
		
		int first = getIndex(a,k,true);
		int last = getIndex(a,k,false);
		
		List<Integer> al = new ArrayList<>();
		al.add(first);
		al.add(last);
		
		return al;
	}
	
	
	
	public static int getIndex(int[] a, int k,boolean first) {
		
		int start =0;
		int end = a.length-1;
		
		int ans =-1;
		while(start <=end) {
			int mid = start + (end-start)/2;
			
			if(a[mid]==k) {
				ans = mid;
				if(first) {
					end = mid-1;
				}else {
					start = mid+1;
				}
			}else if(k > a[mid]) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		
		return ans;
	}

}
