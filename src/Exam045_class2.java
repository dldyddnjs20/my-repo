import java.util.Calendar;

public class Exam045_class2 {
	public static void main(String[] args) {
		int year = Integer.parseInt(args[0]);
		//		int month = Integer.parseInt(args[1]);
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;


		Calendar sDay = Calendar.getInstance(); // ������
		Calendar eDay = Calendar.getInstance(); // ��������

		for(int dal=1;dal<=12;dal++) {

			sDay.set(year, dal-1,1);
			eDay.set(year, dal,1); // �� �������� ù���� ���� �ϰ�

			eDay.add(Calendar.DATE, -1);// �̰����� ��ġ�� ���� �� ���� ������ ��¥�� Ȯ���� �ʿ䰡 ����.

			START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);// ù°���� ���� ���� ����.. �� ��ĭ�� �������� ���
			END_DAY = eDay.get(Calendar.DATE);// ������ ��¥�� ���´�.

			System.out.println("           "+year+"��"+dal+"��");
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
