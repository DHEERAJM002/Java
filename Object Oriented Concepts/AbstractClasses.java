package Nov13;
abstract class Vehicle{
	abstract void move();
}
//class Bike extends Vehicle{
//	void move() {
//		System.out.println("Two wheels");
//	}
//}
class Car extends Vehicle{
	void move() {
		System.out.println("Four wheels");
	}
}
class Bike extends Vehicle{

	@Override
	void move() {
		// TODO Auto-generated method stub
		System.out.println("Two wheels");
	}
	
}
public class AbstractClasses {
	public static void main(String[] args) {
		Vehicle obj=new Car();
		Vehicle obj1=new Bike();
		obj.move();
		obj1.move();
	}
}
