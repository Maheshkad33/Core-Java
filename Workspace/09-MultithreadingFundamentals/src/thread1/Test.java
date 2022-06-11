package thread1;

//thread is program in execution
//
public class Test {

	public void run() {
		System.out.println("Name of Thread: " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		new Test().run();

	}

}
