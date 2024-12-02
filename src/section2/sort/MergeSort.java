package section2.sort;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a = {4,5,3,2,1};
		mergeSort(a,0,a.length);
		for(int i:a)System.out.print(i+ " ");
	}
	
	public static void mergeSort(int[] a, int start, int end) {
		if(start >=end) {
			return;
		}
		int mid = (start+end)/2;
		
		int[] x = new int[mid - start + 1];
        int[] y = new int[end - mid];
        for (int i = start; i <= mid; i++) {
            x[i - start] = a[i];
        }
        for (int i = mid + 1; i <= end; i++) {
            y[i - mid - 1] = a[i];
        }
		mergeSort(x,start,mid);
		mergeSort(y,mid+1,end);
		mergeArrays(x,y,a,start,end);
	}
	
	public static void mergeArrays(int[] x, int []y,int[] a, int start , int end) {
		
		int mid = (start+end)/2;
		
		int x1 = 0;
		int y1 = 0;
		int k= start;
		while(x1 < x.length && y1 < y.length) {
			if(x[x1] > y[y1]) {
				a[k] = y[y1];
				y1++;
			}else {
				a[k] = x[x1];
				x1++;
			}
			k++;
		}
		
		while(x1 <x.length) {
			a[k] = x[x1];
			k++;
			x1++;
		}
		while(y1 <y.length) {
			a[k] = y[y1];
			k++;
			y1++;
		}
	}

}
