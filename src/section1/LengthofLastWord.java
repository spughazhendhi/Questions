package section1;

public class LengthofLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(length(" "));
		
		System.out.println(length("  world "));
		
		System.out.println(length("Hello world1"));
		System.out.println(length1("Hello world1"));
	}
	
	public static int length1(String word) {
		
		int count =0;
		int n= word.length();
		
		int i=0;
		
		while(i < n) {
			char c = word.charAt(i);
			
			if(c!=' ') {
				count++;
				i++;
			}else {
			while(i < n && word.charAt(i)==' ') i++;
			if(i==n) return count;
			else count =0;
			}
		}
		
		return count;
	
	}
	public static int length(String word) {
		
		int count =0;
		for(int i=word.length()-1; i >0 ;i--) {
			char c = word.charAt(i);
			if(!Character.isWhitespace(c)) {
				count++;
			}else if(count > 0) {
				break;
			}
		}
		
		return count;
	}

}
