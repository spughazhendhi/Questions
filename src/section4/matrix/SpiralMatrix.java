package section4.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

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
		int row = a.length;
		int col = a[0].length;
		List<Integer> list = new ArrayList<>();
		
		
		int count =0;
		
		int sr = 0;
		int er = row-1;
		int sc =0;
		int ec = col-1;
		
		while(sr <= er && sc <=ec) {
			
			for(int i= sr;i<=ec;i++) {
				list.add(a[sr][i]);
				count++;
			}
			sr++;
			if(count == row*col) break;
			for(int i= sr;i<=er;i++) {
				list.add(a[i][ec]);
				count++;
			}
			ec--;
			if(count == row*col) break;
			
			for(int i= ec;i >=sc;i--) {
				list.add(a[er][i]);
				count++;
			}
			er--;
			if(count == row*col) break;
			
			for(int i= er;i >=sr;i--) {
				System.out.println("inside here");
				list.add(a[i][sc]);
				count++;
			}
			sc++;
			if(count == row*col) break;
		}
		
		System.out.println(list);
	}

}
