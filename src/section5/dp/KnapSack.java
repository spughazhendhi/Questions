package section5.dp;

import java.util.Arrays;
import java.util.List;

public class KnapSack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> price = Arrays.asList(60,100,120);
		List<Integer> weight = Arrays.asList(10,20,30);
		System.out.println(knapSack(price,weight,50));
		System.out.println(knapSackdp(price,weight,50));
		System.out.println(knapSackdp1(price,weight,50));
	}
	
	public static int knapSackdp(List<Integer> price, List<Integer> weight, int knap){
		int[][] dp = new int[weight.size()+1][knap+1];
		
		for(int i=0;i<= weight.size();i++) {
			for(int j=0;j<=knap;j++) {
				if(i==0 || j==0) continue;
				if(weight.get(i-1) > j) {
					dp[i][j] = dp[i-1][j];
				}else {
					int include = price.get(i -1) + dp[i-1][j-weight.get(i-1)];
					int exclude = 0+ dp[i-1][j];
					dp[i][j]= Math.max(include, exclude);
				}
			}
		}
		return dp[weight.size()][knap];
	}
	
	public static int knapSack(List<Integer> price, List<Integer> weight, int knap) {
		return helper(price,weight, weight.size(),knap);
	}
	public static int helper(List<Integer> price, List<Integer> weight, int weightSize, int knapWeight) {
		if(knapWeight <=0 || weightSize==0) {
			return 0;
		}
		
		
		if(weight.get(weightSize-1) > knapWeight) {
			return helper(price,weight, weightSize-1,knapWeight);
		}else {
			int include = price.get(weightSize -1) + helper(price,weight, weightSize-1,knapWeight - weight.get(weightSize-1));
			int exclude =  helper(price,weight, weightSize-1,knapWeight);
			return Math.max(include, exclude);
		}
	}
	
	
	
	public static int knapSackdp1(List<Integer> price, List<Integer> weight, int knap){
		int[][] dp = new int[weight.size()+1][knap+1];
		
		for(int i=0;i<=weight.size();i++) {
			for(int j=0;j<=knap;j++) {
				if(i==0 || j==0) continue;
				if(weight.get(i-1) > j ) {
					dp[i][j] = dp[i-1][j];
				}else {
					int include = price.get(i-1) + dp[i-1][j-weight.get(i-1)];
					int exclude = dp[i-1][j];
					dp[i][j] = Math.max(include, exclude);
				}
			}
		}
		
		return dp[weight.size()][knap];
	}
	

}
