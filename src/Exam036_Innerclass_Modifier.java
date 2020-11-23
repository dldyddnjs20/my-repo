public class Exam036_Innerclass_Modifier {
	private int outerIv=0;
	static int outerCv =0;
	
	class IntanceInner{
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner{
//		int siv = outerIv; //즉 스태틱 클레스는 외부 클레스의 인스턴스에 접근할수 없다.
		static int scv = outerCv;
	}
	
	void myMethod() {
		final int lv =0;
		final int LV=0;
		
		class LocalInner{
			int liv = outerIv;
			int liv2 = outerCv;
//			int liv3 = lv; // 원칙은 Error인데... jdk1.8부터는 에러가 아님 단 상수로 인정함.
			int liv4 = LV; // ok
		}
	}
}