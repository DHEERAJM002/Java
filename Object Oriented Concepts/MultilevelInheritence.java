package Nov13;
class Animal{
	void sound() {
		System.out.println("Some sound");
	}
}
class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("Bark");
	}
}
class Cat extends Dog{
	@Override
	void sound() {
		System.out.println("Meow");
	}
}
public class MultilevelInheritence {
	public static void main(String[] args) {
		Animal obj1=new Animal();
		Dog obj2=new Dog();
		Cat obj3=new Cat();
		obj1.sound();
		obj2.sound();
		obj3.sound();
	}
}
