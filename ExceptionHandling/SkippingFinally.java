package Nov15;

public class SkippingFinally {
	void test() {
		try {
			System.exit(0);
			//while(true) {};
			//thread termination
			//JVM or OS crash
		}
		catch(Exception e) {
			
		}
		finally{
			System.out.println("Inside finally block");
		}
	}
	public static void main(String[] args) {
		SkippingFinally obj=new SkippingFinally();
		obj.test();
	}
}
