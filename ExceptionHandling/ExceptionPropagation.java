package Nov15;

public class ExceptionPropagation {
	void first() {
		System.out.println("From first method");
		int i=9/0;
	}
	void second() {
		System.out.println("Calling first from second");
		first();
	}
	void third() {
		try {
			System.out.println("Calling second from third");
			second();
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		ExceptionPropagation obj=new ExceptionPropagation();
		obj.third();
		System.out.println("Rest of the code runs..");
	}
}
