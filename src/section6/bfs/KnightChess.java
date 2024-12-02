package section6.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class KnightChess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println(bfs(8,8,1,1,8,8));
			
	}
	
	
	
	public static int bfs(int m,int n,int s1, int s2, int e1, int e2) {
		
		boolean[][] visited = new boolean[m+1][n+1];
		Queue<Cell> queue = new LinkedList<>();
		int[] row = {-2,-1,1,2,-2,-1,1,2};
		int[] col = {-1,-2,-2,-1,1,2,2,1};
		queue.add(new Cell(s1,s2,0));
		visited[s1][s2] = true;
		while(!queue.isEmpty()) {
			Cell cell = queue.poll();
			if(cell.x == e1 && cell.y ==e2) {
				return cell.distance;
			}
			System.out.println("cell value "+cell.x + "  "+cell.y);
			
			for(int i =0;i<8;i++) {
				int x = cell.x + row[i];
				int y = cell.y + col[i];
				
				if( x >0 && x <= m && y >0 && y <= n && visited[x][y] ==false) {
					queue.add(new Cell(x,y,cell.distance+1));
					visited[x][y] = true;
				}
			}
			
			
		}
		
		return -1;
	}

}
