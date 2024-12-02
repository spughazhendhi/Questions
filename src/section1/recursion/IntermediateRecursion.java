package section1.recursion;

import java.util.ArrayList;
import java.util.List;

public class IntermediateRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(arraySum(new int[] {1,2,3,4,5,85},0));
		//System.out.println(arraySum1(new int[] {1,2,3,4,5,85},5));
		//System.out.println(elementPresent(new int[] {1,2,3,4,5,85},3,0));
		
		//System.out.println(firstIndex(new int[] {5,5,6,5,6,8},5,0));
		//System.out.println(lastIndex(new int[] {5,5,6,5,6,8},5,5));
		//System.out.println(lastIndex1(new int[] {5,5,6,5,6,8},5,0));
		//printPosition(new int[] {5,5,6,5,6},6,0);
		//System.out.println(countOccurence(new int[] {5,5,6,5,6},5,0));
		/*
		int[] a = {5,5,6,5,6};
		List<Integer> al = new ArrayList<>();
		storePos(a,6,al,0);
		
		System.out.println(al);
		*/
		String s ="1234621";
		
		//System.out.println(isPalindrome(s,0,s.length()-1));
		int[] a = {11,2,3,4,5,7};
		System.out.println(isArraySorted(a,0));
		System.out.println(isArraySorted1(a,a.length-1));
		System.out.println(isArraySorted2(a,a.length-1));
	}
	
	public static boolean isArraySorted(int[] array,int n) {
		if(n== array.length-1) {
			return true;
		}
		if(array[n] > array[n+1]) {
			return false;
		}
		return isArraySorted(array,n+1);
		
 
	}
	
	public static boolean isArraySorted1(int[] array,int n) {
		if(n ==0) {
			return true;
		}
		if(array[n-1] > array[n]) {
			return false;
		}
		return isArraySorted1(array,n-1);
		
 
	}
	
	public static boolean isArraySorted2(int[] array,int n) {
		if(n ==0) {
			return true;
		}
		boolean sorted = isArraySorted1(array,n-1);
		
		if(sorted) {
			if(array[n-1] > array[n]) {
				return false;
			}else {
				return true;
			}
		}else {
			return sorted;
		}
		
 
	}

	
	
	public static boolean isPalindrome(String s,int start, int end) {
		if(start > end) {
			return true;
		}
		
		if(s.charAt(start)==s.charAt(end)) {
			return isPalindrome(s,start+1,end-1);
		}else {
			return false;
		}
	}
	
	
	public static void storePos(int[] a,int k,List<Integer> list,int n) {
		
		if(a.length==n) {
			return ;
		}
		if(a[n]==k) {
			list.add(n);
		}
		
		storePos(a,k,list,n+1);
		
	}
	
	public static int countOccurence(int[] a,int k,int n) {
		if(n ==a.length) {
			return 0;
		}
		int count = countOccurence(a,k,n+1);
		if(a[n]==k) {
			return 1+count;
		}else {
			return count;
		}
	}
	
	
	public static void printPosition(int[] a,int k,int n) {
		if(n==a.length) {
			return;
		}
		if(a[n]==k) {
			System.out.println(n);
		}
		printPosition(a,k,n+1);
	}
	
	public static int lastIndex1(int[] a,int k,int n) {
		if(n == a.length) return -1;
		int value = lastIndex1(a,k,n+1);
		if(value ==-1) {
			if(a[n]==k) {
				return n;
			}else {
				return -1;
			}
		}
		else {
			return value;
		}
	}
	
	
	public static int lastIndex(int[] a,int k,int n) {
		if(n <0) return -1;
		if(a[n]==k) return n;
		return lastIndex(a,k,n-1);
	}
	
	public static int firstIndex(int[] a,int k,int n) {
		if(n==a.length) return -1;
		if(a[n]==k) return n;
		return firstIndex(a,k,n+1);
	}
	
	public static boolean elementPresent(int[] a, int k,int n) {
		if(a.length ==n) return false;
		if(a[n]==k) return true;
		return elementPresent(a,k,n+1);
	}
	
	public static int arraySum(int[] array,int n) {
		if(n==array.length) return 0;
		return array[n]+ arraySum(array,n+1);
	}
	
	public static int arraySum1(int[] array,int n) {
		if(n < 0) return 0;
		int smallAns  =  arraySum1(array,n-1);
		System.out.println("smallAns "+smallAns);
		
		int value = smallAns + array[n];
		System.out.println("value "+value);
		return value;
	}
	
	
}
