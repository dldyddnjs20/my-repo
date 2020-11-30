public class Exam085_class_thread_deprecated{

	public static void main(String[] args) {

		ThreadEx85 th4 = new ThreadEx85();

		YongwonThread th1 = new YongwonThread("Thread1#1");
		YongwonThread th2 = new YongwonThread("Thread1##22");
		YongwonThread th3 = new YongwonThread("Thread1###333");

		th4.start();
		th1.start();
		th2.start();
		th3.start();

		try {
			Thread.sleep(1000);
			th1.suspend();
			Thread.sleep(2000);
			th2.suspend();
			Thread.sleep(3000);
			th1.resume();
			Thread.sleep(3000);
			th1.stop();
			th2.stop();
			Thread.sleep(2000);
			th3.stop();
		} catch (InterruptedException e) {}

	}
}

class YongwonThread implements Runnable{
	volatile boolean suspended = false;
	volatile boolean stopped = false;
	
	Thread th;
	
	YongwonThread() {} // default 생성자
	YongwonThread(String name) {
		th = new Thread(this,name); // 저위에 있는 Thread(Runnable r,String name)를 얻기위해서
	}
	
	void start() {
		th.start();
	}
	void resume() {
		suspended = false;
	}
	void suspend() {
		suspended = true;
		th.interrupt();
	}
	void stop() {
		stopped = true;
		th.interrupt();
	}
	
	public void run() {
		while (!stopped) {
			if (! suspended) {
				
				System.out.println(Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {}
			}
		}
	}
}

class ThreadEx85 extends Thread{
	public void run() {
		int i =10;

		while (i!=0) {
			System.out.println(i--);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {}
		}
		System.out.println("카운트다운 종료....");
	}
}