public class Exam035_Innerclass_scope2 {
	class InstanceInner {}
	static class StaticInner{}
	// �ν��Ͻ� �ɹ� ������ ���� ���� ������ �����ϴ�.
	InstanceInner iv = new InstanceInner();
	// ����ƽ �ɹ����� ���� ���� ������ �����ϴ�.
	StaticInner cv = new StaticInner();
	
	static void staticMethod() {
//		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		// ����� ������ ���� �������� ����... �׸��� �ܺ� Ŭ������ �ݵ�� ���� ��äȭ(�ν��Ͻ�ȭ) �ؾ� ��.
		Exam035_Innerclass_scope2 outer = new Exam035_Innerclass_scope2();
		InstanceInner obj1 = outer.new InstanceInner();
		
	}
	
	void InstanceMethod() {
		InstanceInner obj3 = new InstanceInner();
		StaticInner obj4 = new StaticInner();
		// �޼��� ���� ���������� ����� ���� Ŭ���� �ܺο��� ���� �� �� ����.
//		LocalInner lv = new LocalInner();
	}
	
	void myMethod() {
		class LocalInner{}
		LocalInner lv = new LocalInner();
	}
}