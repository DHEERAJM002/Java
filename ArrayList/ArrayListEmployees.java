package Nov16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

class Employee{
	private int eid;
	private String name;
	private float salary;
	public Employee(int eid, String name, float salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
}
class Sorting implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getEid()<o2.getEid())
			return -1;
		else if(o1.getEid()>o2.getEid())
			return 1;
		else
			return 0;
	}
	
}
class SortSalary implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getSalary()>o2.getSalary())
			return -1;
		else if(o1.getSalary()<o2.getSalary())
			return 1;
		else
			return 0;
	}
	
}
public class ArrayListEmployees {
	public static void main(String[] args) {
		LinkedList<Employee> elist=new LinkedList<Employee>();
		elist.add(new Employee(100,"Abhishek",67000.0f));
		elist.add(new Employee(200,"Harshith",69000.0f));
		elist.add(new Employee(300,"Mithun K",87000.0f));
		elist.add(new Employee(400,"Dheeraj M",47000.0f));
		elist.add(new Employee(500,"Pavan K M",77000.0f));
		Collections.shuffle(elist);
		Iterator<Employee> it=elist.iterator();
		System.out.println("E-ID\tName\t\tSalary");
		while(it.hasNext()) {
			Employee s=it.next();
			System.out.println(s.getEid()+"\t"+s.getName()+"\t"+s.getSalary());
		}
		Sorting obj=new Sorting();
		Collections.sort(elist,obj);
		Iterator<Employee> it1=elist.iterator();
		System.out.println("*********************");
		System.out.println("E-ID\tName\t\tSalary");
		while(it1.hasNext()) {
			Employee s=it1.next();
			System.out.println(s.getEid()+"\t"+s.getName()+"\t"+s.getSalary());
		}
		SortSalary sortObj=new SortSalary();
		Collections.sort(elist, sortObj);
		Iterator<Employee> it2=elist.iterator();
		System.out.println("*********************");
		System.out.println("E-ID\tName\t\tSalary");
		while(it2.hasNext()) {
			Employee s=it2.next();
			System.out.println(s.getEid()+"\t"+s.getName()+"\t"+s.getSalary());
		}
	}
}
