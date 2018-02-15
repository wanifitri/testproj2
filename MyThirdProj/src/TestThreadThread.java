import java.time.LocalDateTime;

public class TestThreadThread extends Thread {//creating thread by using extend//implement Runnable

	public static void main(String[] args) {

		System.out.println(
				"This is currently running on the main thread, " + "the id is:" + Thread.currentThread().getId());
		TestThreadThread worker = new TestThreadThread();//can be set at worker.start()
		Thread thread = new Thread(worker); //main default thread
		thread.start();//start at runable state
		
		Thread t2 = new Thread(worker);
		t2.setName("T2");
		t2.setPriority(MIN_PRIORITY);
		t2.start();
		
		Thread t3 = new Thread(worker);
		t3.start();
		Thread t4 = new Thread(worker);
		t4.start();
		Thread t5 = new Thread(worker);
		t5.start();
		Thread t6 = new Thread(worker);
		t6.start();
		Thread t7 = new Thread(worker);
		t7.start();
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt +":Main finished running..");//threads are independent
	}

	
	@Override
	public void run() {
		LocalDateTime ldt = LocalDateTime.now();//magic word
		System.out.println(ldt +"This is currently running on separate thread, " + "the id is:" + Thread.currentThread().getId()
				+ ", with Name :" + Thread.currentThread().getName() + "with Priority:" + Thread.currentThread().getPriority());
		for (int i=0;i<1000;i++) {
			
			System.out.println(ldt +"The thread with Id is:" + Thread.currentThread().getId()
					+ ", with Name :" + Thread.currentThread().getName() + "Finished executing");
			
		}

	}
}