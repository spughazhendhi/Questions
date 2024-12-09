package section11.permutation;

public class RotateMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a = { 
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		reverseMatrix(a);
		printMatrix(a);
	}
	
	public static void printMatrix(int[][]a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
	}
	
	public static void reverseMatrix(int[][] a) {
		int m = a.length;
		int n = a[0].length;
		
		/*
		for(int i=0;i<m;i++) {
			for(int j=i;j<n;j++) {
				swap(a,i,j);
			}
		}
		*/
		
/* reverse column */
		
		for( int i=0;i<n;i++) {
			int s=0;int end = m-1;
			while(s<=end) {
				swap2(a,i,s,end);
				s++;
				end--;
			}
			}
		
		/* reverse row */
	
		for( int i=0;i<m;i++) {
			int s=0;int end = n-1;
			while(s<=end) {
				swap1(a,i,s,end);
				s++;
				end--;
			}
			}
		
		
		
		}
	
	public static void swap1(int[][]a ,int row,int i , int j) {
		int temp = a[row][i];
		a[row][i] = a[row][j];
		a[row][j] = temp;
	}
	
	public static void swap2(int[][]a ,int row,int i , int j) {
		int temp = a[i][row];
		a[i][row] = a[j][row];
		a[j][row] = temp;
	}
	
	
	public static void swap(int[][]a ,int i , int j) {
		int temp = a[i][j];
		a[i][j] = a[j][i];
		a[j][i] = temp;
	}

}
