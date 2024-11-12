package Nov12;
abstract class MyClass{
	abstract void Area();
	void display() {
		System.out.println("From normal method");
	}
}
public class AbstractClasses extends MyClass {
	@Override
	void Area() {
		System.out.println("Area method");
		
	}
	public static void main(String[] args) {
		AbstractClasses obj=new AbstractClasses();
		obj.Area();
		obj.display();
	}

	
}
