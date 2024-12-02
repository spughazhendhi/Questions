package section1.binary.search;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = new int[1234567867];
		System.out.println(binarySearch1(a,5));
	}
	
	public static int binarySearch1(int[] a,int k) {
		int start =0;
		int end = a.length-1;
		
		while(start <=end) {
			//int mid = start + (end-start)/2;
			int mid = start+end/2;
			if(a[mid]==k) {
				return mid;
			}else if( k > a[mid]) {
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int binarySearch(int[] a,int k) {
		
		int start = 0;
		int end = a.length;
		
		int count =0;
		
		while(start <=end) {
			
			count++;
			if(count ==10) break;
			int mid = start + (end-start)/2;
			System.out.println("start "+start +" end "+end +"mid "+mid);
			if(a[mid] ==k) {
				return mid;
			}else if( k > a[mid]) {
				start = mid+1;
				
			}else {
				end = mid-1;
			}
		}
		return -1;
	}

}
