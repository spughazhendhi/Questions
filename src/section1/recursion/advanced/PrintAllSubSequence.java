package section1.recursion.advanced;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al = new ArrayList<>();
		print2("abc","",al);
		//System.out.println(al);
		
		//System.out.println(countWays(4));
		printPermutation("abc".toCharArray(),0);
		
	}
	
	
	public static void printPermutation(char[] a,int index) {
		if(index == a.length) {
			System.out.println(new String(a));
		}
		int k =0;
		
		for(int j= index;j<a.length;j++) {
			swap(a,index,j);
			printPermutation(a,index+1);
			swap(a,j,index);
			k++;
			//if(k==2) break;
		}
	}
	
	public static void swap(char[] a,int i, int j) {
		char temp = a[i];
		a[i] = a[j];
		a[j]= temp;
	}
	
	public static int countWays(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		
		if(n <0) {
			return 0;
		}
		
		return countWays(n-1)+countWays(n-2)+countWays(n-3) +countWays(n-4);
	}
	
	
	public static void print1(String input,String output) {
		if(input.length()==0) {
			System.out.println(output);
			return;
		}
		
		print1(input.substring(1),output);
		print1(input.substring(1),output+input.charAt(0));
	}
	
	public static void print2(String input,String output,List<String> list) {
		if(input.length()==0) {
			list.add(output);
			return;
		}
		
		print2(input.substring(1),output,list);
		print2(input.substring(1),output+input.charAt(0),list);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void print(String input,String output,int i) {
		if(input.length()==0) {
			System.out.println(output);
			return;
		}
		//System.out.println("level "+i +" input "+input);
		i= i+1;
		print(input.substring(1),output,i);
		print(input.substring(1),output+input.charAt(0),i);
		
	}

}
