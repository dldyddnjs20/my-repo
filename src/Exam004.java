import java.util.Scanner;
public class Exam004 {
	public static void main(String[] args) {
		int min=0,max=100; int cnt=0,num=0;
		int com = (int)(Math.random()*100)+1;
		Scanner sc = new Scanner(System.in);
		while (num != com) {
			System.out.println("1~100까지의 숫자를 선택");
			num = sc.nextInt();
			cnt +=1;
			if (num == com) {
				System.out.printf("정답입니다. %d번에 맞췄습니다",cnt);
				if(cnt <=5) {
					System.out.println("5번안에 맞추셨습니다.");
				}
				break;
			}else if (num < com) {
				min=num;
			}else {
				max=num;
			}
			System.out.printf("컴퓨터숫자는 %d보다크고 %d보다 작습니다.",min,max);
		}
	}
	
}
