import java.util.Calendar;

public class Exam045_class2 {
	public static void main(String[] args) {
		int year = Integer.parseInt(args[0]);
		//		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;


		Calendar sDay = Calendar.getInstance(); // 시작일
		Calendar eDay = Calendar.getInstance(); // 끝나는일

		for(int dal=1;dal<=12;dal++) {

			sDay.set(year, dal-1,1);
			eDay.set(year, dal,1); // 그 다음월의 첫날로 셋을 하고

			eDay.add(Calendar.DATE, -1);// 이과정을 거치면 따로 그 전달 마지막 날짜를 확인할 필요가 없다.

			START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);// 첫째일이 무슨 요일 인지.. 즉 몇칸을 움직일지 계산
			END_DAY = eDay.get(Calendar.DATE);// 지정한 날짜를 얻어온다.

			System.out.println("           "+year+"년"+dal+"월");
			System.out.println();
			System.out.println("  SU  MO  TU  ME  TH  FR  SA");
			System.out.println();

			for(int i=1; i<START_DAY_OF_WEEK; i++) {
				System.out.print("    ");
			}
			for(int i=1, n=START_DAY_OF_WEEK; i<=END_DAY; i++, n++) {
				System.out.print((i<10)?"   "+i : "  "+i);
				if (n%7==0) System.out.println();

			}
			System.out.println();
			System.out.println();
		}
	}
}
