package collections;

import java.util.*;
public class Treeset extends Object
{
	public static void main(String[] args) 
	{
		
		int[] arr = new int[] {10,20,10,40,80,50};
		TreeSet<Integer> s = new TreeSet<>();
		for(int x=0;x<arr.length;x++)
			s.add(arr[x]);
			System.out.println(s);
		Iterator<Integer> i = s.iterator();
		while(i.hasNext())	//true//true
			System.out.println(i.next());//10 //20
		int[] ar = new int[10];
		for(int x=0;x<7;x++)
			ar[x]=x;
	}
}
