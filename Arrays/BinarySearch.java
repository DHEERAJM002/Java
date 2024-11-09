package Nov9;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("The array elements are:");
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
		System.out.println("Enter the element to be searched:");
		int ele=sc.nextInt();
		int index=-1,low=0,high=n-1;
		while(low<high) {
			int mid=(low+high)/2;
			if(arr[mid]==ele) {
				index=mid;
				break;
			}
			else if(ele<arr[mid])
				high=mid;
			else
				low=mid;
		}
		if(index==-1)
			System.out.println("Element not found");
		else
			System.out.println("Element found at position:"+(index+1));
		
	}
}
