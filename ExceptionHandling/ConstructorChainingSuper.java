package Nov15;
class Parent{
	Parent(){
		this(100);
		System.out.println("Default constructor of parent class");
	}
	Parent(int n){
		System.out.println("Integer parameter constructor of parent class");
	}
}
class Child extends Parent{
	Child(){
		this("Dheeraj M");
		System.out.println("Default constructor of child class");
	}
	Child(String name){
		super();
		System.out.println("String parameter constructor of child class");
	}
}
public class ConstructorChainingSuper {
	public static void main(String[] args) {
			Child obj=new Child();
	}
}
