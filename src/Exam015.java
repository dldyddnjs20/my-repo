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
		this(2,2); // this(2,2)의미는 Point(2,2) 근데 왜 this를 쓰나 코드중복 방지,this()
	}

	Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	void show_xy() {
		System.out.println("x===>"+x+", y===>"+y);// 상속할때 method도 상속되지만 변수의 경우는 메소드가 가장 가까운곳
	}
}

class Point3D1 extends Point3 {
//	int x=30,y=30;
	
	int z;
	Point3D1() {}
	Point3D1(int xa, int ya, int za) {
//		super(xa, ya); //Point() == super() 이건데 이거보다 . Point(xa,ya)==super(xa,ya)
		z = za;
	}
	void show_xy() {
		System.out.println("x===>"+x+", y===>"+y+",z====>"+z);
	}
}