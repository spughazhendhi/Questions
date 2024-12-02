package section6.kadanes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {3,2,1,3,5};
		System.out.println(missingNumber(a));
	}
	
	public static List<Long> missingNumber(int[] a){
		
		long sum =0, squareSum =0;
		int count =0;
		for(int i:a) {
			sum+=i;
			sum -= (count+1);
			squareSum += (i*i);
			squareSum-=((count+1) *(count+1));
			count++;
		}
		System.out.println("sum "+sum);
		System.out.println("square sum "+squareSum);
		long ABSum = squareSum/sum;
		
		long A = (ABSum+sum)/2;
		long B = ABSum - A;
		
		
		return Arrays.asList(A,B);
		
		
	}

}
