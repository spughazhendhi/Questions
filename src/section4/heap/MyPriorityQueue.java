package section4.heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MyPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		//pq.add(12);
		
		//int[] a = {16,6,3,2,20};
		//inPlaceHeapSort(a);
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
		pq.add(7);
		pq.add(9);
		pq.add(3);
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
		
	}
	
	public static void inPlaceHeapSort(int[] a) {
		
		//build Heap
	
		
		for(int i=1;i<a.length;i++) {
			int cI = i;
			while(cI >0) {
				int parent = (cI-1)/2;
				if(a[parent] < a[cI]) {
					break;
				}
				swap(a,cI,parent);
				cI = parent;
				
				
			}
		}
		
		
		/*
		 /// Build the heap in input array
		   for(int i=1;i<a.length;i++){
		    int cI = i;
		    while(cI > 0){
		        int pI = (cI-1)/2;
		        if(a[cI] < a[pI]){
		            swap(a,cI,pI);
		            cI = pI;
		        }else {
		            break;
		        }
		     }
		   }
		   */
		 
		
		//remove Min
		int size = a.length;
		for(int i= a.length-1;i>=0;i--) {
			swap(a,0,i);
		//	System.out.println(a[i]);
			size--;
			int parent =0;
			
			
			while(true) {
				int left = 2 * parent +1;
				int right = 2*parent +2;
				int min =parent;
				if(left < size && a[left] < a[min]) {
					min = left;
				}
				if(right < size && a[right] < a[min]) {
					min =right;
				}
				if(min==parent) {
					break;
				}
				swap(a,min,parent);
				parent = min;
			}
		}
		
		
		for(int i:a)System.out.println(i+" ");
		
		
	}
	
	public static void swap(int[] a,int i,int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j]= temp;
	}

}
