package section4.heap;

public class InHeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {16,6,3,2,20};
		sort(a);
	}
	public static void sort(int[] a) {
		
		for(int i=1;i<a.length;i++) {
			int cI = i;
			while(cI >0) {
				int parent = (cI-1)/2;
				if(a[parent] < a[cI]) {
					break;
				}
				swap(a,cI,parent);
				cI = parent;
				
				
			}
		}
		
		/*
		for(int i= a.length-1;i>=0;i--) {
			swap(a,0,i);
		//	System.out.println(a[i]);
			size--;
			int parent =0;
			
			
			while(true) {
				int left = 2 * parent +1;
				int right = 2*parent +2;
				int min =parent;
				if(left < size && a[left] < a[min]) {
					min = left;
				}
				if(right < size && a[right] < a[min]) {
					min =right;
				}
				if(min==parent) {
					break;
				}
				swap(a,min,parent);
				parent = min;
			}
		}*/
		
		
		for(int i:a)System.out.println(i+" ");
		System.out.println("after ");
		for(int i=a.length-1 ;i>= 0 ;i--) {
			swap(a,0,i);
			int parent =0;
			while(true) {
				int left = 2*parent+1;
				int right = 2*parent+2;
				int min = parent;
				
				if(left < i && a[left] < a[min]) {
					min = left;
				}
				if(right < i && a[right] < a[min]) {
					min = right;
				}
				
				if(min == parent) break;
				swap(a,min,parent);
				parent = min;
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
