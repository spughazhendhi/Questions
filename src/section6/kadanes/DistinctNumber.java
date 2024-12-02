package section6.kadanes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DistinctNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,1,3,4,3};
		System.out.println(distinct(a,1));
	}
	
	public static List<Integer> distinct(int[] a,int k){
		if(k > a.length) {
			return new ArrayList<Integer>();
		}
		Map<Integer,Integer> map = new HashMap<>();
		List<Integer> result = new ArrayList<>();
		for(int i=0;i<k;i++) {
			if(!map.containsKey(a[i])){
				map.put(a[i], 0);
			}
			map.put(a[i], map.get(a[i])+1);
		}
		
		result.add(map.size());
		for(int i=k ;i<a.length;i++) {
			if(!map.containsKey(a[i])){
				map.put(a[i], 0);
			}
			map.put(a[i], map.get(a[i])+1);
			
			int remove = a[i-k];
			map.put(remove, map.get(remove)-1);
			if(map.get(remove)==0) {
				map.remove(remove);
			}
			result.add(map.size());
		}
		
		return result;
	}

}
