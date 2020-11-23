import java.awt.Point;

class Product{
	static int count = 0;
	int seriaNo;
	{// 인스턴스를 초기화 블록 : 모든 생성자에서 공통적으로 수행
		++count;
		seriaNo = count;
	}

public Product() {}// 디폴트 생성자
}

public class Exam012_class_count_intance_num {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호"+ p1.seriaNo);
		System.out.println("p2의 제품번호"+ p2.seriaNo);
		System.out.println("p3의 제품번호"+ p3.seriaNo);
		System.out.println("생성된 인스턴스의 갯수는"+ Product.count);
	}

}
