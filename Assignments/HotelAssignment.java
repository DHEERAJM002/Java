package Nov22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Customer{
	private String name;
	private int numberOfRooms;
	public Customer(String name, int numberOfRooms) {
		this.name = name;
		this.numberOfRooms = numberOfRooms;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
}
class Hotel{
	private List<String> customerName;
	private int roomsBooked;
	
	public Hotel() {
		customerName=new ArrayList<String>();
		roomsBooked=0;
	}
	public String checkIn(Customer customer) {
		if(this.checkRooms(customer)=="Yes") {
			this.customerName.add(customer.getName());
			this.roomsBooked+=customer.getNumberOfRooms();
			return "Checked In";
		}
		else
			return "No rooms available";
	}
	public String checkRooms(Customer customer) {
		if(roomsBooked+customer.getNumberOfRooms()<=10) {
			return "Yes";
		}
		else
			return "No";
	}
}
public class HotelAssignment {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Hotel hotel=new Hotel();
		while(true) {
			System.out.println("1.Book Rooms\n2.Close Menu");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:System.out.println("Enter the customer name");
				String name=sc.next();
				System.out.println("Enter number of rooms");
				int n=sc.nextInt();
				Customer customer=new Customer(name,n);
				System.out.println(hotel.checkIn(customer));
				break;
			case 2:System.exit(0);
			default:return;
			}
		}
	}
}
