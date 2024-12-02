package section6.bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Cell{
	public int x;
	public int y;
	public int distance;
	Cell( int x,int y, int distance){
		this.x = x;
		this.y = y;
		this.distance = distance;
	}
}

public class ShortestPathMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> one = Arrays.asList(0,0,0);
		List<Integer> two = Arrays.asList(1,1,0);
		List<Integer> three = Arrays.asList(1,1,0);
		List<List<Integer>> list = new ArrayList<>();
		list.add(one); list.add(two);list.add(three);
		System.out.println(bfs(list));
	}
	
	public static int bfs(List<List<Integer>> list) {
		int row[] = {-1,-1,-1,0,0,1,1,1};
		int[] col = {-1,0,1,-1,1,-1,0,1};
		boolean [][] visited = new boolean[list.size()][list.size()];
		
		Queue<Cell> queue = new LinkedList<>();
		queue.add(new Cell(0,0,1));
		visited[0][0] = true;
		
		while(!queue.isEmpty()) {
			Cell cell = queue.poll();
			
			int x = cell.x;
			int y = cell.y;
			
			if(x == list.size() -1 && y == list.size()-1) {
				return cell.distance;
			}
			
			for(int i=0;i<row.length;i++) {
				int x1 = cell.x + row[i];
				int y1 = cell.y + col[i];
				
				if( x1 >=0 && x1 < list.size() && y1 >=0 && y1 < list.size() && !visited[x1][y1] && list.get(x1).get(y1)==0 ) {
					queue.add(new Cell(x1,y1,cell.distance+1));
					visited[x1][y1] = true;
				}
			}
		}
		
		return -1;
	}

}
