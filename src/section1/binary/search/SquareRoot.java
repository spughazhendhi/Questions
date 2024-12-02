package section1.binary.search;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(squareRoot(50));
	}
	
	public static int squareRoot( int k) {
		
		int start =0;
		int end = k;
		int ans =0;
		while(start <=end) {
			int mid = (start+end)/2;
			if(mid * mid ==k) {
				return mid;
			}else if ( mid * mid < k) {
				ans = mid;
				start = mid+1;
			}else {
				end = mid-1;
			}
		}
		
		return ans;
		
	}

}
