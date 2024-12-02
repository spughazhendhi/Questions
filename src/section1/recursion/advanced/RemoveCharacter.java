package section1.recursion.advanced;

public class RemoveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = "abcda".toCharArray();
		//removeChar(c,0);
		//removeAdjacent(c,0);
		//System.out.println(c);
		
		char[] c1= "24567".toCharArray();
		System.out.println(convert(c1,c1.length-1));
		System.out.println(convert1(c1,0));
	}
	
	public static int convert(char[] s,int n) {
		if(n < 0) {
			return 0;
		}
		int value = s[n]-'0';
		return 10 * convert(s,n-1) + value;
	}
	
	public static int convert1(char[] s,int n) {
		if(n==s.length-1) {
			return s[n] -'0';
		}
		int value = s[n]-'0';
		return 10 * convert1(s,n+1) + value;
	}
	
	
	public static void removeAdjacent(char[] a, int n) {
		
		if(a.length -1 ==n || a[n]=='\0') {
			return;
		}
		
		if(a[n]==a[n+1]) {
			int i= n+1;
			for(i=n+1;i<a.length-1;i++) {
				if(a[i]=='\0') break;
				
				a[i] = a[i+1];
			}
			a[i] ='\0';
			removeAdjacent(a,n);
		}else {
			removeAdjacent(a,n+1);
		}
		
	}
	
	public static void removeChar(char[] a,int n) {
		
		if(a.length ==n || a[n]=='\0') {
			return ;
		}
		
		if(a[n] =='a') {
			int k =n;
			for(int i=n;i<a.length-1;i++) {
				if(a[n]=='\0') {
					break;
				}
				a[i] = a[i+1];
				k++;
			}
			a[k] ='\0';
			removeChar(a,n);
		}else {
			removeChar(a,n+1);
		}
		
	}

}
