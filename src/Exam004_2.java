import java.util.Random;
public class Exam004_2 {
	public static void main(String[] args) {
		
		int com = (int)(Math.random()*100)+1;
		int i;
		for(i=1; i<100; i++) {
			com = (int)(Math.random()*3)+1;
//			com = (int)(Math.random()*41)+60;
			System.out.println(com+"");
//			System.out.println(((int)(Math.random()*100)+1)+"");
		}
	}

}
