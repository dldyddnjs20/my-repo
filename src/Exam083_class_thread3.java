import javax.swing.JOptionPane;

public class Exam083_class_thread3 {
	static long startTime = 0;

	public static void main(String[] args) {

		ThreadEx1_2 t1 = new ThreadEx1_2();
		t1.start();
		
		String input = JOptionPane.showInputDialog("입력 메시지 부탁합니다.");
		System.out.println("입력한 메시지는 = "+input +"입니다.");


	}
}
class ThreadEx1_2 extends Thread {
	public void run() {
		for(int i=20; i > 0; i--) {
			System.out.print("♬♬♬♬<-"+i+"->♬♬♬♬");
			try {
				sleep(1000);
			}catch (Exception e) {}
		}
	}
}


