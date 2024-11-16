package Nov16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student{
	private int sid,age;
	private String name;
	Student(int sid,int age,String name){
		this.sid=sid;
		this.age=age;
		this.name=name;
	}
	public int getSid() {
		return sid;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", age=" + age + ", name=" + name + "]";
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
}
class SnameSort implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		if((o1.getName().compareTo(o2.getName()))>0)
			return 1;
		else if((o1.getName().compareTo(o2.getName()))<0)
			return -1;
		else
			return 0;
	}
	
}
public class ArrayListUserDefinedClass {
	public static void main(String[] args) {
		ArrayList<Student> slist=new ArrayList<Student>();
		slist.add(new Student(1,20,"Arun"));
		slist.add(new Student(2,22,"Dheeraj"));
		slist.add(new Student(3,22,"Harsith"));
		slist.add(new Student(4,21,"Mithun"));
		System.out.println(slist);
//		for(Student i:slist)
//			System.out.println(i.toString());
		//using iterator
		Collections.shuffle(slist);
		Iterator<Student> itobj=slist.iterator();
		while(itobj.hasNext())
			System.out.println(itobj.next().toString());
		System.out.println("*******************");
		SnameSort objsort=new SnameSort();
		Collections.sort(slist, objsort);
		Iterator<Student> itobj1=slist.iterator();
		while(itobj1.hasNext())
			System.out.println(itobj1.next().toString());
	}
}
