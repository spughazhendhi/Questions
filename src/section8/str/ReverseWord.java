package section8.str;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s =" the  sky is bluered  ";
		System.out.println(reverse(s));
	}
	
	public static String reverse(String word) {
		StringBuilder sb = new StringBuilder(word);
		
		int begin =0,end =0;
		while( end < sb.length()) {
			if(sb.charAt(end)==' ') {
				reverse(sb,begin,end-1);
				end++;
				begin = end;
			}else {
				end++;
			}
		}
		reverse(sb,begin,end-1);
		reverse(sb,0,sb.length()-1);
		return  removeSpace(sb);
	}
	
	public static String removeSpace(StringBuilder s) {
		StringBuilder sb = new StringBuilder();
		
		int i=0;
		while(s.charAt(i)==' ')i++;
		while(i<s.length()) {
			if(s.charAt(i) ==' ') {
				sb.append(' ');
				while(i<s.length() && s.charAt(i)==' ') i++;
			}else {
				sb.append(s.charAt(i));
				i++;
			}
		}
		char c = sb.charAt(sb.length()-1);
		if(c==' ') {
			
			sb.deleteCharAt(sb.length()-1);
		}
		
		return sb.toString();
	}
	
	public static void reverse(StringBuilder sb,int start, int end) {
		System.out.println("reverse "+ start +" end "+end);
		while(start<end) {
			char temp = sb.charAt(start);
			sb.setCharAt(start, sb.charAt(end));
			sb.setCharAt(end, temp);
			
			start++;
			end--;
		}
	}

}
