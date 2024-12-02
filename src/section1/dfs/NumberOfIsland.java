package section1.dfs;

public class NumberOfIsland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] a= {
				{1,1,0,0,0},
				{1,1,0,0,0},
				{1,0,1,0,0},
				{0,0,0,1,1}
		};
		System.out.println(island(a));

	}
	
	
	public static int island(int[][] a) {
		boolean[][]visited = new boolean[a.length][a[0].length];
		
		int ans =0;
		int[] value = new int[1];
		int count =0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[0].length;j++) {
				if(a[i][j] ==1 && !visited[i][j]) {
					value[0] = 0;
					dfs(a,visited,i,j,value);
					ans = Math.max(ans,value[0]);
					count++;
				}
			}
		}
		return ans;
	}
	
	public static void dfs(int[][] a, boolean [][]visited,int i , int j,int[] value) {
		if(i < 0 || i >= a.length || j<0 || j >= a[0].length || visited[i][j]) {
			return;
		}
		
		if(a[i][j]==0) {
			return;
		}
		
		visited[i][j] = true;
		value[0]++;
		
		
		dfs(a,visited,i,j+1,value);
		dfs(a,visited,i,j-1,value);
		dfs(a,visited,i-1,j,value);
		dfs(a,visited,i+1,j,value);
		
	}

}
