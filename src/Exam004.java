import java.util.Scanner;
public class Exam004 {
	public static void main(String[] args) {
		int min=0,max=100; int cnt=0,num=0;
		int com = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		while (num != com) {
			System.out.println("1~100������ ���ڸ� ����");
			num = sc.nextInt();
			cnt +=1;
			if (num == com) {
				System.out.printf("�����Դϴ�. %d���� ������ϴ�",cnt);
				if(cnt <=5) {
					System.out.println("5���ȿ� ���߼̽��ϴ�.");
				}
				break;
			}else if (num < com) {
				min=num;
			}else {
				max=num;
			}
			System.out.printf("��ǻ�ͼ��ڴ� %d����ũ�� %d���� �۽��ϴ�.",min,max);
		}
	}
	
}
