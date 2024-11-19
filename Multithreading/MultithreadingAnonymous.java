package Nov19;

public class MultithreadingAnonymous {
	public static void main(String[] args) {
		Thread obj=new Thread("Thread 1") {
			public void run() {
				System.out.println("From run method of "+Thread.currentThread());
			}
		};
		obj.start();
		new Thread("Thread 2") {
			public void run() {
				System.out.println("From run method of "+Thread.currentThread());
			}
		}.start();
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("From run method of "+Thread.currentThread());
			}
		};
		new Thread(runnable,"Thread 3").start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("From run method of "+Thread.currentThread());
			}
			
		},"Thread 4").start();
	}
}
