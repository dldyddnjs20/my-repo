public class Exam035_Innerclass_scope2 {
	class InstanceInner {}
	static class StaticInner{}
	// 인스턴스 맴버 간에는 서로 직접 접근이 가능하다.
	InstanceInner iv = new InstanceInner();
	// 스태틱 맴버간에 서로 직접 접근이 가능하다.
	StaticInner cv = new StaticInner();
	
	static void staticMethod() {
//		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		// 방법은 있지만 굳이 권장하지 않음... 그리고 외부 클래스를 반드시 먼저 객채화(인스턴스화) 해야 함.
		Exam035_Innerclass_scope2 outer = new Exam035_Innerclass_scope2();
		InstanceInner obj1 = outer.new InstanceInner();
		
	}
	
	void InstanceMethod() {
		InstanceInner obj3 = new InstanceInner();
		StaticInner obj4 = new StaticInner();
		// 메서드 내에 지역적으로 선언된 내부 클래스 외부에서 접근 할 수 없다.
//		LocalInner lv = new LocalInner();
	}
	
	void myMethod() {
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}
}