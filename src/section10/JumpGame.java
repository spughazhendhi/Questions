package section10;

public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a = {2,3,1,1,4};
		int [] a1= {3,2,1,0,4};
		System.out.println(canJump(a));
		System.out.println(canJump(a1));
	}
	
	public static boolean canJump(int[] a) {
		
		int goodIndex = a[a.length-1];
		for(int i= a.length-2;i>=0;i--) {
			if(i+a[i] >=goodIndex) {
				goodIndex =i;
			}
		}
		
		
		 return goodIndex==0;
	}

}
