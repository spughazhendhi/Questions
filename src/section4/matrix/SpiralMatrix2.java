package section4.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {
				{1,2,3,7},
				{4,5,6,8},
				{7,8,9,2}
		};
		printSpiral(a);
	}
	
	public static void printSpiral(int[][] a) {
		
		List<Integer> list = new ArrayList<>();
		
		int row = a.length;
		int col = a[0].length;
		
		int sr=0,er= row-1,sc=0,ec = col-1;
		int count =0;
		while(sr<=er && sc <=ec) {
			
			for(int i=sr;i<=ec;i++) {
				list.add(a[sr][i]);
				count++;
			}
			
			if(count == row*col) break;
			sr++;
			
			for(int i=sr;i<=er;i++) {
				list.add(a[i][ec]);
				count++;
			}
			
			if(count == row*col) break;
			ec--;
			
			for(int i=ec;i >=sc;i--) {
				list.add(a[er][i]);
				count++;
			}
			
			if(count == row*col) break;
			er--;
			
			for(int i=er;i >=sr;i--) {
				list.add(a[i][sc]);
				count++;
			}
			
			if(count == row*col) break;
			sc++;
			
		}
		System.out.println(list);
	}

}
