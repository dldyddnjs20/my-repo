package Test;

import java.util.Scanner;

public class CharCounter {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�޸��忡 �ڼҼ� �Է��� ������ ���ڼ��� ���ϴ�.");
		System.out.println("�۾��� ������ �����Ͻð� â�� �ݾ� �ּ���.");
		
		DirectTyping.inputString(args);
		System.out.println("���ڸ� ���⸦ ���Ͻø� 1�� �����ּ���");
		int res = scan.nextInt();
		if (res==1) {FileReadChar.countChar(args);}
		else { System.out.println("���� 1�� ������ �ʾƼ� ����");}
		scan.close();
	}

}
