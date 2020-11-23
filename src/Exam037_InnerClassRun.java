class Outer2{
	class InstanceInner{
		int iv = 100;
	}
	static class StaticInner{
		int iv = 200;
		static int cv=300;
	}
	void myMethod() {
		class LocalInner{
			int iv = 400;
		}
	}
}


public class Exam037_InnerClassRun {
	public static void main(String[] args) {
		Outer2 oc = new Outer2();
		Outer2.InstanceInner ii = oc.new InstanceInner();
		
		System.out.println("ii.iv====>"+ii.iv);
		System.out.println("Outer2.StaticInner.cv=====>"+Outer2.StaticInner.cv);
		
		//스태틱은 스태틱 내부 클래스의 인스턴스는 외부 클래스를 먼저 생성하지 않아도된다.
		Outer2.StaticInner si = new Outer2.StaticInner();
		System.out.println("si.iv==>"+si.iv);
	}
}