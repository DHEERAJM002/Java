package Nov15;

public class ChainedException {
	void test() {
		try {
			throw new ArithmeticException("Divide by zero");
		}
		catch(Exception e) {
			throw new ArithmeticException("Divide by zero");
		}
	}
	public static void main(String[] args) {
		ChainedException obj=new ChainedException();
		try {
			obj.test();
		}
		catch(RuntimeException e) {
			System.out.println("From main function "+e);
		}
		
	}
}
