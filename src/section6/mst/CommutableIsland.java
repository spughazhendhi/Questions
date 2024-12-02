package section6.mst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CommutableIsland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> one = Arrays.asList(1,2,1);
		List<Integer> two = Arrays.asList(2,3,4);
		List<Integer> three = Arrays.asList(1,4,3);
		List<Integer> four = Arrays.asList(4,3,2);
		List<Integer> five = Arrays.asList(1,3,10);
		List<List<Integer>> list = new ArrayList<>();
		list.add(one); list.add(two);list.add(three);list.add(four);list.add(five);
		System.out.println(kruskal(4,list));
	}
	
	public static void makeSet(int n, int[] parent) {
		for(int i=1;i<=n;i++) {
			parent[i]= i;
		}
	}
	
	public static int find(int i, int[] parent) {
		while(parent[i]!=i) {
			i = parent[i];
		}
		
		return i;
	}
	
	public static int kruskal(int n, List<List<Integer>> list) {
		
		Collections.sort(list, (list1,list2) -> Integer.compare(list1.get(2), list2.get(2)));
		int[] parent = new int[n+1];
		int cost =0;
		makeSet(n,parent);
		
		for(int i=0;i<list.size();i++) {
			int s = list.get(i).get(0);
			int d = list.get(i).get(1);
			int w = list.get(i).get(2);
			
			int rs = find(s,parent);
			int rd = find(d,parent);
			if(rs!=rd) {
				parent[rd] = rs;
				cost+=w;
			}
		}
		
		
		
		return cost;
	}

}
