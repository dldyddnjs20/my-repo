import javax.swing.JOptionPane;

public class Exam083_class_thread3 {
	static long startTime = 0;

	public static void main(String[] args) {

		ThreadEx1_2 t1 = new ThreadEx1_2();
		t1.start();
		
		String input = JOptionPane.showInputDialog("�Է� �޽��� ��Ź�մϴ�.");
		System.out.println("�Է��� �޽����� = "+input +"�Դϴ�.");


	}
}
class ThreadEx1_2 extends Thread {
	public void run() {
		for(int i=20; i > 0; i--) {
			System.out.print("�ݢݢݢ�<-"+i+"->�ݢݢݢ�");
			try {
				sleep(1000);
			}catch (Exception e) {}
		}
	}
}


