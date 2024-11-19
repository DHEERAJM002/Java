package Nov19;
class MyThread extends Thread{

	@Override
	public void run() {
		for(int i=0;i<5;i++)
			System.out.println("From run method of "+Thread.currentThread()+" "+i);
		
	}
	
}
public class MultiThreading {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());
		MyThread threadObj=new MyThread();
		threadObj.setName("thread1");
		MyThread threadObj1=new MyThread();
		threadObj1.setName("thread2");
		System.out.println("Priority of first thread is "+threadObj.getPriority());
		threadObj.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Priority of first thread is "+threadObj.getPriority());
		System.out.println("Priority of second thread is "+threadObj1.getPriority());
		threadObj1.setPriority(Thread.MAX_PRIORITY);
		System.out.println("Priority of second thread is "+threadObj1.getPriority());
		threadObj.start();
		threadObj.join();
		threadObj1.start();
	}
}
