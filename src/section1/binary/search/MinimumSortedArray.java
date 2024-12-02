package section1.binary.search;

public class MinimumSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {4,5,1,2,3};
		System.out.println(minimum(a));
	}
	
	public static int minimum(int[] a) {
		int start =0;
		int end = a.length -1;
		int n = a.length;
		
		while(start <=end) {
			int mid = (start+end)/2;
			int next = (mid+1);
			if(next > a.length-1) {
				next =0;
			}
			int prev = mid-1;
			if(prev <=0) {
				prev = a.length-1;
			}
			
			if(a[mid]<= a[prev] && a[mid]<=a[next]) {
				return a[mid];
			}
			else if ( a[mid] <= a[end]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
			
		}
		
		return -1;
	}

}
