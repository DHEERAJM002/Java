package Nov18;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Employee{
	private int eid;
	private String name;
	private float salary;
	Employee(int id,String nm,float sal){
		this.eid=id;
		this.name=nm;
		this.salary=sal;
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
class SortId implements Comparator<Employee>{

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
		if(o1.getSalary()<o2.getSalary())
			return -1;
		else if(o1.getSalary()>o2.getSalary())
			return 1;
		else
			return 0;
	}
	
}
class SortName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getName().compareTo(o2.getName())<0)
			return -1;
		else if(o1.getName().compareTo(o2.getName())>0)
			return 1;
		else
			return 0;
	}
	
}
public class TreeSetEmployee {
	public static void main(String[] args) {
		SortId idsort=new SortId();
		SortSalary salsort=new SortSalary();
		SortName nmsort=new SortName();
		TreeSet<Employee> empSetId=new TreeSet<Employee>(idsort);
		TreeSet<Employee> empSetSal=new TreeSet<Employee>(salsort);
		TreeSet<Employee> empSetName=new TreeSet<Employee>(nmsort);
		empSetId.add(new Employee(100,"Harshith",95000.1f));
		empSetId.add(new Employee(200,"Abhi",85000.1f));
		empSetId.add(new Employee(300,"Pavan",75000.1f));
		empSetId.add(new Employee(400,"Deep",99000.1f));
		empSetId.add(new Employee(500,"Aman",45000.1f));
		empSetSal.add(new Employee(100,"Harshith",95000.1f));
		empSetSal.add(new Employee(200,"Abhi",85000.1f));
		empSetSal.add(new Employee(300,"Pavan",75000.1f));
		empSetSal.add(new Employee(400,"Deep",99000.1f));
		empSetSal.add(new Employee(500,"Aman",45000.1f));
		empSetName.add(new Employee(100,"Harshith",95000.1f));
		empSetName.add(new Employee(200,"Abhi",85000.1f));
		empSetName.add(new Employee(300,"Pavan",75000.1f));
		empSetName.add(new Employee(400,"Deep",99000.1f));
		empSetName.add(new Employee(500,"Aman",45000.1f));
		Iterator<Employee> it1=empSetId.iterator();
		Iterator<Employee> it2=empSetSal.iterator();
		Iterator<Employee> it3=empSetName.iterator();
		System.out.println("Id based sorted tree set:");
		while(it1.hasNext()) {
			Employee temp=it1.next();
			System.out.println(temp.getEid()+"\t"+temp.getName()+"\t"+temp.getSalary());
		}
		System.out.println("***********************");
		System.out.println("Salary based sorted tree set");
		while(it2.hasNext()) {
			Employee temp=it2.next();
			System.out.println(temp.getEid()+"\t"+temp.getName()+"\t"+temp.getSalary());
		}
		System.out.println("***********************");
		System.out.println("Name based sorted tree set");
		while(it3.hasNext()) {
			Employee temp=it3.next();
			System.out.println(temp.getEid()+"\t"+temp.getName()+"\t"+temp.getSalary());
		}
	}
}
