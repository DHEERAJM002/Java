package Nov12;

import java.util.Scanner;

class Employees{
	static String company;
	String name;
	static {
		System.out.println("From static block");
		company="Edu Bridge";
		//non static method cannot be accessed
		//System.out.println(name);
	}
	{
		System.out.println("From anonymous block");
	}
	public Employees(String name) {
		System.out.println("From constructor");
		this.name=name;
	}
	static void display() {
		System.out.println("Comapany name:"+company);
	}
	void input() {
		Scanner sc=new Scanner(System.in);
		name=sc.next();
	}
	void Ndisplay() {
		System.out.println("name:"+name);
	}
}
public class StaticKeyword extends Employees{
	public StaticKeyword() {
		super("Alex");
	}
	static void display() {
		System.out.println("From main class");
	}
	public static void main(String[] args) {
		Employees obj=new Employees("Dheeraj");
		System.out.println(Employees.company);
		Employees.display();
		//obj.input();
		obj.Ndisplay();
		StaticKeyword.display();
	}
}
