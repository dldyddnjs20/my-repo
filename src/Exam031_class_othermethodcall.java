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
        System.out.println("���� ����� ���� �ý���");
    }
}

class CC implements I{
    public void method() {
        System.out.println("��� ����� ���� �ý���");
    }
}

public class Exam031_class_othermethodcall {
    public static void main(String[] args) {
        AA aa = new AA(); // �ν��Ͻ� ����
        I i =new CC
        		(); // BB(), CC() system�̶�� ���� 
        aa.method(i);
    }

}


