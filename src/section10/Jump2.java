package section10;

public class Jump2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,3,1,1,4};
		int [] a1= {3,2,1,0,4};
		System.out.println(jump(a));
		System.out.println(jump(a1));
	}
	
	public static int jump(int[] a) {
		
		
		int jump =1;
		int ladder = a[0];
		int stairs = a[0];
		
		for(int i=1;i<a.length;i++) {
			if(i==a.length-1) {
				return jump;
			}
			if(a[i]+i > ladder) {
				ladder = a[i]+i;
			}
			stairs--;
			
			if(stairs==0) {
				if( i >= ladder) {
					return -1;
				}
				stairs = ladder -i;
				jump++;
			}
			
		}
		
		return -1;
	}

}
