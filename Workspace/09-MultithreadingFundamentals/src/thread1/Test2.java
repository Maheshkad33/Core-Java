package thread1;

//thread is program in execution
//
public class Test2 extends Thread {

	@Override
	public void run() {
		System.out.println("Name of Thread: " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		Test2 obj =  new Test2();
		//obj.run();
		obj.start();
	}

}
