package section2.sort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] a = {3,8,1,3,2,1};
 selectionSort(a);
 for(int i: a) System.out.print(" "+i);
	}
	
	public static void selectionSort(int[] a) {
		
		for(int i=0;i<a.length-1;i++) {
			int temp = i;
			for(int j =i+1;j<a.length;j++) {
				if(a[temp] > a[j]) {
					temp =j;
				}
			}
			if(temp !=i) {
				swap(a,i,temp);
			}
		}
	}
	
	public static void swap(int[] a,int i,int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}
