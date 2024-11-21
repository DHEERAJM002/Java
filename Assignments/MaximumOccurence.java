package Assignment;

import java.util.Scanner;

public class MaximumOccurence {
	public char maximumOccuringCharacter(String s) {
		s=s.toLowerCase();//to ignore case
		char[] arr=s.toCharArray();//covert the string to an char array
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}//sort the char array
		int cnt=1,cntmax=1;//variables to hold max count and temporary max count
		char max=arr[0],sol=arr[0];//variables to hold temporary solution and solution
		for(int i=1;i<arr.length;i++) {
			if(max==arr[i]) 
				cnt++;
			else {
				if(cnt>cntmax) {
					cntmax=cnt;
					sol=max;
					max=arr[i];
					cnt=1;
				}
				else {
					max=arr[i];
					cnt=1;
				}
			}
		}
		return sol;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.next();
		MaximumOccurence obj=new MaximumOccurence();
		System.out.println("The maximum occuring character in the string is "+obj.maximumOccuringCharacter(s));
	}
}
