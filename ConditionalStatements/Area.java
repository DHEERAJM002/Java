package Nov5;

import java.util.Scanner;
public class Area {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Sqaure");
		System.out.println("2.Rectangle");
		System.out.println("3.Circle");
		System.out.println("4.Triangle");
		System.out.println("Enter the choice:");
		String shape=sc.next();
		switch(shape) {
		case "Square":System.out.println("Enter the length of side");
					int side=sc.nextInt();
					System.out.println("Area of the "+shape+" with side "+side+" is "+side*side+" sq.units.");
				break;
		case "Rectangle":System.out.println("Enter the length and breadth of rectangle");
				int l=sc.nextInt();
				int b=sc.nextInt();
				System.out.println("Area of the "+shape+" with length "+l+" and breadth "+b+" is "+l*b+" sq.units.");
				break;
		case "Circle":System.out.println("Enter the radius of circle");
			int r=sc.nextInt();
			System.out.println("Area of the "+shape+" with radius "+r+" is "+Math.PI*r*r+" sq.units.");
			break;
		case "Triangle":System.out.println("Enter the height and base of triangle");
			int h=sc.nextInt();
			int base=sc.nextInt();
			System.out.println("Area of the "+shape+" with height "+h+" and base "+base+" is "+0.5*h*base+" sq.units.");
			break;
		default:System.out.println("Enter a valid choice.");
				break;
		}
	}
}
