package section5.dp;

public class UniquePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniquePath(4,5));
		System.out.println(uniquePath1(4,5));
	}
	
	public static int uniquePath(int m, int n) {
		int[][] dp = new int[m][n];
		
		for(int i=0;i<n;i++) {
			dp[0][i] = 1;
		}
		for(int i=0;i<m;i++) {
			dp[i][0] = 1;
		}
		
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				dp[i][j] = dp[i-1][j] + dp[i][j-1];
			}
		}
		
		
		return dp[m-1][n-1];
	}
	
	
	
	
	
	public static int uniquePath1(int m, int n) {
		int[][] dp = new int[m][n];
		for(int i=0;i<n;i++) {
			dp[0][i] =1;
		}
		for(int i=0;i<m;i++) {
			dp[i][0] =1;
		}
		
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				dp[i][j] = dp[i-1][j]+dp[i][j-1];
			}
		}
		
		return dp[m-1][n-1];
		
	}

}
