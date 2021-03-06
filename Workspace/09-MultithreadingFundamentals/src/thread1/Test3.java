package thread1;

//thread is program in execution
//runnable interface contain only run () method only so it is functional interface
public class Test3 implements Runnable {

	@Override
	public void run() {
		System.out.println("Name of Thread: " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Test3 task =  new Test3();
		//obj.start();
		
		Thread t1 = new Thread(task);//worker thread
		Thread t2 = new Thread(task);//worker thread
		
		t1.start();
		t2.start();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("-- End of main --");
	}

}
