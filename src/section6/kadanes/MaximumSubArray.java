package section6.kadanes;

public class MaximumSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maximum(a));
	}
	
	public static int maximum(int[] a) {
		
		int maxSum = Integer.MIN_VALUE;
		
		int currentSum =0;
		
		for(int i:a) {
			currentSum+=i;
			maxSum = Math.max(maxSum, currentSum);
			if(currentSum<0) {
				currentSum =0;
			}
		}
		
		return maxSum;
	}

}
