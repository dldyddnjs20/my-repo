import java.util.Calendar;

public class Exam045_class {
	public static void main(String[] args) {
		String[] yoil = {"","일","월","화","수","목","금","토"};
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		Calendar date = Calendar.getInstance();
		
		date1.set(1995,9,3); // 1995년 10월 3일 셋하고 하면 월에서 -1을 해준다
		System.out.println("date1: "+tosString(date1)+yoil[date1.get(Calendar.DAY_OF_WEEK)]+"요일");
		
		date2.set(2020,10,20); // 오늘날짜로 세팅
		
		date.set(2020,10,20);
		System.out.println(tosString(date));
		date.add(Calendar.DATE, 10);
		System.out.println(tosString(date));
		
		System.out.println(tosString(date));
		date.roll(Calendar.DATE, 10); // 날짜만 변환(앞뒤 변화없음)
		System.out.println(tosString(date));
		
		long differnce = 
				(date2.getTimeInMillis()-date1.getTimeInMillis())/1000;
		System.out.println("지금까지 살아온 초입니다."+ differnce);
		System.out.println("일수: "+differnce/(24*60*60));
		System.out.println("년수: "+differnce/(24*60*60*365));
//		//날짜 표시
//		System.out.println(today.get(Calendar.YEAR)+"년");
//		System.out.println(today.get(Calendar.MONTH)+1+"월");
//		System.out.println(today.get(Calendar.DATE)+"일");
//		System.out.println(yoil[today.get(Calendar.DAY_OF_WEEK)]+"요일");
//		System.out.println(today.get(Calendar.WEEK_OF_YEAR)+"주"+"/52");
//		
//		//시간 표시
//		System.out.println(today.get(Calendar.HOUR));
//		System.out.println(today.get(Calendar.MINUTE));
//		System.out.println(today.get(Calendar.SECOND));
//		System.out.println(today.get(Calendar.MILLISECOND));
	}
	public static String tosString(Calendar date) {
		return date.get(Calendar.YEAR)+"년" +(date.get(Calendar.MONTH)+1)+"월"
				+date.get(Calendar.DATE)+"일";
		
	}
}
