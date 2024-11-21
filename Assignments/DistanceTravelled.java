package Assignment;

import java.util.Scanner;

public class DistanceTravelled {
	private static int u=10,a=5;//u=36 km/hr =10m/s
	public static int distanceTravelled(int t) {
		int d=u*t+((a*t*t)/2);
		return d;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two time intervals");
		int t1=sc.nextInt();
		int t2=sc.nextInt();
		System.out.println("The distance travelled for time interval "+t1+" is "+DistanceTravelled.distanceTravelled(t1));
		System.out.println("The distance travelled for time interval "+t2+" is "+DistanceTravelled.distanceTravelled(t2));
	}
}
