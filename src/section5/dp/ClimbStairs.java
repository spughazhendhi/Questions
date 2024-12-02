package section5.dp;

public class ClimbStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(climb(4));
		System.out.println(climbdp(40));
		System.out.println(climbdpgen(40,2));
	}
	
	public static int climb(int n) {
		if(n==0) return 1;
		if(n==1) return 1;
		return climb(n-1)+climb(n-2);
	}
	
	public static int climbdp(int n) {
		
		int[] dp = new int[n+1];
		dp[0]= 1;
		dp[1] = 1;
		for(int i=2;i<=n;i++) {
			dp[i]= dp[i-1]+dp[i-2];
		}
		
		return dp[n];
	}
	
	public static int climbdpgen(int n,int k) {
		int[] dp = new int[n+1];
		dp[0]= 1;
		for(int i=1;i<=n;i++) {
			int ans=0;
			for(int jump =1;jump<=k;jump++) {
				if(i-jump>=0){
					ans +=dp[i-jump];
				}
			}
			dp[i] = ans;
		}
		
		return dp[n];
		
	}

}
