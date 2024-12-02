package section5.fibnoacci;

public class FibonnaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(fib(50));
		System.out.println(fib3(10));
		System.out.println(fib4(10));
		//System.out.println(fib2(50,new int[51]));
	}
	
	public static int fib(int n) {
		if(n==0 || n==1) return n;
		return fib(n-1)+ fib(n-2);
	}
	
	public static int fib2(int n,int[] arr) {
		if(n==0 || n==1) return n;
		if(arr[n]!=0) {
			return arr[n];
		}
		int output = fib2(n-1,arr) + fib2(n-2,arr);
		arr[n] = output;
		return output;
	}
	
	public static int fib3(int n) {
		int[] a= new int[n+1];
		
		a[0]=0;
		a[1]=1;
		
		for(int i=2;i<a.length;i++) {
			a[i] = a[i-1]+a[i-2];
		}
		
		return a[n];
	}
	
	public static int fib4(int n) {
		int first=0;
		int second =1;
		int third =0;
		
		for(int i=2;i<=n;i++) {
			int temp = second;
			second = first+second;
			first = temp;
			
		}
		
		return second;
	}

}
