import java.time.LocalDateTime;

public class TestThreadRunnable implements Runnable {

	public static void main(String[] args) {

		System.out.println(
				"This is currently running on the main thread, " + "the id is:" + Thread.currentThread().getId());
		TestThreadRunnable worker = new TestThreadRunnable();
		Thread thread = new Thread(worker); //main default thread
		thread.start();//start at runable state
		Thread t2 = new Thread(worker);
		t2.start();
		Thread t3 = new Thread(worker);
		t3.start();
		Thread t4 = new Thread(worker);
		t4.start();
		Thread t5 = new Thread(worker);
		t5.start();
		Thread t6 = new Thread(worker);
		t6.start();
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt +":Main finished running..");//threads are independent
	}
	


	@Override
	public void run() {
		LocalDateTime ldt = LocalDateTime.now();//magic word
		System.out.println(
				ldt +"This is currently running on separate thread, " + "the id is:" + Thread.currentThread().getId());

	}
}