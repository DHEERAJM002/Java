package Nov8;

import java.util.Scanner;

public class ArrayBasics {
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
		int sum=0,min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		double average=0;
		for(int i:arr) {
			if(i>max)
				max=i;
			if(i<min)
				min=i;
			sum+=i;
		}
		average=(double)sum/n;
		System.out.println("The maximum of the array elements is "+max);
		System.out.println("The minimum of the array elements is "+min);
		System.out.println("The sum of the array elements is "+sum);
		System.out.println("The average of the array elements is "+average);
	}
}
