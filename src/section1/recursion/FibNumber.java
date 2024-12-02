package section1.recursion;

public class FibNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(fib(7));
		//System.out.println(pow(5,3));
		//print(5);
		//System.out.println(countDigits(1045678901278901L));
		//System.out.println(sum(12345));
		//System.out.println(multiply(7,10));
		//System.out.println(countZero(1234));
		System.out.println(geoSum(3));
	}
	
	public static int fib(int n) {
		if(n ==0 || n==1) return n;
		return fib(n-1)+ fib(n-2);
	}
	
	public static int pow(int x,int n) {
		if(n==0) return 1;
		return x * pow(x,n-1);
	}
	
	public static void print(int n) {
		if(n==0) {
			//System.out.println(n);
			return;
		}
		System.out.println(n);
		print(n-1);
		
	}
	
	
	public static int countDigits(long n) {
		if(n ==0) {
			return 0;
		}
		return 1+ countDigits(n/10);
	}
	
	public static int sum(int n) {
		if(n ==0) {
			return 0;
		}
		int remainder = n%10;
		System.out.println("remainder "+remainder);
		return remainder+ sum(n/10);
	}

	
	public static int multiply(int m,int n) {
		if(n==0) return 0;
		return m+multiply(m,n-1);
	}
	
	public static int countZero(int n) {
		if(n==0) return 0;
		int remainder = n%10 ==0 ? 1:0;
		return remainder + countZero(n/10);
	}
	
	public static double geoSum(int n) {
		if(n==0) {
			return 1;
		}
		
		return 1/Math.pow(2, n) + geoSum(n-1);
	}
}
