package Nov22;
interface MyInterface1{
	void func1();
	default void func2() {
		System.out.println("Default method called");
	}
}
interface MyInterface2{
	void multiply(int n1,int n2);
}
class MyClass implements MyInterface1{

	@Override
	public void func1() {
		// TODO Auto-generated method stub
		System.out.println("From overriden function");
	}
	public void func2() {
		System.out.println("Overriden Default method called");
	}
	
}
public class Java8Features {
	public static void main(String[] args) {
		MyClass obj=new MyClass();
		obj.func1();
		obj.func2();
		MyInterface1 interface1=new MyInterface1() {
			
			@Override
			public void func1() {
				// TODO Auto-generated method stub
				System.out.println("From anonymous class");
			}
		};
		interface1.func1();
		MyInterface1 interface2=()->{
			System.out.println("Lambda Expression");
		};
		interface2.func1();
		MyInterface2 interface3=(int n1,int n2)->{
			int i=4,j=9;
			int k=i*j;
			System.out.println(k);
			System.out.println(n1*n2);
		};
		interface3.multiply(2,7);
	}
}
