package Test;

import java.util.Scanner;

public class CharCounter {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("메모장에 자소서 입력이 끝나면 글자수를 샙니다.");
		System.out.println("작업이 끝나면 저장하시고 창을 닫아 주세요.");
		
		DirectTyping.inputString(args);
		System.out.println("글자를 새기를 원하시면 1을 눌러주세요");
		int res = scan.nextInt();
		if (res==1) {FileReadChar.countChar(args);}
		else { System.out.println("숫자 1을 누르지 않아서 종료");}
		scan.close();
	}

}
