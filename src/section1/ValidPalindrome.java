package section1;

public class ValidPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(isValidPalindrome("A man, a plan, a canal:Panama"));
		
		System.out.println(isValidPalindrome1("abca"));

	}
	
	
	
	public static boolean isValidPalindrome1(String s) {
		int left = 0;
		int right = s.length()-1;
		
		
		
		while(left < right) {
			while(left < right && !Character.isAlphabetic(s.charAt(left))) left++;
			while(left < right && !Character.isAlphabetic(s.charAt(right))) right--;
		
			
			if(Character.toUpperCase(s.charAt(left))!=Character.toUpperCase(s.charAt(right))) {
				
				if(Character.toUpperCase(s.charAt(left+1))==Character.toUpperCase(s.charAt(right) )) {
					left++;
				
				}else if(Character.toUpperCase(s.charAt(left))==Character.toUpperCase(s.charAt(right-1) )) {
					right--;
				
				}else {
					return false;
				}
				
				
			}
			left++;
			right--;
		}
		
		return true;
	}

	
	public static boolean isValidPalindrome(String s) {
		int left = 0;
		int right = s.length()-1;
		
		while(left < right) {
			while(left < right && !Character.isAlphabetic(s.charAt(left))) left++;
			while(left < right && !Character.isAlphabetic(s.charAt(right))) right--;
			
			System.out.println("left char "+s.charAt(left));
			System.out.println("right char "+s.charAt(right));
			
			if(Character.toUpperCase(s.charAt(left))!=Character.toUpperCase(s.charAt(right))) {
				return false;
			}
			left++;
			right--;
		}
		
		return true;
	}

}
