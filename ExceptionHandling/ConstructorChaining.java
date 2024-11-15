package Nov15;

public class ConstructorChaining {
	int no;
	String name;
	float amt;
	ConstructorChaining (){
		this(10);
		System.out.println("Default constructor");
	}
	ConstructorChaining (int n){
		this("Dheeraj M");
		this.no=n;
		System.out.println("Integer parameter constructor");
	}
	ConstructorChaining (String name){
		this(12.1f);
		this.name=name;
		System.out.println("String parameter constructor");
	}
	ConstructorChaining (float amt){
		this.amt=amt;
		System.out.println("Float parameter constructor");
	}
	public static void main(String[] args) {
		ConstructorChaining obj=new ConstructorChaining ();
	}
}
