public class Exam015 {
	public static void main(String[] args) {
//		Point p = new Point();
		Point3D1 p = new Point3D1();
//		System.out.println("x=" + p.x + ",y=" + p.y );
		System.out.println("x=" + p.x + ",y=" + p.y + ",z=" + p.z);
		p.show_xy();
	}
}

class Point3 {
	int x=3, y  =5;
	
	Point3() {
		this(2,2); // this(2,2)�ǹ̴� Point(2,2) �ٵ� �� this�� ���� �ڵ��ߺ� ����,this()
	}

	Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void show_xy() {
		System.out.println("x===>"+x+", y===>"+y);// ����Ҷ� method�� ��ӵ����� ������ ���� �޼ҵ尡 ���� ������
	}
}

class Point3D1 extends Point3 {
//	int x=30,y=30;
	
	int z;
	Point3D1() {}
	Point3D1(int xa, int ya, int za) {
//		super(xa, ya); //Point() == super() �̰ǵ� �̰ź��� . Point(xa,ya)==super(xa,ya)
		z = za;
	}
	void show_xy() {
		System.out.println("x===>"+x+", y===>"+y+",z====>"+z);
	}
}