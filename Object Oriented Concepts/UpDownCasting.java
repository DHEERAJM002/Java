package Nov13;
class Employee{
	int eid;
	public Employee(int eid) {
		System.out.println("Employee class constructor");
		this.eid=eid;
	}
	void upCast() {
		System.out.println("From Employee class EID:"+eid);
	}
}
class Manager extends Employee{
	int mid;
	public Manager(int eid,int mid) {
		super(eid);
		this.mid=mid;
		System.out.println("Manager class constructor");
	}
	void downCast() {
		System.out.println("From Manager class MID:"+mid);
	}
	
}
public class UpDownCasting {
	public static void main(String[] args) {
		Employee empObj=new Manager(11,22);
		empObj.upCast();
		Manager mngObj=(Manager)empObj;
		mngObj.downCast();
	}
}
