package section5.dp;

public class LongestCommonSubSequenceRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(lcs("ample","apple"));
		System.out.println(lcsdp1("ample","apple"));
	}
	
	public static int lcs(String s1, String s2) {
		
		return helper(s1,0,s2,0);
	}
	
	public static int helper(String s1,int i, String s2, int j) {
		if(i==s1.length() || s2.length() ==j) return 0;
		
		if(s1.charAt(i)==s2.charAt(j)) {
			return 1+ helper(s1,i+1,s2,j+1);
		}else {
			return Math.max(helper(s1,i,s2,j+1),helper(s1,i+1,s2,j));
		}
	}

	
	public static int lcsdp(String s1, String s2) {
		
		int[][] dp = new int[s1.length()+1][s2.length()+1];
		
		for(int i=0;i<=s1.length();i++) {
			for(int j=0;j<=s2.length();j++) {
				if(i==0 || j==0) continue;
				if(s1.charAt(i-1)== s2.charAt(j-1)) {
					dp[i][j] = 1+ dp[i-1][j-1];
				}else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		
		return dp[s1.length()][s2.length()];
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static int lcsdp1(String s1,String s2) {
		int m = s1.length()+1;
		int n= s2.length()+1;
		
		int[][] dp = new int[m][n];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || j==0) continue;
				if(s1.charAt(i-1)==s2.charAt(j-1)) {
					dp[i][j] = 1+ dp[i-1][j-1];
				}else {
					dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		
		return dp[m-1][n-1];
	}
}
