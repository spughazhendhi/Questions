package section5.dp;

public class MinimumSteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(recur(25));
		System.out.println(topdown(25));
		System.out.println(bottomup(25));
	}
	
	public static int recur(int n) {
		
		if(n==1) return 0;
		
		int y = Integer.MAX_VALUE;
		int z = Integer.MAX_VALUE;
		int x = recur(n-1);
		
		if(n%3==0) {
			y = recur(n/3);
		}
		if(n%2==0) {
			z = recur(n/2);
		}
		
		return Math.min(x, Math.min(y, z))+1;
	}
	
	public static int topdown(int n) {
		int [] a = new int[n+1];
		for(int i = 2;i<a.length;i++) {
			a[i] = -1;
		}
		return helper(n,a);
	}
	
	public static int helper(int n, int[] a) {
		if(n==1) return 0;
		
		if(a[n]!=-1) {
			return a[n];
		}
		int y = Integer.MAX_VALUE;
		int z = Integer.MAX_VALUE;
		int x = recur(n-1);
		
		if(n%3==0) {
			y = recur(n/3);
		}
		if(n%2==0) {
			z = recur(n/2);
		}
		
		int output =  Math.min(x, Math.min(y, z))+1;
		a[n] = output;
		return output;
	}
	
	public static int bottomup(int n) {
		int [] dp = new int[n+1];
		dp[0]=0;
		dp[1] =0;
		
		for(int i=2;i<=n;i++) {
			int y = Integer.MAX_VALUE;
			int z = Integer.MAX_VALUE;
			int x = dp[i-1];
			if(i%3==0) {
				y = dp[i/3];
			}
			if(i%2==0) {
				z = dp[i/2];
			}
			dp[i] = Math.min(x, Math.min(y, z))+1;;
			
		}
		
		return dp[n];
	}

}
