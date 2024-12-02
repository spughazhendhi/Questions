package section1.recursion.advanced;

public class ReversePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s ="abcd44444444444".toCharArray();
		/*
		 * System.out.println("first ==="); print(s,0);
		 * System.out.println("second ======="); reverseprint(s,0);
		 * System.out.println("======="); reverseprint2(s,s.length-1);
		 */
		System.out.println(len(s,0));
	}
	
	public static int len(char[] a,int n) {
		if(a.length==n) {
			return 0;
		}
		return 1+len(a,n+1);
	}
	
	public static void print(char[] input, int n) {
		if(n==input.length) {
			return;
		}
		System.out.println(input[n]);
		print(input,n+1);
	}
	
	public static void reverseprint(char[] input, int n) {
		if(n==input.length) {
			return;
		}
		reverseprint(input,n+1);
		System.out.println(input[n] +" n value "+n);
	}
	
	public static void reverseprint2(char[] input, int n) {
		if(n <0) {
			return;
		}
		System.out.println(input[n]);
		reverseprint2(input,n-1);
	}


}
