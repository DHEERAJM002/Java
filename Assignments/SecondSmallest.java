package Assignment;

import java.util.Scanner;

public class SecondSmallest {
	public int getSecondSmallest(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		int i=1;
		while(i<arr.length && arr[i]==arr[0])
			i++;
		return arr[i];
	}
	public static void main(String[] args) {
		SecondSmallest obj=new SecondSmallest();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n=sc.nextInt();
		System.out.println("Enter the array elements:");
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("The second smallest element is "+obj.getSecondSmallest(arr));
	}
}
