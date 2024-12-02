package section1.binary.search;

public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 3,4,5,1,2};
		System.out.println(search(a,3));
		System.out.println(search2(a,3));
	}
	
	public static int search(int[] a,int k) {
		int start =0;
		int end = a.length-1;
		while(start <= end) {
		
			int mid = start +(end-start)/2;
			if(a[mid]==k) {
				return mid;
			}else if ( a[mid] >= a[start]) {
				
				if(k >= a[start] && k <= a[mid]) {
					
					end = mid-1;
				}else {
					start = mid+1;
				}
			}else {
				
				if(k <= a[end] && k >= a[mid]) {
					start = mid+1;
				}else {
					end = mid-1;
				}
			}
		}
		
		return -1;
		
	}
	
	
	
	
	public static int search2(int[]a ,int k) {
		int start =0;
		int end = a.length-1;
		
		while( start <=end) {
			int mid = (start+end)/2;
			if(a[mid]==k) {
				return mid;
			}
			
			if(a[mid]>= a[start]) {
				if(k >= a[start] && k <= a[mid]) {
					end = mid-1;
				}else {
					start = mid+1;
				}
			}else {
				if( k <= a[end]  && k >= a[mid]) {
					start = mid+1;
				}else {
					end = mid-1;
				}
			}
		}
		
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
