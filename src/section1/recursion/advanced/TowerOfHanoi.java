package section1.recursion.advanced;

public class TowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(toh(15));
		//printSteps(15,'A','C','B');
	}
	
	public static int toh(int n) {
		if(n==0) return 0;
		return toh(n-1)+1+toh(n-1);
	}
	
	public static void printSteps(int n,char s, char d, char h) {
		if(n==0) return;
		printSteps(n-1,s,h,d);
		System.out.println("move from "+s +" to " + d +" disk "+n);
		printSteps(n-1,h,d,s);
	}

}
