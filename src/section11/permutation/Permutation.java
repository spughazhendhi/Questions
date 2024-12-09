package section11.permutation;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(perm("II"));
	}
	
	public static List<Integer> perm(String s){
		int start =1;
		int end = s.length()+1;
		
		List<Integer> result = new ArrayList<>();
		
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c=='I') {
				result.add(start);
				start++;
			}else {
				result.add(end);
				end--;
			}
		}
		result.add(start);
		
		return result;
	}

}
