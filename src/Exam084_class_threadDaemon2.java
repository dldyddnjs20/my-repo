

public class Exam084_class_threadDaemon2{
	
	public static void main(String[] args) {
		ThreadEx082 t1 = new ThreadEx082();
		ThreadEx082_1 t2 = new ThreadEx082_1();
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(5000);
		}catch (InterruptedException e) {}
		
		System.out.println("Main 종료..");
		
	
	}
}

class ThreadEx082 extends Thread{
	public void run() {
		for (int i =0; i<500; i++)System.out.print("A");
		System.out.println("쓰레드 1 종료");
	}
}
class ThreadEx082_1 extends Thread{
	public void run() {
		for (int i =0; i<500; i++)System.out.print("V");
		System.out.println("쓰레드 2 종료");
	}
}
