package section1;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(reverseString("Hello"));
		//System.out.println(reverseString("malayalam"));
		System.out.println(getCommonPrefix1(new String[] {"flower","flow","fl"}));
		List<String> al = new ArrayList<>();
		
	
	}
	
	
public static String getCommonPrefix1(String[] array) {
		
		String a="";
		String s1 = array[0];
		for(int i=0;i<s1.length();i++) {
			char c1 = s1.charAt(i);
			for(int j=1;j<array.length;j++) {
				
				
				String s2 = array[j];
				
				if(i >=s2.length()) return a;
				char c2 = s2.charAt(i);
				System.out.println("c1 "+ c1 + " c2 "+c2);
				
				if(c1!=c2) {
					return a;
				}
			}
			a= a +array[0].charAt(i);
		}
		
		return a;
	}
	
	public static String getCommonPrefix(String[] array) {
		
		int min = miniMumLength(array);
		String a="";
		String s1 = array[0];
		for(int i=0;i<min;i++) {
			char c1 = s1.charAt(i);
			for(int j=1;j<array.length;j++) {
				
				
				String s2 = array[j];
				
				
				char c2 = s2.charAt(i);
				System.out.println("c1 "+ c1 + " c2 "+c2);
				
				if(c1!=c2) {
					return a;
				}
			}
			a= a +array[0].charAt(i);
		}
		
		return a;
	}
	
	public static int miniMumLength(String[] array) {
		
		int min = Integer.MAX_VALUE;
		
		for(String s:array) {
			min = Math.min(min,s.length());
		}
		
		return min;
		
	}
	
	public static String reverseString(String s) {
		
		char[] c = s.toCharArray();
		
		int left =0,right = s.length()-1;
		
		while(left < right) {
			char temp = c[right];
			c[right] = c[left];
			c[left] = temp;
			left++;
			right--;
		}
		
		return new String(c);
	}

}
