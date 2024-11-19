package Nov19;
class Table{
	synchronized void printTable(int n) {
		for(int i=1;i<=10;i++)
			System.out.println(i+"X"+n+"="+i*n);
	}
}
class Implementation extends Thread{
	Table obj;
	public Implementation(Table obj) {
		// TODO Auto-generated constructor stub
		this.obj=obj;
	}
	public void run() {
		obj.printTable(2);
	}
}
public class SynchronizedApp {
	public static void main(String[] args) throws InterruptedException {
		Implementation tbobj=new Implementation(new Table());
		Implementation tbobj1=new Implementation(new Table());
		tbobj.start();
		//tbobj.join();
		tbobj1.start();
		
		//using anonymous class
		
	}
}
