package section4.heap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class KthSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {8,5,12,10,0,1,6,9};
		//System.out.println(kSmall(a,3));
		int[] a1= {10,12,6,7,5};
		kSorted(a1,3);
		for(int i:a1)System.out.print(i+" ");
	}
	
	
	
	public static void kSorted(int[] a, int K) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
		for(int i=0;i<K;i++) {
			pq.add(a[i]);
		}
		
		int start =0;
		for(int i =K;i<a.length;i++) {
			a[start] = pq.poll();
			start++;
			pq.add(a[i]);
		}
		while(!pq.isEmpty()) {
			a[start] = pq.poll();
			start++;
		}
	}
	
	public static List<Integer> kSmall(int[] a, int k){
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
		
		for(int i=0;i<k;i++) {
			pq.add(a[i]);
		}
		
		for(int i =k;i<a.length;i++) {
		
			 if(pq.peek() >a[i]) {
				 pq.poll();
				 pq.add(a[i]);
			 }
		}
		
		List<Integer> al = new ArrayList<>();
		
		while(!pq.isEmpty()) {
			al.add(pq.poll());
		}
		return al;
	}

}
