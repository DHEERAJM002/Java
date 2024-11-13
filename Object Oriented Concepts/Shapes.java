package Nov13;
class Shape{
	void draw() {
		System.out.println("General shape");
	}
}
class Circle extends Shape{
	@Override
	void draw() {
		System.out.println("Circle");
	}
}
class Triangle extends Shape{
	@Override
	void draw() {
		System.out.println("Triangle");
	}
}
class Rectangle extends Shape{
	@Override
	void draw() {
		System.out.println("Rectangle");
	}
}
public class Shapes {
	public static void main(String[] args) {
		Shape obj1=new Shape();
		Shape obj2=new Circle();
		Shape obj3=new Triangle();
		Shape obj4=new Rectangle();
		obj1.draw();
		obj2.draw();
		obj3.draw();
		obj4.draw();
	}
}
