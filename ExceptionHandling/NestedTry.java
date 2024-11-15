package Nov15;

public class NestedTry {
	void test() {
		try {
			try {
				int n=10/0;
			}
			catch(Exception A) {
				System.out.println("From inner catch block1:"+A);
			}
			try {
				int list[]= {1,2,3};
				int j=list[5];
			}
			catch(Exception arr) {
				System.out.println("From inner catch block2:"+arr);
			}
		}
		catch(Exception e) {
			System.out.println("From outer catch block:"+e);
		}
	}
	public static void main(String[] args) {
		NestedTry obj=new NestedTry();
		obj.test();
	}
}
