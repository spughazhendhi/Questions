package section2.sort;

public class MergeSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] a = {4,5,3,2,1};
		mergeSort(a,0,a.length-1);
		for(int i:a)System.out.print(i+ " ");
	}
	
	public static void mergeSort(int[] a, int start, int end) {
		if(start >=end) {
			return;
		}
		int mid = (start+end)/2;
		mergeSort(a,start,mid);
		mergeSort(a,mid+1,end);
		mergeArrays(a,start,end);
		
	}
	
	public static void mergeArrays(int[] a, int start, int end) {
		
		int mid =(start+end)/2;
		
		int [] a1 = new int[mid-start+1];
		int[] a2 = new int[end-mid];
		
		for(int i=0;i<a1.length;i++) {
			a1[i] = a[i+start];
		}
		
		for(int j=0;j<a2.length;j++) {
			a2[j] = a[j+mid+1];
		}
		
		int i=0,j=0,k= start;
		
		while(i < a1.length && j< a2.length) {
			if(a1[i]<a2[j]) {
				a[k] = a1[i];
				i++;
				k++;
			}else {
				a[k] = a2[j];
				j++;
				k++;
			}
		}
		
		while(i < a1.length) {
			a[k] = a1[i];
			i++;
			k++;
		}
		
		while(j < a2.length) {
			a[k] = a2[j];
			j++;
			k++;
		}
	}

}
