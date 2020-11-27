import javax.swing.JOptionPane;

public class Exam085_class_threadInterrupted{
	
	public static void main(String[] args) {
		ThreadEx083_1 t1 = new ThreadEx083_1();
		
		
		t1.start();
		String input = JOptionPane.showInputDialog("�Էº���");
		System.out.println();
		System.out.println(input);
		t1.interrupted(); // False �� �¾��� ��
		t1.interrupt();
		System.out.println("t1.isInterrupted()"+t1.isInterrupted());
		
	
	}
}

class ThreadEx083_1 extends Thread{
	public void run() {
		int i =10;
		while (i !=0 && !isInterrupted()) {
			System.out.println(i--);
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {}
		}
		System.out.println("ī��Ʈ�ٿ� ����");
	}
}
