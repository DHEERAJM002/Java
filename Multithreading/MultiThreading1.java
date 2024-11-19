package Nov19;
class MyThread1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++)
			System.out.println("From run method of thread "+Thread.currentThread()+" "+i);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
public class MultiThreading1 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		MyThread1 threadObj=new MyThread1();
		//threadObj.run();
		Thread thread=new Thread(threadObj);
		thread.setName("First thread");
		System.out.println("Is the thread "+Thread.currentThread()+" alive ?: "+thread.isAlive());
		thread.start();
		System.out.println("Is the thread "+Thread.currentThread()+" alive ?: "+thread.isAlive());
	}
}
