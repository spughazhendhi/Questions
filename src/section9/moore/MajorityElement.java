package section9.moore;

public class MajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,2,1,1,1,2,2,1,2};
		System.out.println(majorityElement(a));
	}
	
	public static int majorityElement(int [] a) {
		
		int count =1;
		int majority = a[0];
		
		for(int i=1;i<a.length;i++) {
			if(majority ==a[i]) {
				count++;
			}else {
				count--;
				if(count ==0) {
					majority = a[i];
					count =1;
				}
			}
		}
		
		return majority;
	}

}
