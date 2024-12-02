package section2.sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] a = {1,2,3,4,5};
		 bubbleSort(a);
		 for(int i: a) System.out.print(" "+i);
	}
	
	public static void bubbleSort(int[]a) {
		
		for(int i=0;i<a.length-1;i++) {
			boolean valueChanged = false;
			for(int j=0;j<a.length-1;j++) {
				if(a[j] >a[j+1]) {
					swap(a,j,j+1);	
					valueChanged = true;
				}
			}
			if(!valueChanged) {
				System.out.println("no value changed");
				break;
			}
		}
	}
	
	public static void swap(int[] a,int i,int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}


}
