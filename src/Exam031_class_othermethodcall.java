class AA{
    public void method(I i) {
        i.method();
    }
}

interface I {
	public void method();

}
class BB implements I{
    public void method() {
        System.out.println("저급 사양의 내부 시스템");
    }
}

class CC implements I{
    public void method() {
        System.out.println("고급 사양의 내부 시스템");
    }
}

public class Exam031_class_othermethodcall {
    public static void main(String[] args) {
        AA aa = new AA(); // 인스턴스 생성
        I i =new CC
        		(); // BB(), CC() system이라고 가정 
        aa.method(i);
    }

}


