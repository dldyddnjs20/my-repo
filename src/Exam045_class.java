import java.util.Calendar;

public class Exam045_class {
	public static void main(String[] args) {
		String[] yoil = {"","��","��","ȭ","��","��","��","��"};
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		Calendar date = Calendar.getInstance();
		
		date1.set(1995,9,3); // 1995�� 10�� 3�� ���ϰ� �ϸ� ������ -1�� ���ش�
		System.out.println("date1: "+tosString(date1)+yoil[date1.get(Calendar.DAY_OF_WEEK)]+"����");
		
		date2.set(2020,10,20); // ���ó�¥�� ����
		
		date.set(2020,10,20);
		System.out.println(tosString(date));
		date.add(Calendar.DATE, 10);
		System.out.println(tosString(date));
		
		System.out.println(tosString(date));
		date.roll(Calendar.DATE, 10); // ��¥�� ��ȯ(�յ� ��ȭ����)
		System.out.println(tosString(date));
		
		long differnce = 
				(date2.getTimeInMillis()-date1.getTimeInMillis())/1000;
		System.out.println("���ݱ��� ��ƿ� ���Դϴ�."+ differnce);
		System.out.println("�ϼ�: "+differnce/(24*60*60));
		System.out.println("���: "+differnce/(24*60*60*365));
//		//��¥ ǥ��
//		System.out.println(today.get(Calendar.YEAR)+"��");
//		System.out.println(today.get(Calendar.MONTH)+1+"��");
//		System.out.println(today.get(Calendar.DATE)+"��");
//		System.out.println(yoil[today.get(Calendar.DAY_OF_WEEK)]+"����");
//		System.out.println(today.get(Calendar.WEEK_OF_YEAR)+"��"+"/52");
//		
//		//�ð� ǥ��
//		System.out.println(today.get(Calendar.HOUR));
//		System.out.println(today.get(Calendar.MINUTE));
//		System.out.println(today.get(Calendar.SECOND));
//		System.out.println(today.get(Calendar.MILLISECOND));
	}
	public static String tosString(Calendar date) {
		return date.get(Calendar.YEAR)+"��" +(date.get(Calendar.MONTH)+1)+"��"
				+date.get(Calendar.DATE)+"��";
		
	}
}
