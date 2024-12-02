package section5.dp;

public class MinimumDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mD("horse",5,"ros",3));
		System.out.println(dp("horse","ros"));
		
	}
	
	public static int mD(String s1, int m, String s2 , int n) {
		if(m ==0) return n;
		if(n ==0) return m;
		
		if(s1.charAt(m-1)==s2.charAt(n-1)) {
			return mD(s1,m-1,s2,n-1);
		}
		
		int insert = mD(s1,m,s2,n-1);
		int delete = mD(s1,m-1,s2,n);
		int replace = mD(s1,m-1,s2,n-1);
		return 1+Math.min(insert, Math.min(delete, replace));
	}
	
	public static int dp(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();
		int[][] dp = new int[m+1][n+1];
		
		for(int i=0;i<=m;i++) {
			for(int j=0;j<=n;j++) {
				if(i==0) {
					dp[i][j] = j;
				}else if(j==0) {
					dp[i][j] = i;
				}else if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j] = dp[i-1][j-1];
				}else {
					int insert = dp[i][j-1];
					int delete = dp[i-1][j];
					int replace = dp[i-1][j-1];
					dp[i][j] = 1+ Math.min(insert, Math.min(delete, replace));
				}
			}
		}
		
		return dp[m][n];
	}
	
	

}
