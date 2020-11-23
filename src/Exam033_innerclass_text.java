class AAA{
	int i = 100;
	BBB b = new BBB();
	
	class BBB{
		void method() {
//			AAA a = new AAA();
			System.out.println(i);
		}
	}
}

public class Exam033_innerclass_text {
	public static void main(String[] args) {
//		BBB b = new BBB();
//		b.method();
	}

}
