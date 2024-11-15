package Nov15;

public class NestedTry2 {
	void test() {
		try {
			try {
				try {
					String s=null;
					int p=s.length();
				}
				catch(IndexOutOfBoundsException i){
					System.out.println("Array index out bounds exception");
					System.out.println("From inner catch block1:"+i);
				}
			}
			catch(ArithmeticException a) {
				
				System.out.println("From parent try catch block2:"+a);
				
			}
			
		}
		catch(NullPointerException  e) {
			System.out.println("From outer catch block:"+e);
			System.out.println("ParentBlock");
		}
		catch(ArithmeticException a) {
			
			System.out.println("From parent try catch block2:"+a);
			
		}
	}
	public static void main(String[] args) {
		NestedTry2 obj=new NestedTry2();
		obj.test();
	}
}
