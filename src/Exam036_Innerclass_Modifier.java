public class Exam036_Innerclass_Modifier {
	private int outerIv=0;
	static int outerCv =0;
	
	class IntanceInner{
		int iiv = outerIv;
		int iiv2 = outerCv;
	}
	
	static class StaticInner{
//		int siv = outerIv; //�� ����ƽ Ŭ������ �ܺ� Ŭ������ �ν��Ͻ��� �����Ҽ� ����.
		static int scv = outerCv;
	}
	
	void myMethod() {
		final int lv =0;
		final int LV=0;
		
		class LocalInner{
			int liv = outerIv;
			int liv2 = outerCv;
//			int liv3 = lv; // ��Ģ�� Error�ε�... jdk1.8���ʹ� ������ �ƴ� �� ����� ������.
			int liv4 = LV; // ok
		}
	}
}