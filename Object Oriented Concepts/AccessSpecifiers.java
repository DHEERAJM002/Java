package Nov12;
//default -> int i; //within package
//private -> within class
//public ->every where (another package)
//protected ->within package all classes can access
//             ->outside the package only extended class can access
class Sample{
	public int i;
	private int j;
	protected int k;
	int p;
}
public class AccessSpecifiers  {
	public static void main(String[] args) {
		Sample obj=new Sample();
		//System.out.println("Private member j:"+obj.j);
		System.out.println("Public member i:"+obj.i);
		System.out.println("Protected member k:"+obj.k);
		System.out.println("Default member p:"+obj.p);
		
	}
}
