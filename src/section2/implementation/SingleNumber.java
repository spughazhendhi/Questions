package section2.implementation;

public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {4,1,2,1,2,41};
		System.out.println(single(a));
	}
	
	public static int single(int[] a) {
		int ans = 0;
		for(int i=0;i<a.length;i++) {
			ans = ans ^ a[i];
		}
		
		return ans;
	}

}
