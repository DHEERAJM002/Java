package CodingChallenge3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class duplicates {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//size of the array
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Set<Integer> set=new HashSet<Integer>();
		TreeSet<Integer> list=new TreeSet<>();//to store the duplicate elements in ascending order
		for(int i=0;i<n;i++) {
			if(!set.add(arr[i]))
				list.add(arr[i]);
		}
		Iterator<Integer> it=list.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
	}
}
