package section4.heap;

public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {16,6,3,2,20};
		sort(a);
	}
	
	public static void sort(int[] a) {
		for(int i=1;i<a.length;i++) {
			int ci =i;
			while(ci > 0) {
				int parent = (ci-1)/2;
				if(a[ci]< a[parent]) {
				swap(a,ci,parent);
				ci = parent;
				}else {
					break;
				}
			}
		}
		
		for(int i:a)System.out.println(i+" ");
		//
		
		for(int i=a.length-1;i>=0;i--) {
			swap(a,0,i);
			int parent =0;
			
			while(true) {
				int left = 2*parent +1;
				int right = 2*parent +2;
				int mid = parent;
				
				if( left < i && a[left] < a[mid]) {
					mid = left;
				}
				if( right < i && a[right] < a[mid]) {
					mid = right;
				}
				if(mid == parent ) break;
				swap(a,mid,parent);
				mid = parent;
			}
			
		}
		for(int i:a)System.out.println(i+" ");
	}
	
	
	public static void swap(int[] a,int i,int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j]= temp;
	}


}
