package section2.sort;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,5,3,2,1};
		quickSort(a,0,a.length-1);
		for(int i:a)System.out.print(i+ " ");
	}
	
	public static void quickSort(int[] a, int start,int end) {
		if(start >= end) {
			return ;
		}
		
		int p = partitition(a,start,end);
		quickSort(a,start,p-1);
		quickSort(a,p+1,end);
	}
	
	public static int partitition(int[] a , int start , int end) {
		int pivot = a[end];
		int i = start;
		for(int j= start;j< end;j++) {
			if(a[j] <pivot) {
				swap(a,i,j);
				i++;
			}
		}
		swap(a,i,end);
		return i;
	}
	
	public static void swap(int[] a, int i , int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
				
	}

}
