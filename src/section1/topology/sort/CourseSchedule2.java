package section1.topology.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CourseSchedule2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> one = Arrays.asList(1,4);
		List<Integer> two = Arrays.asList(2,4);
		List<Integer> three = Arrays.asList(3,2);
		List<Integer> four = Arrays.asList(4,3);
		List<List<Integer>> list = new ArrayList<>();
		list.add(one);
		list.add(two);
		list.add(three);
		list.add(four);
		System.out.println(canFinish(5,list));
	}
	
	public static boolean canFinish(int numCourses, List<List<Integer>> pre) {
	
		Map<Integer,List<Integer>> map = new HashMap<>();
		int[] indegree = new int[numCourses];
		
		for(int i=0;i<pre.size();i++) {
			int ai = pre.get(i).get(0);
			int bi = pre.get(i).get(1);
			indegree[ai]++;
			if(!map.containsKey(bi)) {
				map.put(bi, new ArrayList<>());
			}
			map.get(bi).add(ai);
		}
		
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i=0;i<indegree.length;i++) {
			if(indegree[i]==0) {
				queue.add(i);
			}
		}
		
		if(queue.size()==0) return false;
		
		int count =0;
		
		while(!queue.isEmpty()) {
			int pop = queue.poll();
			count++;
			List<Integer> values = map.get(pop);
			if(values==null) continue;
			for(int i:values) {
				indegree[i]--;
				if(indegree[i]==0) {
					queue.add(i);
				}
			}
		}
		System.out.println(count);
		return count==numCourses;
	}

}
