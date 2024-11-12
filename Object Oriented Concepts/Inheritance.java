package Nov12;

import java.util.Scanner;
//Object is the parent of all java classes
//Multiple inheritance is not possible in java classes
//Inheritance - 'is a' relationship
//Instance - 'has a' relationship
//private members cannot be inherited
//If a class is final it cannot be inherited
class Parent{
	private int id;
	public String name;
	protected float salary;
	public Parent(int id,String name,float salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		System.out.println("From parent class constructor");
	}
	void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id:");
		id=sc.nextInt();
		System.out.println("Enter the name:");
		name=sc.next();
		System.out.println("Enter the salary");
		salary=sc.nextFloat();
	}
	//If a method is final we cannot override that method
	void display(){
		System.out.println("Id:"+id);
//		System.out.println("Name:"+name);
//		System.out.println("Salary:"+salary);
	}
}
class Child extends Parent{
	final int i=9;
	//The constructor of the object is called first
	public Child(int id,String name,float salary) {
		super(id,name,salary);
		System.out.println("From child class constructor");
	}
	@Override void display(){
		//i=10; Final variables cannot be updated
		super.display();
		System.out.println("Name:"+name);
		System.out.println("Salary:"+salary);
	}
}
public class Inheritance {
	public static void main(String[] args) {
		Child obj=new Child(12,"DHEERAJ",67900);
		//obj.input();
		obj.display();//Runtime polymorphism
	}
}
