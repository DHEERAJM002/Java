package Nov16;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

class Product{
	private int pid;
	private String name;
	private  float price;
	public Product(int pid, String name, float price) {
		// TODO Auto-generated constructor stub
		this.pid=pid;
		this.name=name;
		this.price=price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}
class PidSort implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o1.getPid()<o2.getPid())
			return -1;
		else if(o1.getPid()>o2.getPid())
			return 1;
		else
			return 0;
	}
	
}
class PnameSort implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if((o1.getName().compareTo(o2.getName()))<0)
			return -1;
		else if((o1.getName().compareTo(o2.getName()))>0)
			return 1;
		else
			return 0;
	}
	
}
class PriceSort implements Comparator<Product>{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		if(o1.getPrice()<o2.getPrice())
			return -1;
		else if(o1.getPrice()>o2.getPrice())
			return 1;
		else
			return 0;
	}
	
}
public class ListsProducts {
	public static void main(String[] args) {
		LinkedList<Product> plist=new LinkedList<Product>();
		plist.add(new Product(100,"Bread",50.0f));
		plist.add(new Product(200,"Cookies",30.0f));
		plist.add(new Product(300,"Eggs",10.0f));
		plist.add(new Product(400,"Buns",70.0f));
		plist.add(new Product(500,"Juice",20.0f));
		plist.add(new Product(600,"Nuts",90.0f));
		Collections.shuffle(plist);
		System.out.println("Before sorting");
		for(Product it:plist)
			System.out.println(it.getPid()+"\t"+it.getName()+"\t"+it.getPrice());
		System.out.println("*************************");
		System.out.println("Pid based sort");
		PidSort pidsort=new PidSort();
		Collections.sort(plist, pidsort);
		for(Product it:plist)
			System.out.println(it.getPid()+"\t"+it.getName()+"\t"+it.getPrice());
		System.out.println("*************************");
		System.out.println("Pname based sort");
		PnameSort pnamesort=new PnameSort();
		Collections.sort(plist, pnamesort);
		for(Product it:plist)
			System.out.println(it.getPid()+"\t"+it.getName()+"\t"+it.getPrice());
		System.out.println("*************************");
		System.out.println("Price based sort");
		PriceSort pricesort=new PriceSort();
		Collections.sort(plist, pricesort);
		for(Product it:plist)
			System.out.println(it.getPid()+"\t"+it.getName()+"\t"+it.getPrice());
		System.out.println("*************************");
	}
}
