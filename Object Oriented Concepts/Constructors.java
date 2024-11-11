package Nov11;

public class Constructors {
	private int i,j;//instance variables
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	public Constructors() {
		System.out.println("Zero parameterized Constructor called");
	}
	public Constructors(int i,int j) {
		this.i=i;
		this.j=j;
		System.out.println("Parameterized Constructor called");
	}
	public Constructors(int i) {
		this.i=i;
		System.out.println("Single Parameterized Constructor called");
	}
	void add() {
		System.out.println("The sum of i and j is : "+(i+j));
	}
	public static void main(String[] args) {
		System.out.println("From main method");
		Constructors obj=new Constructors();
		Constructors obj1=new Constructors(1,2);
		Constructors obj2=new Constructors();
		Constructors obj3=new Constructors(1);
		obj2.setI(5);
		obj2.setJ(5);
		obj.add();
		obj1.add();
		System.out.println("i="+obj2.getI()+", j="+obj2.getJ());
	}
}
