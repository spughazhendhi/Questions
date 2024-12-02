package section6.bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RottenOranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> one = Arrays.asList(2,1,1);
		List<Integer> two = Arrays.asList(1,1,0);
		List<Integer> three = Arrays.asList(0,1,1);
		List<List<Integer>> list = new ArrayList<>();
		list.add(one); list.add(two);list.add(three);
		System.out.println(rotten(list));
	}
	
	public static int rotten(List<List<Integer>> list) {
		int m = list.size();
		int n = list.get(0).size();
		
		boolean [][] visited = new boolean[m][n];
		
		int[] row = {0,-1,1,0};
		int[] col = {-1,0,0,1};
		
		Queue<Cell> queue = new LinkedList<>();
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(list.get(i).get(j) ==2) {
					queue.add(new Cell(i,j,0));
					visited[i][j] = true;
				}
			}
		}
		int time =0;
		while(!queue.isEmpty()) {
			Cell cell = queue.poll();
			time = Math.max(0, cell.distance);
			for(int i=0;i<row.length;i++) {
				int x = cell.x + row[i];
				int y = cell.y + col[i];
				if( x >=0 && x < m && y>=0 && y < n && !visited[x][y] && list.get(x).get(y)==1) {
					list.get(x).set(y, 2);
					visited[x][y] = true;
					queue.add(new Cell(x,y,cell.distance+1));
				}
			}
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(list.get(i).get(j)+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(list.get(i).get(j) ==1) {
					return -1;
				}
			}
		}
		
		return time;
		
	}

}
