package Nov12;
interface Branches{
	void dispAll();
}
interface Interest extends Branches{
	int id=12;//by default it is static final
	float returnInterest();//by default it is public abstract
}
interface Account extends Branches{
	void displayAcc();
}
class SBI implements Interest,Account{
	@Override
	public float returnInterest() {
		return 9.2f;
	}
	public void displayAcc() {
		System.out.println("From SBI");
	}
	public void dispAll() {
		System.out.println("Branches of SBI");
	}
}
class ICICI implements Interest,Account{
	@Override
	public float returnInterest() {
		return 8.2f;
	}
	public void displayAcc() {
		System.out.println("From SBI");
	}
	public void dispAll() {
		System.out.println("Branches of ICICI");
	}
}
public class Interfaces {
	public static void main(String[] args) {
		SBI obj1=new SBI();
		ICICI obj2=new ICICI();
		System.out.println("From SBI class :"+obj1.returnInterest());
		obj1.displayAcc();
		obj1.dispAll();
		System.out.println("From SBI class :"+obj1.id);
		System.out.println("From ICICI class :"+obj2.returnInterest());
		obj2.displayAcc();
		obj2.dispAll();
		System.out.println("From ICICI class :"+obj2.id);
	}
}
