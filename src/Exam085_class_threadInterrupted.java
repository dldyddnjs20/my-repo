import javax.swing.JOptionPane;

public class Exam085_class_threadInterrupted{
	
	public static void main(String[] args) {
		ThreadEx083_1 t1 = new ThreadEx083_1();
		
		
		t1.start();
		String input = JOptionPane.showInputDialog("입력부터");
		System.out.println();
		System.out.println(input);

		t1.interrupt();
		System.out.println("t1.isInterrupted()"+t1.isInterrupted());
		
	
	}
}

class ThreadEx083_1 extends Thread{
	public void run() {
		int i =10;
		while (i !=0 && !isInterrupted()) {
			System.out.println(i--);
			for(long x=0; x< 3000000000L; x++);
			
		}
		System.out.println("카운트다운 종료");
	}
}
