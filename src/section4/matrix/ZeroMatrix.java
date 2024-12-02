package section4.matrix;

public class ZeroMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int[][] a = { {0,1,2,0}, {3,4,5,2}, {1,3,1,5} };
		 */
		/*
		 * int[][] a = { {1,2,3,4,0}, {5,3,0,2,1}, {2,4,5,0,9}, {7,2,1,3,7} };
		 */
		
		int[][] a = {
				{2,6,7,11},
				{3,8,10,12},
				{4,9,11,13},
				{5,15,16,18}
		};
		/*
		setZero(a);
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		*/
		System.out.println(findValue(a,9));
	}
	
	
	public static boolean findValue(int[][] a, int k) {
		boolean find = false;
		int row = 0;
		int col = a[0].length - 1;
		
		while(row < a.length  && col > 0) {
			int value = a[row][col];
			System.out.println(value );
			if(value == k) {
				return true;
			}
			if( k <value) {
				col--;
			}else {
				row++;
			}
			
		}
		return find;
	}
	
	
	public static void setZero(int[][] a) {
		boolean firstRow = false,firstColumn = false;
		
		for(int i=0;i<a[0].length;i++) {
			if(a[0][i] ==0) {
				firstRow = true;
				break;
			}
		}
		
		for(int i=0;i<a.length;i++) {
			if(a[i][0] ==0) {
				firstColumn = true;
				break;
			}
		}
		System.out.println("first Row "+firstRow);
		System.out.println("first col "+firstColumn);
		
		for(int i=1;i<a.length;i++) {
			for(int j=1;j<a[0].length;j++) {
				if(a[i][j]==0) {
					a[i][0] =0;
					a[0][j]  =0;
				}
			}
		}
		
		for(int i=1;i<a.length;i++) {
			for(int j=1;j<a[0].length;j++) {
				if(a[i][0]==0 || a[0][j] ==0) {
					a[i][j] =0;
				}
			}
		}
		
		
		
		if(firstRow) {
			setRow(a,0);
		}
		if(firstColumn) {
			setCol(a,0);
		}
	}
	
	public static void setRow(int[][] a,int row) {
		
		for(int i=0;i<a[0].length;i++) {
			a[row][i] = 0;
		}
		
	}
	public static void setCol(int[][] a,int col) {
		for(int i=0;i<a.length;i++) {
			a[col][i] = 0;
		}
	}


}
